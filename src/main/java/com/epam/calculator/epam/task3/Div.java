package com.epam.calculator.epam.task3;

public class Div{
	int a,b;
Div(int a,int b){
		this.a=a;
		this.b=b;
	}
	void div() {
		if(b==0) {
			System.out.println("Value 2 cannot be zero");
		}
		else {
		System.out.println(a+"/"+b+"="+(a/b));
		}
	}
}
