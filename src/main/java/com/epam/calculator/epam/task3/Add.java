package com.epam.calculator.epam.task3;

public class Add{
	int a,b;
	Add(int a,int b){
		this.a=a;
		this.b=b;
	}
	void add() {
		System.out.println(a+"+"+b+"="+(a+b));
	}
}