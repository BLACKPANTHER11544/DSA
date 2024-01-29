import java.util.Scanner ; 

// using formula
public class Sum_of_n_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any positive integer"); 
        int n = sc.nextInt() ; 
        System.out.println("Sum of "+n+" is "+(n*(n+1))/2 ) ; 

    }
}

// Using Loop 
public class Sum_of_n_numbers{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any positive integer"); 
        int num = sc.nextInt() ; 
        int counter = 1 ; 
        int sum = 0 ;  
        while(counter<=num){
           sum=sum+counter; 
           counter++ ; 
        }
        System.out.println("Sum of "+num+ " is "+sum);
    }
}

