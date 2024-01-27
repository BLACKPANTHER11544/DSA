import java.util.Scanner ; 

public class positive_negative{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any Number"); 
        int number1 = sc.nextInt() ; 
        if(number1>0){
            System.out.println(number1 + " is Positive number"); 
        }
        else{
            System.out.println("Number is Negative number.");
        }      
    }
}