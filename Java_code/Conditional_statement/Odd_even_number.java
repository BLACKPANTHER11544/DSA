import java.util.Scanner ; 

public class Odd_even_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any Number"); 
        int number1 = sc.nextInt() ; 
        if(number1%2==0){
            System.out.println(number1 + " is Even number"); 
        }
        else{
            System.out.println("Number is odd.");
        }

      
    }
}