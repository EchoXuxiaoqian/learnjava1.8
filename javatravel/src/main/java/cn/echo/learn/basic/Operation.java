package cn.echo.learn.basic;

import static java.lang.Math.max;
import static java.lang.Math.pow;

public class Operation {
    enum Level {LOW,MIDDLE,HIGN,URGENT}
    public static void main(String[] args) {
        operationMethod();
        Level level = Level.URGENT;
        System.out.println(level);
    }
    public static void operationMethod() {
        System.out.println(12 + 2.3);
        System.out.println(2 - 1.1f);
        System.out.println(13 / 5);
        System.out.println(13 / 5.0);
        System.out.println(1.4f * 3.2f);
        System.out.println(13 % 5);

        int m = 1, n = 1;
        System.out.println((m++) + ":" + (++n));
        System.out.println(m + ":" + n);

        if (m == n) {
            System.out.println("m==n");
        } else {
            System.out.println("m!=n");
        }

        if (!(m == n || m != n && m == n)) {
            System.out.println("!(m==n || m!=n && m==n)");
        } else {
            System.out.println("(m==n || m!=n && m==n)");
        }

        int a=3,b=5;
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);

        System.out.println(pow(2,4));
        System.out.println(max(1,23));
    }
}
