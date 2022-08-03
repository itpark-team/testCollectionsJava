package com.company;

import java.util.Objects;

public class Man {
    private int id;
    private int age;
    private String name;


    public Man(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Man{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Man man = (Man) o;
        return id == man.id && age == man.age && name.equals(man.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, age, name);
    }
}
