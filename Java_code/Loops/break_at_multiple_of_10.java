import java.util.Scanner ; 

public class break_at_multiple_of_10{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
       do{
        System.out.println("Enter Number"); 
        int number = sc.nextInt(); 
        if(number%10==0){
            break ; 
        }
        System.out.println("You have entered "+number); 
       }while(true);

    }
}