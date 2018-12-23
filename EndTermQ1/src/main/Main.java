package main;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Student[] stus = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input StudentID:");
        String stuid = sc.nextLine();
        try {
            stus = fileUtil.parseStudents("./resource/students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student it : stus) {
            if (it.getStuid().equals(stuid)) {
                System.out.println(it.getName() + " " + it.getStuid());
                return;
            }
        }
        System.out.println("该学生不存在");
    }
}