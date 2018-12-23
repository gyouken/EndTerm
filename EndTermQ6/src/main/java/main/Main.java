package main;


import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("../resources/微信数据.xls");
        System.out.println(file.exists());
    }
}
