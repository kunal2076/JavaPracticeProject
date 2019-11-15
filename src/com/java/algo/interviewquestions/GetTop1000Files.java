package com.java.algo.interviewquestions;

import java.util.*;

//Given a Linux laptop with 40M files, how do you find the top 1000 files with biggest size? 
//Files are spread across multiple nested directories

//listDirectory(string: path_to_directory): returns a list of all files in the given directory
//isFile(string: file_path): returns a boolean indicating whether or not the given path is a file
//getSize(string: file_path): returns the integer size of a file in bytes


public class GetTop1000Files {
	
	List<String> listDirectory(String directory) {
		return new ArrayList<>();
	}
	
	boolean isFile(String name) {
		return true;
	}
	
	int getSize(String name) {
		return 1;
	}
	
	SortedSet<String> set = new TreeSet<String>();
	
	List<String> getTop1000Files(String directory) {
		
		List<String> filesList = listDirectory(directory);
		if(filesList != null && filesList.size()>0) {
			for(String name : filesList) {
				if(isFile(name)) {
					int size = getSize(name);
					if(set.size() <= 1000) {
						set.add(directory + "/" + name);
					}
					else {
						String smallestFileInSet = Collections.min(set);
						if(size > getSize(smallestFileInSet)) {
							set.remove(smallestFileInSet);
							set.add(directory + "/" + name);
						}
					}
				}
				else {
					getTop1000Files(name);
				}
			}
		}
		return new ArrayList<String>(set);
	}
}
