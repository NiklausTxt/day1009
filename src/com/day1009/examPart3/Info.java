package com.day1009.examPart3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Info {
	String ID;
	String name;
	int salary;
	String subID;
	String boss;
	public Info(String iD, String name, int salary, String subID, String boss) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		this.subID = subID;
		this.boss = boss;
	}
	public Info() {
	}
	public static List<Info> readFromFile(String fileName){
		File file = new File(fileName);
		BufferedReader bReader = null ;
		List<Info> list =new ArrayList<>();
		try {
			bReader = new BufferedReader(new FileReader(file));
			String line = bReader.readLine();
			while(line!=null){
				String s = line.charAt(0)+"";
				String[] strings=new String[5];
				if(!"#".equals(s)){
					strings=line.split(",");
//					System.out.println(strings[1]);
					Info examTest = new Info();
					examTest.ID=strings[0];
					examTest.name=strings[1];
					examTest.salary=Integer.parseInt(strings[2]);
					examTest.subID=strings[3];
					examTest.boss=strings[4];
					list.add(examTest);
				}
				line = bReader.readLine();
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally{
			if(bReader!=null){
				try {
					bReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	@Override
	public String toString() {
		return "地区："+ID + "  \t名字：" + name + "\t平均收入：" + salary + "\t所属地区：" + subID + "\t老大:" + boss;
	}
	
}

