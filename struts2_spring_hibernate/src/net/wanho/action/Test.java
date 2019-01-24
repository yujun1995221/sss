package net.wanho.action;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
////        UserService userService = (UserService) applicationContext.getBean("userService");
////        System.out.println(userService);
        Integer arr[]=new Integer[8];



        UserService userService1 = new UserService();

        System.out.println();
    }
}
