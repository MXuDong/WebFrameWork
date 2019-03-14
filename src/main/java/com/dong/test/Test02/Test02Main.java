package com.dong.test.Test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Dong
 * <p>
 * Class Name : Test02Main
 * Create Time : 12:42
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class Test02Main {
    public static void main(String[] args) {
        System.out.println("Test 02 Begin");

        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\Work Space\\Others\\孟建都源码\\WebFrameWork\\src\\main\\java\\com\\dong\\test\\Test02\\Test02.xml");
        System.out.println(ac);
        System.out.println(ac.getBean("Test02People"));
    }
}
