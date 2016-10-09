package com.day1009.examPart2;

public class Exam18 {
	public static void main(String[] args) {
		int numOf1;
		int numOf2;
		int numOf5;
		int count=0;
		for(numOf1=0;numOf1<=100;numOf1++){
			for(numOf2=0;numOf2<=50;numOf2++){
				for(numOf5=0;numOf5<=20;numOf5++){
					if((numOf1+numOf2*2+numOf5*5)==100){
						count++;
					}
				}
			}
		}
		int sum = func2();
//		System.out.println("方法1组合个数："+count);
		System.out.println("方法2组合个数："+sum);
		
	}
	public static int func2(){  
	    int number=0;  
	    for (int z=0;z<=20;z++)  
	    {  
	        number+=(100-5*z)/2+1;  
	    }  
	    return number;  
	}  
}
