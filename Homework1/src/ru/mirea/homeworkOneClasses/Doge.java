package ru.mirea.homeworkOneClasses;
import java.lang.*;

public class Doge {
    private String name;
    private int age;
    public Doge(String n, int a){
        name = n;
        age = a;
    }
    public Doge(String n){
        name = n;
        age = 0;
    }
    public Doge(){
        name = "Pup";
        age = 0;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }
    public String toString(){
        return this.name+", age "+this.age;
    }
    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}
