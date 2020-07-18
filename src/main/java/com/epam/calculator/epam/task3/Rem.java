package com.epam.calculator.epam.task3;

public class Rem {
	int a,b;
	Rem(int a,int b){
			this.a=a;
			this.b=b;
		}
		void rem() {
			if(b==0) {
				System.out.println("Value 2 cannot be zero");
			}
			else {
			System.out.println(a+"%"+b+"="+(a%b));
			}
		}
}
