package java_features.inputOutput.serialization;

import java.io.*;

public class Serialization {
	public static void main(String[] args) throws IOException {
		File dir = new File("resources/task_3.serialization");
		dir.mkdirs();
		File file = new File("resources/task_3.serialization/Users.ser");
		file.createNewFile();

		User user = new User("John", "Smith", 25, new Address("Los"));

		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))){
			objectOutputStream.writeObject(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
			User savedUser = (User) objectInputStream.readObject();
			System.out.println(savedUser);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}
}
