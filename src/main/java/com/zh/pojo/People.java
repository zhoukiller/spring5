package com.zh.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class People {
    private String name;

    private Integer age;

    private String[] friends;

    private List<Integer> nums;

    private List<Cat> cats;

    private Set<Pig> pigs;

    private Map<String, User> users;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public List<Integer> getNums() {
        return nums;
    }

    public void setNums(List<Integer> nums) {
        this.nums = nums;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public Set<Pig> getPigs() {
        return pigs;
    }

    public void setPigs(Set<Pig> pigs) {
        this.pigs = pigs;
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + Arrays.toString(friends) +
                ", nums=" + nums +
                ", cats=" + cats +
                ", pigs=" + pigs +
                ", users=" + users +
                '}';
    }
}
