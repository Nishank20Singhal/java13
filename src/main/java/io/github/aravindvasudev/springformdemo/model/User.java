package io.github.aravindvasudev.springformdemo.model;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NotNull
    @Size(min = 1, message = "is required")
    private String name;

    @Column(name = "age")
    @NotNull
    @Min(value = 10, message = "Must be > 9") @Max(value = 99, message = "Must be < 100")
    private int age;

    @Column(name = "email")
    @NotNull
    @Size(min=3, message = "is required")
    private String email;

    public User() { }

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return String.format("NAME: %s | AGE: %s | EMAIL: %s", name, age, email);
    }
}
