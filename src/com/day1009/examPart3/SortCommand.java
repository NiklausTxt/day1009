package com.day1009.examPart3;

import java.text.Collator;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class SortCommand {
	public SortCommand(String info) {
		String[] strings = new String[3];
		strings=info.split(" ");
		int len = strings.length;
		Set<Info> set;
		List<Info> list1 = Info.readFromFile("info.txt");
		if(len==1){
			set=new TreeSet<>(new IDComparator());
			for(Info e:list1){
				set.add(e);
			}
			for(Info e:set){
				System.out.println(e.toString());
			}
		}else if (len==2) {
			if("-salary".equals(strings[1])){
				set=new TreeSet<>(new salaryComparator());
				for(Info e:list1){
					set.add(e);
				}
				for(Info e:set){
					System.out.println(e.toString());
				}
			}else if("-name".equals(strings[1])){
				
				Collections.sort(list1, new Comparator<Info>() {
					@Override
					public int compare(Info o1, Info o2) {
						Collator cmp = Collator.getInstance(Locale.CHINA);
						if (cmp.compare(o1.name, o2.name) > 0) {
							return 1;
						} else if (cmp.compare(o1.name, o2.name) < 0) {
							return -1;
						}
						return 0;
					}
				});
				
				for(Info e:list1){
					System.out.println(e.toString());
				}
			}else{
				System.out.println("Ö¸Áî´íÎó");
			}
		}else{
			System.out.println("Ö¸Áî´íÎó");
		}
	}
	
	class IDComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			return o1.ID.compareTo(o2.ID);
		}

	}
	
	class salaryComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			if(o2.salary!=o1.salary){
				return o2.salary-o1.salary;
			}else{
				return o1.ID.compareTo(o2.ID);
			}
			
		}

	}
	
	class nameComparator implements Comparator<Info> {

		@Override
		public int compare(Info o1, Info o2) {
			return o1.name.compareTo(o2.name);
		}

	}
}