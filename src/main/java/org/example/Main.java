package org.example;

public class Main {
    public static void main(String[] args) {

        Example example1 = new Example();
        Example example2 = new Example();
        Example example3 = new Example();

        System.out.println("-----");
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);

        Example.incrementTotalCount();
        example1.incrementInstanceCount();
        example2.incrementInstanceCount();
        example2.incrementInstanceCount();
        example3.incrementInstanceCount();
        example3.incrementInstanceCount();
        example3.incrementInstanceCount();
        System.out.println("-----");
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);

        Example.incrementTotalCount();
        example1.incrementInstanceCount();
        example2.incrementInstanceCount();
        example2.incrementInstanceCount();
        example3.incrementInstanceCount();
        example3.incrementInstanceCount();
        example3.incrementInstanceCount();
        System.out.println("-----");
        System.out.println(example1);
        System.out.println(example2);
        System.out.println(example3);

        System.out.println("-----");
        System.out.println("Calculator");

        int result;
        result = Calculator.add(60,20);
        System.out.println(result);
        result = Calculator.subtraction(60,20);
        System.out.println(result);
        result = Calculator.multiplication(60,20);
        System.out.println(result);
        result = Calculator.division(60,20);
        System.out.println(result);
    }
}