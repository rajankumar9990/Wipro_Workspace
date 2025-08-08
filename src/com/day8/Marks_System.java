package com.day8;
import java.util.ArrayList;

public class Marks_System {
	public static void main(String[] args) {
		ArrayList<Integer> marks=new ArrayList<>();  //storing marks
		marks.add(85);  
		marks.add(60);
		marks.add(90);
		marks.add(99);
		
		int total=0;
		
		for(int i=0;i<marks.size();i++) {
			int m=marks.get(i);
			total+=m;
		}
		double average=(double)total/marks.size();
		System.out.println("Marks : "+marks);
		System.out.println("Total Marks : "+total);
		System.out.println("Average : "+average);
	}

}
