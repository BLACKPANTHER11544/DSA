import java.util.Scanner ; 
import java.lang.Math; 

public class Power_two_number{
    public static void Power(int bs ,int ex){
        System.out.println(((int)Math.pow(bs,ex))); 
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter base and exponent value "); 
        int base = sc.nextInt(); 
        int expo = sc.nextInt(); 
        Power(base,expo); 
    }
}