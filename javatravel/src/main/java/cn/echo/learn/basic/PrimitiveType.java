package cn.echo.learn.basic;

public class PrimitiveType {

    public static final float PI = 3.14f;

    public static void main(String[] args) {
        integerMethod();
    }

    public static void integerMethod() {
        float aFloat = 0.11f;
        double aDouble = 0.11;
        System.out.println(aFloat);
        System.out.println(aDouble);
    }

    public static void floatMethod() {
        byte aByte = 0;
        short aShort = 0;
        int anInt = 0;
        long aLong = 0;
        System.out.println(aByte);
        System.out.println(aShort);
        System.out.println(anInt);
        System.out.println(aLong);
    }

    public static void charMethod() {
        char aChar = 'a';
    }

    public static void booleanMethod() {
        boolean aBoolean = true;
    }


}
