package main;

public class Student {
    String nickName;
    int number;
    int clas;
    String profession;

    public Student(String nickName, int number, String profession) {
        this.nickName = nickName;
        this.number = number;
        this.profession = profession;
    }

    public void setClas(int clas) {
        this.clas = clas;
    }

    public String getNickName() {
        return nickName;
    }

    public int getNumber() {
        return number;
    }

    public int getClas() {
        return clas;
    }

    public String getProfession() {
        return profession;
    }
}
