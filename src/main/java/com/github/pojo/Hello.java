package com.github.pojo;

public class Hello {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("你是"+name);
    }
}
