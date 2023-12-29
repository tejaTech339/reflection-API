package reflectionAPI;

import java.lang.reflect.Field;

public class TestPerson {
	
	static Person person=new Person();
	
	public static void main(String[] args)
			throws NoSuchFieldException, 
			SecurityException, 
			IllegalArgumentException, IllegalAccessException {
		
		
		String beforeName=person.getName();
		System.out.println("Name before Reflection api: "+beforeName);
		
		Field nameField=person.getClass().getDeclaredField("name");
		nameField.setAccessible(true);
		nameField.set(person, "teja");
		String afterName=person.getName();
		System.out.println("Name after Reflection api: "+afterName);
		System.out.println("======================");
		
		//==================================================================
		
		int beforeAge=person.getAge();
		System.out.println("Age before: "+beforeAge);
		
		Field ageField=person.getClass().getDeclaredField("age");
		ageField.setAccessible(true);
		ageField.setInt(person, 24);
		int afterAge=person.getAge();
		System.out.println("Age After: "+afterAge);
		System.out.println("========================");
		
		//=====================================================================
		
		long beforeCont=person.getContactNumber();
		System.out.println("Before: "+beforeCont);
		
		Field contField=person.getClass().getDeclaredField("contactNumber");
		contField.setAccessible(true);
		contField.setLong(person, 8523099868L);
		long afterCon=person.getContactNumber();
		System.out.println("After: "+afterCon);
		System.out.println("===========================");
		
	}
}
