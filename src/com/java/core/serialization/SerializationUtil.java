package com.java.core.serialization;

import java.io.*;

public class SerializationUtil {
	
	public void serialize(Object obj, String filename) throws IOException {
			FileOutputStream fos = new FileOutputStream(filename);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(obj);
			fos.close();
	}
	
	public Object deserialize(String filename) throws IOException, ClassNotFoundException {
		FileInputStream fis = new FileInputStream(filename);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		return obj;
	}
	

}
