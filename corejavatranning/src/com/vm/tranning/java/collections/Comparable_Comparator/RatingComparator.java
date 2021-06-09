package com.vm.tranning.java.collections.Comparable_Comparator;

import java.util.Comparator;

public class RatingComparator implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		if(o2.getRating()>o1.getRating())
		return 1;
		else
			return -1;
	}

}
