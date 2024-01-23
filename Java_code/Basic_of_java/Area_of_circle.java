import java.util.Scanner; 

public class Area_of_circle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter radius of circle"); 
        float radius = sc.nextFloat() ;
        float area = (float) 3.14*radius*radius ; 
        System.out.println("Area of circle is "+ area); 
    }
}