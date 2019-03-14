package com.dong.test.Test02;

/**
 * @author Dong
 * <p>
 * Class Name : People
 * Create Time : 12:39
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class People {
    private String peopleName;
    private int peopleAge;

    @Override
    public String toString() {
        return "People{" +
                "peopleName='" + peopleName + '\'' +
                ", peopleAge=" + peopleAge +
                '}';
    }

    public int getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(int peopleAge) {
        this.peopleAge = peopleAge;
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }
}
