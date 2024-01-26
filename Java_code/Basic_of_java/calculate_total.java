import java.util.Scanner ; 

public class calculate_total{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in) ; 
        System.out.println("Enter the price of all 3 items pencil, pen, eraser") ; 
        float pen = sc.nextFloat() ; 
        float eraser = sc.nextFloat() ; 
        float pencil = sc.nextFloat() ;
        int $ = 24 ;
        System.out.println("The total "+  (pen+pencil+eraser) ) ;
    }
}