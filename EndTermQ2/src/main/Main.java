package main;


import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        FileUtil fileUtil = new FileUtil();
        Student[] stus = null;
        HashMap<String, Integer> names = new HashMap<String, Integer>();
        try {
            stus = fileUtil.parseStudents("./resource/students.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Student it : stus) {
            String name = it.getName();
            if (names.containsKey(name)) {
                names.put(name, names.get(name) + 1);
            } else {
                names.put(name, 1);
            }
        }
        Iterator it = names.entrySet().iterator();
        int max = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (max < (int) entry.getValue()) {
                max = (int) entry.getValue();
            }
        }
        Iterator it1 = names.entrySet().iterator();
        while (it1.hasNext()) {
            Map.Entry entry = (Map.Entry) it1.next();
            if (max == (int) entry.getValue()) {
                System.out.println(entry.getKey()+":"+max);
            }
        }
    }
}

