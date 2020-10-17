import java.util.Scanner;
class Avenger{
    int age;
    String name,power,weapon;
    void getDetails(int n){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the details of avenger "+n);
        System.out.println("Name :");
        name=sc.nextLine();
        System.out.println("Power :");
        power=sc.nextLine();
        System.out.println("Weapon :");
        weapon=sc.nextLine();
        System.out.println("age :");
        age=sc.nextInt();
    }
    void display(int n){
        System.out.println("Avanenger :"+n);
        System.out.println("name :"+name+"\nPower :"+power+"\nWeapon :"+weapon+"Age :"+age);

    }
}
class Test{
public static void main(String[] args) {
    int n=5;
    Avenger [] a=new Avenger[n];
    for (int i = 0; i < n; i++) {
        a[i]=new Avenger();
    }
    for (int i = 0; i < n; i++) {
        a[i].getDetails( i+1);
    }
    for (int i = 0; i <n; i++) {
        a[i].display(i+1);
        
    }
}
}