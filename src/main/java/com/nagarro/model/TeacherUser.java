package com.nagarro.model;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacherUser")
public class TeacherUser {
    @Id
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TeacherUser(String username, String password) {
        super();
        this.username = username;
        this.password=password;
    }

    public TeacherUser() {
    }
}
