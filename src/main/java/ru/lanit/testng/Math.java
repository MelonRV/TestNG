package ru.lanit.testng;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Math {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите первое число");
        double a = Double.parseDouble(reader.readLine());
        System.out.println("Введите второе число");
        double b = Double.parseDouble(reader.readLine());
        System.out.println("Введите действие: + , - , *  или /");
        String action = reader.readLine();
        if (action.equals("+")){
            System.out.println(new Math().sum(a,b));
        }
        else if (action.equals("-")){
            System.out.println(new Math().sub(a,b));
        }
        else if (action.equals("*")){
            System.out.println(new Math().multi(a,b));
        }
        else if(action.equals("/")){
            System.out.println(new Math().div(a,b));
        }
        else System.out.println("Введеное действие не корректно");
        }

    public double sum(double a, double b) {

        return a + b;
    }

    public double sub(double a, double b) {

        return a - b;
    }

    public double multi(double a, double b) {

        return a * b;
    }

    public double div(double a, double b) {

        return a / b;
    }

}
