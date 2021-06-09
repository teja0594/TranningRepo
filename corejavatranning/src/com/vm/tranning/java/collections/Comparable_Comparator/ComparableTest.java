package com.vm.tranning.java.collections.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableTest {
public static void main(String[] args) {
	List<Movies> movies = new ArrayList<Movies>();
	movies.add(new Movies("Empire Strike Back", 1973, 4));
	movies.add(new Movies("Jedi Returns", 2001, 3));
	movies.add(new Movies("Clone Wars", 1972, 5));
	Collections.sort(movies);
	movies.forEach(p->System.out.println(p));
	
}
}
