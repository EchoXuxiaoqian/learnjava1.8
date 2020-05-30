package cn.echo.learn.basic;

public class ProcessControl {
    public static void main(String[] args) {
        ifState();
        whileState();
        forState();
        switchState();
    }

    public static void ifState() {
        int age = 20;
        if (age < 10) {
            System.out.println("Children");
        } else if (age >= 10 && age < 20) {
            System.out.println("Teenage");
        } else {
            System.out.println("Adult");
        }
    }

    public static void whileState() {
        int balance = 10;
        int goal = 100;
        int year = 0;
        while (balance < goal) {
            balance = balance + 5;
            year++;
        }
        System.out.println(year);
    }

    public static void forState() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
    }

    public static void switchState() {
        int num = 1;
        switch (num) {
            case 1:
                System.out.print("Low");
                break;
            case 2:
                System.out.print("Middle");
                break;
            case 3:
                System.out.print("High");
                break;
        }
    }
}
