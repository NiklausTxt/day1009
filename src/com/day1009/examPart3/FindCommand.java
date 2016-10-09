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
					System.out.println("没有名字中含"+strings[2]+"的地区");					
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
						System.out.println("没有平均收入超过"+begin+"~"+end+"的地区");
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
						System.out.println("没有平均收入超过"+strings[2]+"的地区");
					}
				}
				
				
			}else{
				System.out.println("指令有误！");
			}
		}else{
			System.out.println("指令有误！");
		}
	}
}
