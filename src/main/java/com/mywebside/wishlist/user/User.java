package com.mywebside.wishlist.user;


import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // value of id generate auto
    private Integer id;

    @Column(nullable = false, unique = true,length = 45)// realistic email in table users
    private String email;

    @Column(length = 15,nullable = false)
    private String passWord;

@Column(length =45, nullable = false,name= "first_name" )
    private String firstName;

@Column(length = 45,nullable = false,name ="wishes")
    private String wishes;
    private boolean enable;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsName) {
        this.firstName = firsName;
    }

    public String getWishes() {
        return getWishes();
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", passWord='" + passWord + '\'' +
                ", firsName='" + firstName + '\'' +
                ", wishes'" + wishes + '\'' +
                '}';
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }
}
