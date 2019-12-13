package com.java.ds.impl.hashing;

public class HashTableArray<T> {
	
	Entry[] hashArray;
	int size;

	public HashTableArray(int size) {
		this.size = size;
		hashArray = new Entry[size];
		for(int i=0; i<size; i++) {
			hashArray[i] = new Entry();
		}
	}
	
	int getHashValue(int key) {
		return key%size;
	}
	
	public void put(int key, Object value) {
		int hashValue = getHashValue(key);
		Entry arrayValue = hashArray[hashValue];
		Entry itemToAdd = new Entry(key, value);
		itemToAdd.next = arrayValue.next;
		arrayValue.next = itemToAdd;
	}
	
	public T get(int key) {
		T value = null;
		int hashValue = getHashValue(key);
		Entry arrayValue = hashArray[hashValue];
		while(arrayValue != null) {
			if(arrayValue.getKey()==key) {
				value = (T) arrayValue.getValue();
				break;
			}
			arrayValue = arrayValue.next;
		}
		
		return value;
	}

}
