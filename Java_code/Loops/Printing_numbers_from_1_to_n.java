import java.util.Scanner ; 


public class Printing_numbers_from_1_to_n{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter any Positive integer number");
        int number = sc.nextInt(); 
        int counter =1 ; 
        while(counter<=number){
            System.out.print(counter+ " "); 
            counter++ ;
        }
    }
}