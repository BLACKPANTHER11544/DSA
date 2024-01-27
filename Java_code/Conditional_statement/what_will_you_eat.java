import java.util.Scanner ; 

public class what_will_you_eat{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("What will you eat"); 
        String answer = sc.nextLine(); 
        switch(answer){
            case "biriyani" : 
                System.out.println("Okay biriyani"); 
                break ; 
            case "pizza":
                System.out.println("Okay Pizza"); 
                break ;
            case "pasta" : 
                System.out.println("Okay pasta"); 
                break ; 
            case "malayi paneer" : 
                System.out.println("Okay malayi paneer"); 
                break ;
            default : 
               System.out.println("Okay you can eat my D***");
               break ;
        }
    }
}