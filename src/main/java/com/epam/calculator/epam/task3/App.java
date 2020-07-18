package com.epam.calculator.epam.task3;
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter no of operations");
    	int n=sc.nextInt();
    	
    	for(int i=0;i<n;i++) {
    		new Calculator();
    	}
    	System.out.println("exited");
    }
}
