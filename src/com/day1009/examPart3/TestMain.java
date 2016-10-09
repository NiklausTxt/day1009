package com.day1009.examPart3;

import java.util.Scanner;

public class TestMain {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		System.out.print("������ָ�");
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
				System.out.println("����exit�����Ƴ�����");
				System.out.println("����ls [-all] [ID] ,���������ӦID����ϸ��Ϣ��-all��IDΪ��ѡ��");
				System.out.println("����find [-name|-salary] [value] ,����������ӡ[����|нˮ]Ϊ�����ļ�¼");
				System.out.println("����sort [-name|-salary] ,���������[����|нˮ]�����Ļ�����Ϣ��Ĭ��ΪID����");
				System.out.println("=============================================================================");
			}else{
				System.out.println("������������help�鿴˵��");
				
			}
			System.out.print("���룺");
			line = sc.nextLine();
		}
		
		sc.close();
	}
}
