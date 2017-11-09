package oop.example5;

public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();

        System.out.println(myClass.defaultField);       // будет работать
        System.out.println(myClass.publicField);        // будет работать
        // System.out.println(myClass.privateField);    // работать не будет
    }
}
