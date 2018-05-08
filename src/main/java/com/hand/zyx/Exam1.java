package com.hand.zyx;

import java.util.ArrayList;
import java.util.List;

public class Exam1 {
		public static void main(String[] args) {
		    int count = 0;
		    List<Integer> l=new ArrayList<Integer>();
		    for(int i=101; i<200; i+=2) {
		     boolean b = false;
		     for(int j=2; j<=Math.sqrt(i); j++) {
		        if(i % j == 0){
		        	b = false;
		        	break; 
		        	} 
		         else{
		        	 b = true; 
		        	 }
		     }
		        if(b == true) {
		        	count ++;
		        	l.add(i);
		        	}
		                                  }
		    System.out.print( "101-200间总共有" + count+"个素数分别是：");
		    for (int i = 0; i < l.size()-1; i++) {
				System.out.print(l.get(i)+",");
			}
		}
}
