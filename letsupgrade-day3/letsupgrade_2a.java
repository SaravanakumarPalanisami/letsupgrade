import java.util.Scanner;
class Employe{
    String name;
    int dob,yob,monSal,annSal,mob;
    public static void main(String[] args) {
        Employe e=new Employe();
        System.out.println("Enter the details of the employee");
        System.out.println("Name :");
        Scanner sc=new Scanner(System.in);
        e.name=sc.nextLine();
        System.out.println("Date of birth :");
        e.dob=sc.nextInt();
        System.out.println("Month of birth");
        e.mob=sc.nextInt();
        System.out.println("Year of birth");
        e.yob=sc.nextInt();
        System.out.println("Monthly salary");
        e.monSal=sc.nextInt();
        e.annSal=e.monSal*12;
        System.out.println("Your annual salary is "+e.annSal);
        if(e.annSal>=5_00_000){
            System.out.println("Your tax percent is 20%");
            System.out.println("Your tax amount is "+((e.annSal/20)*100));
        }
        else if(e.annSal>=2_00_000){
            System.out.println("Your tax percent is 15%");
            System.out.println("Your tax amount is "+((e.annSal/100)*15));
        }
        else if(e.annSal>=1_00_000){
            System.out.println("Your tax percent is 10%");
            System.out.println("Your tax amount is "+((e.annSal/10)*100));
        }
        else if(e.annSal>=5_00_000){
            System.out.println("Your tax percent is 5%");
            System.out.println("Your tax amount is "+((e.annSal/5)*100));
        }
        else
        {
            System.out.println("You have no tax");
        }

        sc.close();
    }
    
}
