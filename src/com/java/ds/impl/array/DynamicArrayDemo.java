package com.java.ds.impl.array;

public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray<String> dynamicArrayVar = new DynamicArray<String>();
		dynamicArrayVar.add("Kunal");
		System.out.println(dynamicArrayVar.getSize());
		dynamicArrayVar.add("Shruti");
		System.out.println(dynamicArrayVar.getSize());
		dynamicArrayVar.add("Vihaan");
		System.out.println(dynamicArrayVar.getSize());
		dynamicArrayVar.add("Danville");
		System.out.println(dynamicArrayVar.getSize());
		dynamicArrayVar.add("July4");
		System.out.println(dynamicArrayVar.getSize());
	}

}
