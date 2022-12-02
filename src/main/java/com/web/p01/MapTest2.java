package com.web.p01;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MapTest2 {

	public static List<Integer> nums = new ArrayList<>();
	
	public static void main(String[] args) {
		Random r = new Random();
		nums.add(r.nextInt(5)+1);
		nums.add(r.nextInt(5)+1);
		nums.add(r.nextInt(5)+1);
		nums.add(r.nextInt(5)+1);
		nums.add(r.nextInt(5)+1);
		System.out.println(nums);
	}

}
