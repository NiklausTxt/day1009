package com.day1009.examPart3;

import java.util.List;

public class LsCommand {
	public LsCommand(String info) {
		String[] strings = new String[3];
		strings=info.split(" ");
		int len = strings.length;
		List<Info> list1 = Info.readFromFile("info.txt");
//		List<Region> list1 = ReadInfo.Read();		
		if(len==2){
			if("-all".equals(strings[1])){
				for(Info e:list1){
//				for(Region e:list1){
					System.out.println(e.toString());
				}
			}else{
				for(Info e:list1){
//				for(Region e:list1){
					if(strings[1].equals(e.ID)){
						System.out.println(e.toString());
					}
				}
			}
		}else if(len==3){
			if("-all".equals(strings[1])){
				for(Info e:list1){
//				for(Region e:list1){
					if(strings[2].equals(e.ID) || strings[2].equals(e.subID)){
						System.out.println(e.toString());
					}
				}
			}
		}else{
			System.out.println("÷∏¡Ó”–ŒÛ");
		}
	}
}
