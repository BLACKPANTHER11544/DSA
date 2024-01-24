import java.util.Scanner; 

public class Type_casting{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter a decimal value"); 
        // numb is of floating type variable
        float numb = sc.nextFloat(); 
        // and now it(variable numb) has got type casted into interger data-type, by simply prefixing the data-type to which it want to get casted/converted to.
        int TypeCasted = (int) numb; 
        System.out.println("decimal value converted into intger value "+ TypeCasted);
    }
}