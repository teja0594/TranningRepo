package com.vm.tranning.java.collections.Comparable_Comparator;

import java.util.Comparator;

public class YearComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		if(o1.getYear()>o2.getYear())
		return 1;
		else
			return -1;
	}

}
