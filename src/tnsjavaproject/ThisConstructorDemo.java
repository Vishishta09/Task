package tnsjavaproject;

class Studente {

    String name;
    int age;

    Studente() {
        this("Rahul", 20);
        System.out.println("Default constructor called");
    }

    Studente(String name, int age) {
        this.name = name;
        this.age = age;

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class ThisConstructorDemo {

    public static void main(String[] args) {

       new Studente();
        
    }
}

