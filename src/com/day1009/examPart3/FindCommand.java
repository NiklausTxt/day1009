package com.day1009.examPart3;

import java.util.List;

public class FindCommand {
	public FindCommand(String info) {
		String[] strings = new String[3];
		strings=info.split(" ");
		int len = strings.length;
		int flag=0;
		List<Info> list1 = Info.readFromFile("info.txt");
		if(len==3){
			if("-name".equals(strings[1])){
				flag=0;
				for(Info e:list1){
					if(e.name.contains(strings[2])){
						System.out.println(e.toString());
						flag++;
					}
				}
				if(flag==0){
					System.out.println("û�������к�"+strings[2]+"�ĵ���");					
				}
			}else if ("-salary".equals(strings[1])) {
				if(strings[2].contains("~")){
					String[] nums = strings[2].split("~");
					
					int begin = Integer.parseInt(nums[0]);
					int end = Integer.parseInt(nums[1]);
					flag=0;
					
					for(Info e:list1){
						if(e.salary>=begin && e.salary<=end){
							System.out.println(e.toString());
							flag++;
						}
					}
					if(flag==0){
						System.out.println("û��ƽ�����볬��"+begin+"~"+end+"�ĵ���");
					}
				}else{
					flag=0;
					for(Info e:list1){
						if(e.salary>=Integer.parseInt(strings[2])){
							System.out.println(e.toString());
							flag++;
						}
					}
					if(flag==0){
						System.out.println("û��ƽ�����볬��"+strings[2]+"�ĵ���");
					}
				}
				
				
			}else{
				System.out.println("ָ������");
			}
		}else{
			System.out.println("ָ������");
		}
	}
}
