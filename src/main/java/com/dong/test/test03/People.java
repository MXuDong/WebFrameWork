package com.dong.test.test03;

/**
 * @author Dong
 * <p>
 * Class Name : People
 * Create Time : 12:48
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class People {
    private String name;

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
