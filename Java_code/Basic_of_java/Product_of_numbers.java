import java.util.Scanner ; 

public class Product_of_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter Numbers"); 
        int number1 = sc.nextInt() ; 
        float number2 = sc.nextFloat() ; 
        System.out.println("The Product of numbers "+ number1*number2) ; 
    }
}