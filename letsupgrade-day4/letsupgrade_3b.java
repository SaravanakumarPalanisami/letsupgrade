import java.util.Scanner;
class Letsupgrade{
    public static void main(String[] args) {
        int a[]=new int[5];
        int total=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number "+(i+1));
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            total=total+a[i];
        }
        System.out.println("The total is : "+total);
        sc.close();
    }

    
}
