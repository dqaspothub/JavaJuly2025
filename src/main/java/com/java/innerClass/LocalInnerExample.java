package com.java.innerClass;

class Outer {
    void displayMessage() {
        class Local {
            void show() {
                System.out.println("Hello from Local Inner Class");
            }
        }
        Local local = new Local();
        local.show();
    }
}

public class LocalInnerExample {
    public static void main(String[] args) {
        Outer out = new Outer();
        out.displayMessage();
    }
}
