public class DataTypes{
    public static void main(String args[]){
        byte byteValue = 8 ; 
        int integerValue = 56467851;
        long longValue = 12284398; 
        double doubleValue = 12321134.232342534346356; 
        short shortValue = 98 ; 
        boolean booleanValue = true ; 
        char charValue =  'a';
        System.out.print(byteValue);
        System.out.print(integerValue);
        System.out.print(longValue);
        System.out.print(doubleValue);
        System.out.print(shortValue);
        System.out.print(booleanValue);
        System.out.print(charValue);

    }
}

/* 
Data-Types in Java 
This we hava also seen in Variable, But stil
Data types are the type for any variable which defines the type for any variable and the memory that variable wull occupy in the memory . 
primarily there are only two form for data-type in java and they are 
a>Primitive 
b>Non-Primitive

A)Primitive data types are the data types that are predefined by the compiler and also occupies specific amount of memory. Example are => char, int, float, boolean, long, double, short, bytes
B)Non_Primitive data_types are user defined and there size in the memory in not already known, Example =>String, Array, Class etc 

Size used by the Primitive data_type are 
Note: 
Bits are the smallest unit of the memory, and they can have only 0,1 or NULL as there value. 
1> Bytes = it Contains 8 bits in it (or 8 "bit" block in memory is equivalent to 1 byte) and its range is -128 to 127 
2> short = it takes around 2 bytes of storage , range of this is -32,768 to 32,767
3> char = it takes around 2 bytes of storage range of this is all special character and alphabats and numbers
4> boolean = it takes around 1 bytes of storage range of this is either true or false 
5> int = it takes around 4 bytes of storage range of this is 2 billions 
6> long = it takes around 8 bytes of storage range of this is more than 2 billoins 
7> float = it takes around 4 bytes of storage
8> double = it takes around 8 bytes of storage
*/