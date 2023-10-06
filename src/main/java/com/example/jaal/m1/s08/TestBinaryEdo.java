package com.example.jaal.m1.s08;

public class TestBinaryEdo {
	
	public static boolean Binary(int[] v, int x) {
		
		int left = 0;
		int right = v.length - 1;
		
		while(left <= right) {
			int current = left + (right - left) / 2;
			if(x == v[current])
				return true;
			else if(v[current] > x){
				right = current - 1;
			} else {
				left = current + 1;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] values = {1,5,7,12,21,33};
		int target = 33;
		
		System.out.println(Binary(values, target) ? "Yes" : "No");
		
	}
}
