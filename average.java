import java.util.Scanner;
public class average {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total distance travelled (in km): ");
        int km = sc.nextInt();

        Scanner sr = new Scanner(System.in);
        System.out.println("Enter fuel spent (in liters):  ");
        double litres = sc.nextDouble();

        double Average =   km  /  litres;
        System.out.println("Bike's average consumption: " +Average + " km/litre");


    }
}
