package com.dong.test.test03;

/**
 * @author Dong
 * <p>
 * Class Name : Student
 * Create Time : 12:48
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class Student {
    private People father;
    private String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "father=" + father +
                ", studentName='" + studentName + '\'' +
                '}';
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public People getFather() {
        return father;
    }

    public void setFather(People father) {
        this.father = father;
    }


}
