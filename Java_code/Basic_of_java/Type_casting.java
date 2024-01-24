import java.util.Scanner; 

public class Type_casting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a decimal value"); 
        float numb = sc.nextFloat(); 
        int TypeCasted = (int) numb; 
        System.out.println("decimal value converted into intger value "+ TypeCasted);
    }
}