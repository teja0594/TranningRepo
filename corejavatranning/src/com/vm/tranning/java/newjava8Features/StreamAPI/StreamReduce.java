package com.vm.tranning.java.newjava8Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamReduce {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(100);
	list.add(276);
	list.add(3);
	list.add(2);
	list.add(750);
	long res = list.stream().reduce(0,(A,B)->A+B);
      System.out.println(res);
}
}
