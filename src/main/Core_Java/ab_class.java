/*Define an abstract class “Staff” with members name and address. 
Define two sub-class of this class– “FullTimeStaff”(department,salary) and partTimeStaff(number_of_hours, rate_per_hour). 
Define appropriate constructors.
Create “n” objects which could be of either FullTimeStaff or PartTimeStaff class by asking 
the user‟s choice Display details of all “FullTimeStaff” objects and all “PartTimeStaff” objects.*/

import java.util.*;

abstract class Staff{
    String name;
    String addr;

    Staff(String nam, String address){
        name=nam;
        addr=address;
    }
    public abstract void display();
}

class fullTimeStaff extends Staff{
    String dept;
    float salary;

    fullTimeStaff(String a, String b, String c, float d){
        super(a,b);
        dept=c;
        salary=d;
    }
    public void display(){
		System.out.println("Name:"+name);
		System.out.println("Address:"+addr);
		System.out.println("Department:"+dept);
		System.out.println("Salary:"+salary);
        
    }
}

class partTimeStaff extends Staff{
    int noOfHours;
    float rate;  
    
    
    partTimeStaff(String a, String b, int c, float d){
        super(a,b);
        noOfHours=c;
        rate=d;
    }

    public void display(){
		System.out.println("Name:"+name);
		System.out.println("Address:"+addr);
		System.out.println("No of Hours:"+noOfHours);
		System.out.println("Rate per hour:"+rate);
    }
}

class abstractDemo{
    public static void main(String args[]){
        int n, choice;
        Scanner scan= new Scanner(System.in);
        System.out.print("How many staff? ");
        n=scan.nextInt();

        Staff s[]= new Staff[n+1];
        for(int index=0;index<n;index++){
            System.out.println("\n1) Full time staff\n2) Part time staff\n");
            System.out.println("Enter choice : ");
            choice=scan.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter details: ");
                    System.out.print("Name : ");
                    String a=scan.next();
                    System.out.print("Address : ");
                    String b=scan.nextLine();
                    System.out.print("Department : ");
                    String c=scan.next();
                    System.out.print("Salary : ");
                    float d=scan.nextFloat();

                    s[index]=new fullTimeStaff(a,b,c,d);
                
                    break;
                case 2:
                    System.out.println("Enter details: ");
                    System.out.print("Name : ");
                    String e=scan.next();
                    System.out.print("Address : ");
                    String f=scan.nextLine();
                    System.out.print("Number of hours : ");
                    int g=scan.nextInt();
                    System.out.print("Rate per hour : ");
                    float h=scan.nextFloat();

                    s[index]=new partTimeStaff(e,f,g,h);
            
                    break;
            }
        }

        for(int index=0; index<n; index++){
            if(s[index].getClass().getName().equals("fullTimeStaff")){
                System.out.println("\nFull time staff \n...................");
                s[index].display();
            }
            else{
                System.out.println("\nPart time staff \n...................");
                s[index].display();
            }
        }

        scan.close();
    }
}