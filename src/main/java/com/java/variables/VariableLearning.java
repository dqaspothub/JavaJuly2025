package com.java.variables;

public class VariableLearning {

    int a = 10;
    static int b = 20;

    public void addition(){

        int num1 = 10;
        int num2 = 60;
        int sum = num1+num2;

        System.out.println("The sum of two numbers " + sum);

    }

    public static void sub(){

        int num1 = 10;
        int num2 = 60;
        int sub = num1-num2;

        System.out.println("The sub of two numbers " + sub);

    }

    public static void main(String[] args) {

        VariableLearning variableLearning = new VariableLearning();

        variableLearning.addition();
        sub();

        int c = variableLearning.a;
        int f = c+b;
        System.out.println("The value is "+ f);

        }

}
