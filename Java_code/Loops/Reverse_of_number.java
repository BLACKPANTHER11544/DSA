import java.util.Scanner ; 

public class Reverse_of_number{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any positive integer"); 
        int number = sc.nextInt() ; 
        
        while(number>0){
            int lst = number%10 ; 
            System.out.print(lst);
            number= number/10 ; 
        }
    }
}