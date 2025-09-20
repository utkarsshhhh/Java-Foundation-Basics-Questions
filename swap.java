public class swap {
    public static void main(String[] args){

        int a=69;
        int b=25;
        int c;
        
        System.out.println("Before swap:"+"\n"+"a= "+a+" b= "+b);

       c = b;
       b = a;
       a= c;

        System.out.println("After swap:"+"\n"+"a= "+a+" b= "+b);
    }
}
