package com.hand.zyx;
import java.util.*;
public class Exam3 {

	public static void main(String[] args) {
	     int year=0;
	     int month=0;
	     int day=0;
	     int days = 0;
	     int d = 0;
	     int e;
	     char y[]=new char[4];
	     char m[]=new char[2];
	     char d1[]=new char[2];
	     char k[]=new char[2];
	     String a=new String();
	     System.out.println("请输入日期：");
	     do {
	     e = 0;

	     Scanner s = new Scanner(System.in);
	     a = s.nextLine();
	     
	     if(a.length()!=10){
	    	 System.out.println("输入错误，请重新输入！");
	    	 e=1 ; 
	     }
	     else{
	    	 a.getChars(0, 4, y, 0);
		     a.getChars(5, 7, m, 0);
		     a.getChars(8, 10, d1, 0);
		     a.getChars(4, 5, k, 0);
		     a.getChars(7, 8, k, 1);
		     year=Integer.valueOf(String.valueOf(y));
		     month=Integer.valueOf(String.valueOf(m));
		     day=Integer.valueOf(String.valueOf(d1));
		     if (year < 0 || month < 0 || month > 12 || day < 0 || day > 31||k[0]!='-'||k[1]!='-'||y.length!=4||m.length!=2||d1.length!=2) {
			     System.out.println("输入错误，请重新输入！");
			     e=1 ; 
			     }
	     }
	    
	     }while( e==1);
	      for (int i=1; i <month; i++) {
	      switch (i) {
	      case 1:
	      case 3:
	      case 5:
	      case 7:
	      case 8:
	      case 10:
	      case 12:
	       days = 31;
	      break;
	      case 4:
	      case 6:
	      case 9:
	      case 11:
	       days = 30;
	      break;
	      case 2:
	       if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
	        days = 29;
	       } else {
	        days = 28;
	       }
	       break;
	      }
	      d += days;
	      }
	     System.out.println("你输入的日期为当年的第" + (d+day) + "天");
	     
	}
	}

