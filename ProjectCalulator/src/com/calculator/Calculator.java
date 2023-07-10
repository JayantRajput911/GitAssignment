package com.calculator;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
import java.lang.Math;


public class Calculator {
	public static void main(String[] args)
	{
		Calculator c=new Calculator();
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        char operator;
        System.out.println("Enter first Number");
        num1 = sc.nextInt();
        System.out.println("Enter second Number");
        num2 = sc.nextInt();
        System.out.println("Choose an operator: +, -, *, or /");
        int res;
        operator = sc.next().charAt(0);
        switch (operator) {
        // case to add two numbers
        case '+':
            int add=c.sum(num1, num2);
            System.out.println("Addition is: "+add);
            break;
 
        // case to subtract two numbers
        case '-':
        	int sub=c.subtract(num1, num2);
            System.out.println("Subtraction is "+sub);
            break;
 
        // case to multiply two numbers
        case '*':
        	int mul=c.multiply(num1, num2);
            System.out.println("Multiplication is "+mul);
            break;
 
        // case to divide two numbers
        case '/':
        	int div=c.division(num1, num2);
            System.out.println("Division is  "+div);
            break;
 
        default:
            System.out.println("You enter wrong input");
        }
 
	}
	public int sum(int a ,int b)
	{
	int result;
	result=a+b;
	return result;
	}

	public int subtract(int a ,int b)
	{
	int result;
	result=a-b;
	return result;
	}

	public int multiply(int a ,int b)
	{
	int result;
	result=a*b;
	return result;
	}

	public int division(int a ,int b)
	{
	int result;
	result=a/b;
	return result;
	}

}
