import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter speed in Kmph: ");
        int kmph = sc.nextInt();


         double mph = (kmph) * 0.62137;
         System.out.println("Speed in Mph is :" +mph);

    }
}
