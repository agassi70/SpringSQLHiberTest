package com.springsqlhibertest.entity;

import javax.persistence.*;
import javax.persistence.Table;
import javax.persistence.Column;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * Created by Юрий on 28.03.2015.
 */
@Entity
@Table(name="users")
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name= "name")
    private String name;

    @Column(name= "age")
    private Integer age;

    @Column(name= "isAdmin")
    private boolean isAdmin;

    @Column(name= "createdDate")
    private Timestamp createdDate;


    public User() {
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
