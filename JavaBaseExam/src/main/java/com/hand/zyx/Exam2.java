package com.hand.zyx;

import java.util.Scanner;

public class Exam2 {
	public static void main(String[] args) {
		System.out.print("请输入工资：");
		Scanner s1=new Scanner(System.in);
		float a=s1.nextFloat();
		float y=0;
		if(a>3500&a<=4500){
			y=(float) (45+(a-3500)*0.1);
		}
		else if(a>4500&a<=9000){
			y=(float) (45+300+(a-4500)*0.2);
		}
		else if(a>9000&a<=35000){
			y=(float) (45+300+900+(a-9000)*0.25);
		}
		else if(a>35000&a<=55000){
			y=(float) (45+300+900+6500+(a-35000)*0.3);
		}
		else if(a>55000&a<=80000){
			y=(float) (45+300+900+6500+6000+(a-55000)*0.35);
		}
		else if(a>80000){
			y=(float) (45+300+900+6500+6000+8750+(a-80000)*0.45);
		}
		System.out.println("所需缴纳的税费为："+y);
	}
	
}
