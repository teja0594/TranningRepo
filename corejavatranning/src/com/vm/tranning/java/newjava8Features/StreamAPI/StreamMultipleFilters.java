package com.vm.tranning.java.newjava8Features.StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMultipleFilters {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(1);
	list.add(100);
	list.add(276);
	list.add(3);
	list.add(2);
	list.add(999);
	list.add(750);
	List<Integer> lisf = list.stream().filter(p->p<500).filter(p->p<300).collect(Collectors.toList());
      lisf.forEach(p->System.out.print(p+" "));
}
}
