package com.dong.test.test03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author Dong
 * <p>
 * Class Name : Test03Main
 * Create Time : 12:50
 * Create Date : 2019/3/14
 * Project : WebFrameWork
 * aim : 依赖注入
 */

public class Test03Main {
    public static void main(String[] args) {
        System.out.println("Test 03 Begin");

        ApplicationContext ac = new FileSystemXmlApplicationContext("E:\\Work Space\\Others\\孟建都源码\\WebFrameWork\\src\\main\\java\\com\\dong\\test\\test03\\Test03.xml");
        System.out.println(ac);
        System.out.println(ac.getBean("Test03People"));
        System.out.println(ac.getBean("Test03Student"));
    }
}
