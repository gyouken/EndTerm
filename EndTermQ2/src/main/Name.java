package main;

public class Name {
    String name;
    int frequency;

    public Name(String name) {
        this.name = name;
        this.frequency = 1;
    }
    public void AddFreq(){
        this.frequency += 1;
    }
}
