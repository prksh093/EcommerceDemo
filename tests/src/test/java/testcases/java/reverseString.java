package testcases.java;

public class reverseString {


    public static void main(String[] args) {
        
        String str= "     Hello Prakash      ";
        String rev ="";

       

        System.out.println( str.length());
   

        for ( int i=str.length()-1;i>=0;i--)
        {
            rev+=str.charAt(i);
        }
        System.out.println("Reverse String is : " + rev.trim());
    }
}
