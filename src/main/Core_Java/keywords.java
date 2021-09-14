class MyClass{
	static String code="Java Keywords!!";

	public enum weekday {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

	protected void finalize(){
		System.out.println("System called the finalize() method");
	}

	public static void main(String[] args) throws Exception{

		MyClass obj=new MyClass();
		System.out.println("This is an example of "+obj.code);
		try{
			for(weekday w:weekday.values()){
				if(w.toString().equals("SATURDAY")){
					System.out.println("There is Holiday!!");
					break;
				}
				else
					continue;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
			System.out.println("This is finally Block!!");
			obj=null;
			System.gc();
		}
	}
}
