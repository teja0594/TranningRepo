package com.vm.tranning.java.strings;

public class StringBuilderMethods {
public static void main(String[] args) {
	String s ="Value Momentum";
	StringBuilder sb= new StringBuilder(s);
	System.out.println(sb.charAt(0));
	
	System.out.println(sb.append("haii"));
    System.out.println(sb.charAt(0));
    System.out.println(sb.equals("Value Momentum"));
   
    System.out.println(sb.length());
}
}
