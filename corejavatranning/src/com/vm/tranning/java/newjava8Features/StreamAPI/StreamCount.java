package com.vm.tranning.java.newjava8Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamCount {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(100);
	list.add(276);
	list.add(3);
	list.add(2);
	list.add(999);
	list.add(750);
	long count = list.stream().count();
     System.out.println(count);
}
}
