package Rihan513;

import java.util.Scanner;

public class student {
	Scanner sc;
	int regno;
	String name,dept;
	void input() {
		sc=new Scanner(System.in);
		System.out.println("Enter regno,name,dept");
		regno=sc.nextInt();
		name=sc.next();
		dept=sc.next();
	}
	void display(){
		System.out.println("Regno is "+regno);
		System.out.println("Name is "+name);
		System.out.println("Dept is "+dept);
	}

	public static void main(String[] args) {
		student s1=new student();
		s1.input();
		s1.display();
	}

}
