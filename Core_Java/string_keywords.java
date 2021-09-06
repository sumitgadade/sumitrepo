class Test {
    public static void main(String[] args)
    {
	    String s1 = "Sumit Gadade";
	    String s2 = "Sumit Gadade";
	    String s3 =  new String("Sumit Gadade");
	    System.out.println(s1 == s2); 
	    System.out.println(s1 == s3); 
	    System.out.println(s1.equals(s2)); 
	    System.out.println(s1.equals(s3));

	System.out.println("\nTesting StringBuilder and StringBuffer\n");
	    System.out.println("Initially String is "+s1);
	    StringBuilder st=new StringBuilder();
	    st.append(s1);
	    st.reverse();
	    System.out.println("Reversed String using StringBuilder: "+st);


	    s1=new String(st);
	    StringBuffer bf=new StringBuffer();
	    bf.append(s1);
	    bf.reverse();
	    System.out.println("Reversed String using StringBuffer: "+bf);
    }
}
