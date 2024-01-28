import java.util.Scanner ; 

public class Fever{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Your Body Temperature"); 
        float temp = sc.nextFloat(); 
        if(temp > 100){
            System.out.println("Yes you have fever"); 
        }else {
            System.out.println("Jhoot bol rahe ho");
        }
    }
}