package com.dong.test.Test01;

/**
 * @author Dong
 * <p>
 * Class Name : people
 * Create Time : 12:32
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class people {
    private String peopleName;
    private int peopleAge;

    @Override
    public String toString() {
        return "people{" +
                "peopleName='" + peopleName + '\'' +
                ", peopleAge=" + peopleAge +
                '}';
    }

    public String getPeopleName() {
        return peopleName;
    }

    public void setPeopleName(String peopleName) {
        this.peopleName = peopleName;
    }

    public int getPeopleAge() {
        return peopleAge;
    }

    public void setPeopleAge(int peopleAge) {
        this.peopleAge = peopleAge;
    }
}
