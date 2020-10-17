import java.util.Scanner;
class Letsupgrade{
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the number "+(i+1));
            a[i]=sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            if(a[i]%2==0)
                System.out.println(a[i]);
        }
        sc.close();
    }
}