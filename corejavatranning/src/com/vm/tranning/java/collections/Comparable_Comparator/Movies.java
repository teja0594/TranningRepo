package com.vm.tranning.java.collections.Comparable_Comparator;

public class Movies  implements Comparable<Movies>{

	private String name;
	private int year;
	private int rating;
	public Movies(String name, int year, int rating) {
		super();
		this.name = name;
		this.year = year;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	@Override
	public String toString() {
		return "Movies [name=" + name + ", year=" + year + ", rating=" + rating + "]";
	}

	@Override
	public int compareTo(Movies o) {
		return this.name.compareTo(o.name);
	}
	
}
