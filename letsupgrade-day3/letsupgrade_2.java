 import java.util.Scanner;
 class Subjects{
    public static void main(String[] args) {
        

        int[] marks=new int[5];
        double percentage;
        int total=0;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter the marks of subject "+(i+1));
            marks[i]=sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            total=total+marks[i];
        }
        percentage=total/5;
        System.out.println("Your percentage is "+percentage);
        if(percentage<=90)
            System.out.println("Your grade is A");
        else if(percentage<=80)
            System.out.println("Your grade is B");
        else if(percentage<=70)
            System.out.println("Your grade is C");
        else if(percentage<=60)
            System.out.println("Your grade is D");
        else
            System.out.println("Your grade is E");
    
        sc.close();
    }


}
s