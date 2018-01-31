package task1;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.*;
import java.util.Arrays;

public class Reflection {
	public static void main(String[] args) {

//		// Obtain the class object if we know the name of the class
		Class<Team> team = Team.class;
		try {
			
			PrintStream console = new PrintStream(new File ("reflectionFile.java"));
			System.setOut(console);

			// get the package name of the class
			Package teamPackage = team.getPackage();
			console.println(teamPackage);

			console.println();
				
			//class name
			String teamClassNoPackage = team.getSimpleName();
			console.println("public class "
					+ teamClassNoPackage);
			
			console.println();
			
			Field[] privateField = Team.class.getDeclaredFields();

			for (Field field : privateField) {
				String name = field.getName();
				Object type = field.getType();

				console.println(type +  " " + name);
			}
			
			
			// gets all the public member fields of the class Team
			Field[] fields = team.getFields();

			for (Field oneField : fields) {
				// get public field name
				Field field = team.getField(oneField.getName());
				String fieldname = field.getName();
				Object fieldType = field.getType();
				console.println("public " + fieldType + " " + fieldname);
			}
			
			console.println();
			
			// get all the constructors of the class
			Constructor[] constructors = team.getConstructors();
			
			for (Constructor constructor : constructors) {

				console.println(constructor);
			}
			
			console.println();
			// get all methods declared in the class
			// but excludes inherited methods.
			Method[] declaredMethods = team.getDeclaredMethods();
	
			for (Method dmethod : declaredMethods) {

				console.println(dmethod.getReturnType() + " " + dmethod.getName());
			}

			

			

			
		} 
		
		
		
		catch (Exception e)		{
			e.printStackTrace();
		}
	}
}