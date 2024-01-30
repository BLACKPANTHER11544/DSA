import java.util.Scanner ; 
/*
continue statement is vey similar to break keyword as in break we come out from the loop body when a certain condtion is true, So similarly here in 'Continue' keyword instead of
exiting from loop body we simply just skip certain statement(code) when a certain condition for continue is true. 

simple mtlb hai ki break loop se bahar ke aata hai .
continue simply Skip kara deta hain, loop ke bahar nhi leke aata flow ko. (Skip an iteration).
*/
public class continue_keyword{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        do{
            System.out.println("Enter any +ve integer"); 
            int number = sc.nextInt(); 
            if(number%10==0){
                // skip iteration when above condition is true ;
                continue ; 
            }
            if(number%2==0){
                // To terminate the loop and bring flow back in main function
                break ; 
            }
            System.out.println("You have Entered "+number) ; 
        }while(true);
        
    }
}