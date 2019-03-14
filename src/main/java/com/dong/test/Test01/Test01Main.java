package com.dong.test.Test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Dong
 * <p>
 * Class Name : Test01Main
 * Create Time : 12:32
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 */

public class Test01Main {
    public static void main(String[] args) {
        System.out.println("Test");
        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\Work Space\\Others\\孟建都源码\\WebFrameWork\\src\\main\\java\\com\\dong\\test\\Test01\\Test01.xml");
        System.out.println(ac);
        System.out.println(ac.getBean("test01People"));
    }
}
