import java.util.Scanner ; 
import java.lang.Math; 

public class Optimized_prime_number{
    public static void Op_prime(int n){
        boolean isPrime = true ; 
        if(n ==2 ){
           isPrime = true ; 
        }
        for(int i =2 ; i<=Math.sqrt(n);i++){
            if(n % i == 0 ){
                isPrime = false ; 
            }
        }
        if(isPrime == true){
            System.out.println(n+ " is a prime nunmber"); 
        }
        if(isPrime == false ){
            System.out.println(n+ " is not a prime number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Number");
        int numb = sc.nextInt() ;
        Op_prime(numb);
    }
}