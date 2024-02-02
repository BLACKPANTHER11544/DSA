import java.util.Scanner ; 

public class Factorial{
    public static void fact(int num){
        int fact = 1 ; 
        for(int i=1 ; i <= num ; i++){
            fact = fact*i ; 
        }
        System.out.println("Factrorial of "+num+" is "+fact);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any integer type number"); 
        int numb1 = sc.nextInt(); 
        fact(numb1); 
    }
}