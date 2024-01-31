import java.util.Scanner ; 

public class StarPattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Row and Columns"); 
        int row = sc.nextInt() ; 
        int col = sc.nextInt(); 
        for(int i= 1 ; i<=row ;i++){
            for(int j=1 ; j<=col;j++){
                if(i==j){
                    System.out.print("*");
                }
                if(i>j){
                    System.out.print("*");
                }
            }System.out.println("");
        } 
    }
}