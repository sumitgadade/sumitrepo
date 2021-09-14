import java.io.*;

class ObjectTest implements Cloneable, Serializable{
	String name = "Sumit Gadade";

	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

	public static void main(String[] args)
	{
		System.out.println("**Using new keyword:");
		ObjectTest  obj = new ObjectTest();
		System.out.println(obj.name);

		System.out.println("**Using new instance :");
		try {
			Class cls = Class.forName("ObjectTest");
			ObjectTest obj1= (ObjectTest )cls.newInstance();
			System.out.println(obj1.name);
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (InstantiationException e) {
			e.printStackTrace();
		}
		catch (IllegalAccessException e) {
			e.printStackTrace();
		}

		System.out.println("**Using clone() method :");
		try {
			ObjectTest  obj2 = (ObjectTest )obj.clone();
			System.out.println(obj2.name);
		}
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println("**Using serialization and deserialization :");
		
		String filename = "file.txt";
	        ObjectTest obj3=new ObjectTest();
		/*-----------------Serialization----------*/  
		try  
		{      
			FileOutputStream file = new FileOutputStream(filename);     
			ObjectOutputStream out = new ObjectOutputStream(file);     
			out.writeObject(obj3);
			out.close(); 
			file.close();  
			System.out.println("Object serialized");   
		}   
		catch(IOException e)   
		{   
			e.printStackTrace();  
		}   
		obj3 = null;   
		/*-----------------Deserialization--------*/  
		try  
		{      
			FileInputStream file = new FileInputStream(filename);   
			ObjectInputStream is = new ObjectInputStream(file);   
			obj3 = (ObjectTest)is.readObject();          
			is.close();                      
			file.close();                    
			System.out.println("Object deserialized ");   
			System.out.println("Name = " + obj3.name);   
		}   
		catch(IOException e)   
		{   
			System.out.println("IOException is caught");   
		}   
		catch(ClassNotFoundException e)   
		{   
			System.out.println("ClassNotFoundException is caught");   
		}  	}
}
