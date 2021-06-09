package com.vm.tranning.java.strings;

public class StringBufferMethods {
public static void main(String[] args) {
	String s ="Value Momentum";
	StringBuffer sb= new StringBuffer(s);
	System.out.println(sb.charAt(0));
	
	System.out.println(sb.append("haii"));
    System.out.println(sb.charAt(0));
    System.out.println(sb.equals("Value Momentum"));
    
    System.out.println(sb.length());
}
}
