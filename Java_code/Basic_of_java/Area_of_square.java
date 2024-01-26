import java.util.Scanner ; 

public class Area_of_square{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter length of any one side of sqauer"); 
        float side = sc.nextFloat() ; 
        System.out.println("The area of the sqaure with provided length of side is "+ side*side) ;
    }
}