package com.company;

public class Pupil {

    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Study(){
        System.out.println("Study");
    }
    public void Read(){
        System.out.println("Read");
    }
    public void Write(){
        System.out.println("Write");
    }
    public void Relax(){
        System.out.println("Relax");
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "name='" + name + '\'' +
                '}' + this.getClass();
    }

    public Pupil(String name) {
        this.name = name;
    }
}
