import java.util.Scanner ; 

public class PrimeNumber{
    public static void prime(int n){
      boolean isPrime = true ; 
      for(int i=2; i<n ; i++){
        if(n%i==0){
            isPrime = false ; 
        }
      }
      if(isPrime == true){
        System.out.println(n+ " is a prime number");
      }
      if(isPrime == false){
        System.out.println(n+ " is not a prime number"); 
      }
     
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any Number");
        int numb = sc.nextInt() ;
        prime(numb); 
    }
}