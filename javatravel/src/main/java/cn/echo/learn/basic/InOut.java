package cn.echo.learn.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InOut {
    public static void main(String[] args) {
        fileIn();
        fileOut();

    }

    public static void readIn() {
        System.out.println("Please input your name:");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Welcome," + name);
    }

    public static void formatOut() {
        System.out.printf("Welcome, %s. The current year is %d", "Echo", 2020);
        String strFormatted = String.format("Welcome, %s. The current date is %d %05d", "Echo", 2020, 5);
        System.out.println(strFormatted);
    }

    public static void fileIn() {
        try {
            StringBuilder fileStrBuilder = new StringBuilder();
            File file = new File("java_travel\\src/main/resources/InOutTest.txt");
            System.out.println(file.getAbsolutePath());
            Scanner fileScan = new Scanner(file);
            while (fileScan.hasNext()){
                System.out.println(fileScan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void fileOut() {
        StringBuilder fileStrBuilder = new StringBuilder();
        File file = new File("java_travel\\src/main/resources/InOutTest.txt");
        try {
            PrintWriter fileWriter = new PrintWriter(file);
            fileWriter.write("\"1234\"");
            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
