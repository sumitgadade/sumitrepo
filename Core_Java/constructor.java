class myClass
{
    int rollno;
    String name;

    myClass()
    {
        System.out.println(" Default constructor called!!\n");
    }

    myClass(int n, String name)
    {
        this.rollno = n;
        this.name = name;
        System.out.println("Parameterized Constructor called!!\n");
    }

    myClass(int n, String name, String address)
    {
        System.out.println("[Constructor Overloading] My name is "+name+". My Address is "+address+" and my roll no is "+n+"\n");
    }
}

class testClass
{
        public static void main(String[] args)
    {
        myClass obj1=new myClass();
        myClass obj2=new myClass(123,"Sumit");

        System.out.println("[Default Constrcutor] My roll name is "+obj1.rollno+" and my name is "+obj1.name+"\n");
        System.out.println("[Parameterized Constructor] My roll name is "+obj2.rollno+" and my name is "+obj2.name+"\n");

        new myClass(123,"Sumit","At. Po. Benwadi, Tal. Karjat, Dist. Ahmednagar");
    }
}