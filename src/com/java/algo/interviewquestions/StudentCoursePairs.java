package com.java.algo.interviewquestions;

import java.util.*;

//You are a developer for a university. Your current project is to develop a system for students to find courses they share with friends. The university has a system for querying courses students are enrolled in, returned as a list of (ID, course) pairs.

//Write a function that takes in a list of (student ID number, course name) pairs and returns, for every pair of students, a list of all courses they share.

//Sample Input:

//student_course_pairs_1 = [
//["58", "Software Design"],
//["58", "Linear Algebra"],
//["94", "Art History"],
//["94", "Operating Systems"],
//["17", "Software Design"],
//["58", "Mechanics"],
//["58", "Economics"],
//["17", "Linear Algebra"],
//["17", "Political Science"],
//["94", "Economics"],
//["25", "Economics"],
//]

//Sample Output (pseudocode, in any order):

//find_pairs(student_course_pairs_1) =>
//{
//[58, 17]: ["Software Design", "Linear Algebra"]
//[58, 94]: ["Economics"]
//[58, 25]: ["Economics"]
//[94, 25]: ["Economics"]
//[17, 94]: []
//[17, 25]: []
//}

//Additional test cases:

//Sample Input:

//student_course_pairs_2 = [
//["42", "Software Design"],
//["0", "Advanced Mechanics"],
//["9", "Art History"],
//]

//Sample output:

//find_pairs(student_course_pairs_2) =>
//{
//[0, 42]: []
//[0, 9]: []
//[9, 42]: []
//}

public class StudentCoursePairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[][] studentCoursePairs1 = { 
				{ "58", "Software Design" }, 
				{ "58", "Linear Algebra" },
				{ "94", "Art History" }, 
				{ "94", "Operating Systems" }, 
				{ "17", "Software Design" },
				{ "58", "Mechanics" }, 
				{ "58", "Economics" }, 
				{ "17", "Linear Algebra" }, 
				{ "17", "Political Science" },
				{ "94", "Economics" }, 
				{ "25", "Economics" } };

		String[][] studentCoursePairs2 = { 
				{ "42", "Software Design" }, 
				{ "0", "Advanced Mechanics" },
				{ "9", "Art History" }, };

		new StudentCoursePairs().findStudentCoursePairs(studentCoursePairs1);
		new StudentCoursePairs().findStudentCoursePairs(studentCoursePairs2);

	}
	
	String findStudentCoursePairs(String[][] scPair) {

		Map<String, List<String>> map = new HashMap<>();
		for (int i = 0; i < scPair.length; i++) {
			List<String> cList = new ArrayList<>();
			if (map.containsKey(scPair[i][0])) {
				cList = map.get(scPair[i][0]);
				cList.add(scPair[i][1]);
			} else {
				cList.add(scPair[i][1]);
			}
			map.put(scPair[i][0], cList);
		}
		System.out.println(map);

		Map<Set<String>, List<String>> outputMap = new HashMap<>();
		for (Map.Entry<String, List<String>> e1 : map.entrySet()) {
			for (Map.Entry<String, List<String>> e2 : map.entrySet()) {
				if (!e1.getKey().equals(e2.getKey())) {
					Set<String> set = new HashSet<>();
					set.add(e1.getKey());
					set.add(e2.getKey());

					List<String> outList = new ArrayList<>();
					for (String l1 : e1.getValue()) {
						if (e2.getValue().contains(l1)) {
							outList.add(l1);
						}
					}

					outputMap.put(set, outList);
				}
			}
		}

		System.out.println(outputMap.toString());
		return outputMap.toString();
	}

}
