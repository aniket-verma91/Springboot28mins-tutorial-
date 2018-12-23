package com.in28minutes.springboot.web.model;

import java.util.ArrayList;
import java.util.List;

public class SAMPLE {
	
	void list () {
		
		List<String> lk = new ArrayList<String>();
		lk.add("R");
		lk.add("R");
		lk.add("A");
		lk.add("R");
		lk.add("R");
		
		System.out.println("===="+lk.stream().allMatch(lk.get(0)::equals));
		
		/* boolean flag = true;
		    String first = lk.get(0);

		    for (int i = 1; i< lk.size() && flag; i++)
		    {
		        if(lk.get(i) != first) flag = false;
		    }

		    System.out.println("========="+flag);*/
	}
	
public static void main(String[] args) {
	
	SAMPLE s=new  SAMPLE();
	s.list();
}
	
	
	
	
}
