package com.day1009.examPart3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadInfo {
	public static List<Region> Read() {
		List<Region> list = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader("info.txt"));
			String line;
			while((line=reader.readLine())!=null){
				Region region = transLine(line);
				list.add(region);
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static Region transLine(String line){
		Region region = new Region();
		String[] str = line.split(" ");
		region.setID(str[0]);
		region.setName(str[1]);
		region.setSalary(Integer.parseInt(str[2]));
		region.setSuperID(str[4]);
		String boss = str.length==5?str[4]:"";
		region.setBoss(boss);
		return region;
	}
}
