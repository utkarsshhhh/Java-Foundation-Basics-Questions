import java.util.Scanner;
public class index {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hours : ");
        int hr = sc.nextInt();

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter minutes : ");
        int min = sr.nextInt();


        int minutes = (hr*60)+min;
        System.out.println("Total number of minutes: "+minutes);

    }
}
