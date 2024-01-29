import java.util.Scanner ; 

// row aur column kuch bhi le skte hain
public class Square_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter order for any sqaure matrix"); 
        int row = sc.nextInt() ; 
        int col = sc.nextInt(); 
        for(int i=0 ; i<row;i++){
            for(int j=0; j<col;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}

//columns fix hain

public class Square_pattern{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter number of rows"); 
        int row = sc.nextInt() ; 
        int counter =0 ; 
        while(counter<row){
            System.out.println("****");
            counter++ ; 
        }
        
    }
}