package com.epam.calculator.epam.task3;

import java.util.Scanner;

public class Calculator{
	int a,b;
	String c;
	Scanner sc=new Scanner(System.in);
	Calculator(){
		System.out.println("Enter operator,Vlaue 1 ,Value 2");
		c=sc.next();
		a=sc.nextInt();
		b=sc.nextInt();
		switch(c){
		case "+": Add A=new Add(a,b);
					A.add();
					break;
		case "-": Sub S=new Sub(a,b);
					S.sub();
					break;
		case "*":Mul M=new Mul(a,b);
					M.mul();
					break;
		case "/":Div D=new Div(a,b);
					D.div();
					break;
		case "%": Rem R=new Rem(a,b);
					R.rem();
					break;
		default: System.out.println("Invalid Operator");
		}
	}
}