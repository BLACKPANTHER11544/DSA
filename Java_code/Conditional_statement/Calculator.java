import java.util.Scanner ; 

public class Calculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter operator"); 
        char operator = sc.nextLine().charAt(0); 
        System.out.println("Enter any two integer type Operands");
        int numb1 = sc.nextInt(); 
        int numb2 = sc.nextInt(); 
        switch(operator){
            case '+' : 
               System.out.println("Sum is "+ (numb1+numb2)); 
               break ; 
            case '-' : 
               if(numb1>numb2){
                System.out.println("Subtraction is "+(numb1-numb2)); 
                break ; 
               }else{
                System.out.println("Subtraction is "+(numb2-numb1));
                break ;
               }
            case '*' : 
                System.out.println("Multiplication is "+(numb1*numb2));
                break ;
            case '/' : 
                 if(numb1>numb2){
                System.out.println("Division is "+(numb1/numb2)); 
                break ; 
               }else{
                System.out.println("Division is "+(numb2/numb1));
                break ;
               }
            default : 
                System.out.println("Thanks for visiting");
                break ;
        }
    }
}
