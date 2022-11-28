package com.bridgelabz.logicalprogramming;
//adding the last two digits to get the next digit
//0,1,2,3,= 0,1,1,2,3,5
import java.util.Scanner;
public class FibanocciSeries {
	void display() {
	int term, a=0, b=1, c;
	System.out.println("Enter the number");
	Scanner r = new Scanner(System.in);
	term=r.nextInt();
	for(int i =1; i<=term; i++) {
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
}
	public static void main(String[] args) {
		FibanocciSeries series = new FibanocciSeries();
		series.display();
	}

}
