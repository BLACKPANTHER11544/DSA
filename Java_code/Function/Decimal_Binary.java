import java.util.Scanner ; 
import java.lang.Math;

public class Decimal_Binary{
    public static void Change(int n){
        int pow = 0; 
        int bi = 0; 
        while(n>0){
           int rem = n%2 ; 
            bi = bi + (rem * (int)Math.pow(10,pow)); 
            pow++ ;
            n= n/2 ; 
        }
        System.out.println(bi);
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in); 
        System.out.println("Enter decimal number"); 
        int numb = sc.nextInt(); 
        Change(numb); 
    }
}