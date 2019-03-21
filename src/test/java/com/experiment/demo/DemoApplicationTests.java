package com.experiment.demo;

import org.junit.Test;
import org.omg.PortableServer.ThreadPolicyOperations;


import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;


public class DemoApplicationTests {


    //线程 以及lombda 表达式使用

    @Test
    public void TreadTest() {
        new Thread(() -> System.out.println("这是一个线程")).start();
        Runnable runnable = () -> System.out.println("这是一个线程");
        runnable.run();
        Thread3 threadOne = new Thread3();
        Thread3 threadTwo = new Thread3();
        threadOne.count();
        threadTwo.count();
    }

    @Test
    public void contextLoads() {
        String s = String.valueOf(3);
        List<String> list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            //可以调用局部变量
            list.add(i + s);
        }
        list.sort((String e1, String e2) -> e2.compareTo(e1));
        list.forEach(System.out::println);

    }

    @Test
    public void testBase64() {
        final String text = "就是要测试加解密！！abjdkhdkuasu!!@@@@";
        String encoded = Base64.getEncoder()
                .encodeToString(text.getBytes(StandardCharsets.UTF_8));
        System.out.println("加密后=" + encoded);

        final String decoded = new String(
                Base64.getDecoder().decode(encoded),
                StandardCharsets.UTF_8);
        System.out.println("解密后=" + decoded);
    }


}

class Thread3 extends Thread {
    @Override
    public void run() {
        System.out.println("这是一个线程");
    }

    public synchronized static void count() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}

class Runnable3 implements Runnable {

    @Override
    public void run() {

    }
}