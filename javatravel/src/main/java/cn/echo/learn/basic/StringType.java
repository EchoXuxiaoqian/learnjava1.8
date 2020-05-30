package cn.echo.learn.basic;

public class StringType {
    public static void main(String[] args) {
        String javaStr = "hello, java\u2122";
        System.out.println(javaStr);

        System.out.println(javaStr.substring(1));
        System.out.println(javaStr.substring(1, 4));

        System.out.println("My age is:" + 18);

        String helloStr = "Hello";
        System.out.println(helloStr.equals("hello"));
        System.out.println(helloStr.equalsIgnoreCase("hello"));

        System.out.println(isNotNullAndEmpty(null));
        System.out.println(isNotNullAndEmpty(""));
        System.out.println(isNotNullAndEmpty("a"));

        commonStringMethod();

        buildString();
    }

    public static boolean isNotNullAndEmpty(String str) {
        return (str != null && str.length() != 0);
    }

    public static void commonStringMethod(){
        System.out.println("123".endsWith("23"));
        System.out.println("12134".indexOf("234"));
        System.out.println("dewe2323".length());
        System.out.println("1231".replaceAll("1","a"));
        System.out.println("asadDsWE".toLowerCase()+":"+"RYWgdah".toUpperCase());
        System.out.println(" 223 23   ".trim());
    }

    public static void buildString(){
        StringBuilder strBuilder = new StringBuilder(); // TODO 线程不安全，单线程的情况下使用
        strBuilder.append("123");
        strBuilder.append("abc".toUpperCase());
        strBuilder.insert(3,"vvv");
        System.out.println(strBuilder.length());
        System.out.println(strBuilder.toString());

        StringBuffer strBuffer = new StringBuffer();    // 线程安全，多线程的情况下使用
        strBuffer.append("1212");
        strBuffer.append("abc".toUpperCase());
        strBuffer.delete(2,4);
        System.out.println(strBuffer.toString());
    }
}
