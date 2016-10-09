package com.day1009.examPart3;

import java.util.Scanner;

public class TestMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("请输入指令：");
		Scanner sc = new Scanner(System.in);
		String line =sc.nextLine();
		
		while(!"exit".equals(line)){
			String[] strings = line.split(" ");
			if("ls".equals(strings[0])){
				LsCommand lsInfo = new LsCommand(line);
			}else if("find".equals(strings[0])){
				FindCommand findInfo = new FindCommand(line);
			}else if("sort".equals(strings[0])){
				SortCommand sortInfo = new SortCommand(line);
			}else if("help".equals(strings[0])){
				System.out.println("============================================================================");
				System.out.println("输入exit可以推出程序");
				System.out.println("输入ls [-all] [ID] ,可以输出对应ID的详细信息，-all和ID为可选项");
				System.out.println("输入find [-name|-salary] [value] ,可以搜索打印[名字|薪水]为条件的记录");
				System.out.println("输入sort [-name|-salary] ,可以输出按[名字|薪水]排序后的基本信息，默认为ID排序");
				System.out.println("=============================================================================");
			}else{
				System.out.println("输入有误，输入help查看说明");
				
			}
			System.out.print("输入：");
			line = sc.nextLine();
		}
		
		sc.close();
	}
}
