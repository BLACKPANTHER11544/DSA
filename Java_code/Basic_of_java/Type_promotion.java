public class Type_promotion{
    public static void main(String args[]){
        // Promotion of operands to Integer data type
        byte variable_of_byte_type = 10 ; 
        char variable_of_char_type = 'a' ; 
        short variable_of_short_type = 5 ; 
        /* variable_of_char_type will be promoted to integer type ,hence its value will become 97(ascii value of 'a'), and promotion
           variable_of_byte_type and variable_of_short_type will also be of integer type, hence its value will become integer of 5 ,10 
           respectively.
        */
        System.out.println(variable_of_byte_type+variable_of_char_type+variable_of_short_type) ; 

        // Promotion to long,flaoting,double type respectively 
        long variable_of_long_type = 100 ; 
        float variable_of_float_type = 10.1f ; 
        double variable_of_double_type = 200.2020 ; 
        /* 
        variable_of_long_type, variable_of_float_type ,variable_of_double_type will be promoted to double data-type and then the expression will get evaluated. 
        */
        System.out.println(variable_of_double_type+variable_of_float_type+variable_of_long_type) ;
      
       
    }
}