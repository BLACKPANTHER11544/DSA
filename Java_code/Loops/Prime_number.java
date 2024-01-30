import java.util.Scanner ; 

public class Prime_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Value"); 
        int number = sc.nextInt(); 
        int counter = 2 ; 
        boolean isPrime = true ; 
        while(counter<number){
           if(number%counter==0){
            isPrime = false ; 
           }
           counter++ ;
        }
        if(isPrime==true){
        System.out.println(number+" is a prime number"); 
        }
        if(isPrime==false){
            System.out.println(number+" is not a prime number");
        }
       
    }
}