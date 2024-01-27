import java.util.Scanner ; 

public class Print_3largest{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any 3 numbers"); 
        int numb1 = sc.nextInt() ; 
        int numb2 = sc.nextInt(); 
        int numb3 = sc.nextInt(); 
        if(numb1>numb2 && numb1 > numb3){
            System.out.println(numb1+" is greatest"); 
        } else if(numb2>numb1 && numb2>numb3){
            System.out.println(numb2 + " is greatest"); 
        } else {
            System.out.println(numb3 + " is greatest");
        }
    }
}