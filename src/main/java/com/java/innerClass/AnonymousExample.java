package com.java.innerClass;


interface Greeting {

    void sayHello();
}

public class AnonymousExample {
    public static void main(String[] args) {

        Greeting g = new Greeting(){

            public void sayHello() {
                System.out.println("Hello from Anonymous Inner Class");
            }
        };
        g.sayHello();
    }
}
