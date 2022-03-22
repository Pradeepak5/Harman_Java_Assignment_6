package com.harman.Java_Assignment6;

import java.util.Scanner;

class Addition extends Thread{
	int x,y;
	public Addition(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Addition :"+(x+y));
	}
}
class Subtraction extends Thread{
	int x,y;
	public Subtraction(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Subtraction :"+(x-y));
	}
}
class Multiplication extends Thread{
	int x,y;
	public Multiplication(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Multiplication :"+(x*y));
	}
}
class Division extends Thread{
	int x,y;
	public Division(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void run() {
		System.out.println("Division :"+(x/y));
	}
}
public class Calculator {
	public static void main(String args[]) {
		int a,b;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter num 1 :");
		a=s.nextInt();
		System.out.println("Enter num 1 :");
		b=s.nextInt();
		Addition add=new Addition(a,b);
		Subtraction sub=new Subtraction(a,b);
		Multiplication mul=new Multiplication(a,b);
		Division div=new Division(a,b);
		
		add.start();
		sub.start();
		mul.start();
		div.start();
	}

}

