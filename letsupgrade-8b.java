import java.util.Scanner;
class Employee{
   String name,designation;
   int salary,age;
   public void getDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr your name");
       name=sc.nextLine();
       System.out.println("Enter your designation");
       designation=sc.nextLine();
       System.out.println("Enetr your age");
       age=sc.nextInt();
       System.out.println("Enter your Salary");
       salary=sc.nextInt();
   }
   public void display(){
       System.out.println("Name: "+name+"\nDesignation: "+designation+"\nAge: "+age+"\nSalary: "+salary);
   }
     
}
class Doctor extends Employee{
    String designation=new String("Doctor");
    public void getDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr your name");
       name=sc.nextLine();
       System.out.println("Enetr your age");
       age=sc.nextInt();
       System.out.println("Enter your Salary");
       salary=sc.nextInt();
   }
   public void display(){
    System.out.println("Name: "+name+"\nDesignation: "+designation+"\nAge: "+age+"\nSalary: "+salary);
}
   public static void main(String[] args) {
    Doctor[] e=new Doctor[3];
    for (int i = 0; i < 3; i++) {
        e[i]=new Doctor();
    }
    for (int i = 0; i < 3; i++) {
     e[i].getDetails();
     }
     for (int i = 0; i < 3; i++) {
         e[i].display();
     }
   }
}
class Engineer extends Employee{
    String designation=new String("Engineer");
    public void getDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr your name");
       name=sc.nextLine();
       System.out.println("Enetr your age");
       age=sc.nextInt();
       System.out.println("Enter your Salary");
       salary=sc.nextInt();
   }
   public void display(){
    System.out.println("Name: "+name+"\nDesignation: "+designation+"\nAge: "+age+"\nSalary: "+salary);
}
   public static void main(String[] args) {
    Engineer[] e=new Engineer[3];
    for (int i = 0; i < 3; i++) {
        e[i]=new Engineer();
    }
    for (int i = 0; i < 3; i++) {
     e[i].getDetails();
     }
     for (int i = 0; i < 3; i++) {
         e[i].display();
     }
    }
}
class Pilot extends Employee{
    String desigation=new String("Pilot");
    public void getDetails(){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enetr your name");
       name=sc.nextLine();
       System.out.println("Enetr your age");
       age=sc.nextInt();
       System.out.println("Enter your Salary");
       salary=sc.nextInt();
   }
   public void display(){
    System.out.println("Name: "+name+"\nDesignation: "+designation+"\nAge: "+age+"\nSalary: "+salary);
}
   public static void main(String[] args) {
    Pilot[] e=new Pilot[3];
    for (int i = 0; i < 3; i++) {
        e[i]=new Pilot();
    }
    for (int i = 0; i < 3; i++) {
     e[i].getDetails();
     }
     for (int i = 0; i < 3; i++) {
         e[i].display();
     }
    
}
   }