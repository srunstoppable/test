package com.experiment.demo;

import org.junit.Test;

/**
 * @author s r
 * @date 2019/1/15
 */
public class DemoTest {


    @Test
    public void count() {
        StringBuilder s = new StringBuilder("Dkjk12kj234 43kjf$jjj%$00 KL");
        char[] a = s.toString().toCharArray();
        int Acount = 0;
        int Bount = 0;
        int trimCount = 0;
        int elseCount = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 48 && a[i] <= 57) {
                Bount++;
            } else if ((a[i] >= 91 && a[i] <= 122) || (a[i] >= 65 && a[i] <= 90)) {
                Acount++;
            } else if (a[i] == 32) {
                trimCount++;
            } else {
                elseCount++;
            }
        }
        System.out.println(Acount + "," + Bount + "," + trimCount + "," + elseCount);
    }

}
