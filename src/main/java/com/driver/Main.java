package com.driver;

public class Main {
    public static void main(String[] args) {
        B b = new B();

        System.out.println(b.meth());

        B b2 = new B();

        System.out.println(b2.meth());

    }

    public static class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }

    public static class B extends A{
        public String meth(){
            return "Method is overriden in Extended class B";
        }
    }
}