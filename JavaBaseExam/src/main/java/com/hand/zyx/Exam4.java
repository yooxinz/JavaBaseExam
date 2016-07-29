package com.hand.zyx;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class Exam4 {
	public static void main(String[] args) {
		 createNumberMap();
	}
	
	 public static void createNumberMap(){
	        Random random = new Random();
	        List<Integer> numbers = new ArrayList<Integer>();
	        for(int i=0; i<50; i++){

	            numbers.add(random.nextInt(100));
	        }
	        System.out.print("随机生成50个小于100的数，分别为：");
	        for(int i=0; i<numbers.size(); i++){

	            System.out.print(numbers.get(i)+",");
	        }
	        System.out.print("");

	        Map<Integer,ArrayList<Integer>>  map = new TreeMap<Integer,ArrayList<Integer>>();
	        for(int i=0; i<numbers.size(); i++){
	            int number = numbers.get(i);
	            int result = number/10;

	            if(map.containsKey(result)){
	                map.get(result).add(number);
	            }else{
	                ArrayList<Integer> list = new ArrayList<Integer>();
	                list.add(number);
	                map.put(result, list);
	            }
	        }
	        System.out.println();
	        Set<Integer> keySet = map.keySet();
	        Iterator<Integer> iter = keySet.iterator();

	        System.out.print("Map中的数据为：");
	        while(iter.hasNext()){
	            int key = iter.next();
	            System.out.print(key+"[");
	            ArrayList<Integer> list = map.get(key);
	            for(int i=0; i<list.size();i++){
	                if(i==(list.size()-1)){
	                    System.out.print(list.get(i)+"]");
	                }else{
	                    System.out.print(list.get(i)+",");
	                }

	            }

	            sort(list);
	        }

	        System.out.println();
	        Iterator<Integer> iter2 = keySet.iterator();
	        System.out.print("排序后的Map:");
	        while(iter2.hasNext()){
	            int key = iter2.next();
	            System.out.print(key+"[");
	            ArrayList<Integer> list = map.get(key);
	            for(int i=0; i<list.size();i++){
	                if(i==(list.size()-1)){
	                    System.out.print(list.get(i)+"]");
	                }else{
	                    System.out.print(list.get(i)+",");
	                }

	            }

	            sort(list);
	        }


	    }

	    public static void sort(ArrayList<Integer> list){
	        for(int i=0; i<(list.size()-1);i++){
	            for(int j=(i+1); j<list.size(); j++){
	                int num1 = list.get(i);
	                int num2 =list.get(j);
	                if(num1>num2){
	                    int temp = num1;
	                    list.set(i, num2);
	                    list.set(j, temp);
	                }
	            }
	        }

	    }

}
