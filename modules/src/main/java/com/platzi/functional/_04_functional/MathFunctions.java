package com.platzi.functional._04_functional;

import java.util.function.Function;
import java.util.function.Predicate;

public class MathFunctions {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };
        System.out.println(squareFunction.apply(5));
        System.out.println(squareFunction.apply(25));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;

        Predicate<Integer> isEven = x -> x % 2 == 0;

        isEven.test(4);//TRUE

        Predicate<Student> isApproved = student -> student.getCalification() > 6.0;
        Student sinuhe = new Student("Sinuhe", 6.9);
        System.out.println(isApproved.test(sinuhe));

    }

    static class Student{
        private String name;
        private double calification;

        public Student(String name, double calification) {
            this.name = name;
            this.calification = calification;
        }

        public String getName() {
            return name;
        }

        public double getCalification() {
            return calification;
        }
    }
}

