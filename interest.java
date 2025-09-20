import java.util.Scanner;
public class interest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount:");
        int principle = sc.nextInt();

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter interest rate:");
        int rate = sr.nextInt();

        Scanner ss = new Scanner(System.in);
        System.out.println("Enter time amount:");
        int time = ss.nextInt();

        int si= ( principle * rate * time )/ 100;
        System.out.println("Simple Interest :" +si);

    }
    }