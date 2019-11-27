package com.java.core.serialization;

import java.io.IOException;

public class SerializationTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Employee emp = new Employee("Alex", 123, "Dev", 35000, "staticVar");
		
		SerializationUtil sUtil = new SerializationUtil();
		sUtil.serialize(emp, "/Users/y746344/setup/JavaPracticeProject/src/com/java/core/serialization/employee.dat");
		
		Employee emp2 = (Employee) sUtil.deserialize("/Users/y746344/setup/JavaPracticeProject/src/com/java/core/serialization/employee.dat");
		System.out.println(emp2.toString());

	}

}
