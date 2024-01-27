import java.util.Scanner ; 

public class Result{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter total marks"); 
        float total = sc.nextFloat(); 
        String result = (total>=33) ? "You passed" : "You failed" ;
        System.out.println(result);
    }
}