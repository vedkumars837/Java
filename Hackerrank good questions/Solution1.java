// nput Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

// Output Format

// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly  characters.
// The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.

// Sample Input:
// java 100
// cpp 65
// python 50

// Sample Output:
// ================================
// java           100 
// cpp            065 
// python         050 
// ================================


import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                
                int len = s1.length();
                int len2 = String.valueOf(x).length();
                System.out.print(s1);
                for( int y = 15 - len;y>0;y--){
                    System.out.print(" "); 
                    
                }
                if (len2 <3 ){
                    if( len2 <2){
                        System.out.print(0);
                        System.out.print(0);
                        System.out.println(x);
                    }
                    else{
                        System.out.print(0);
                        System.out.println(x);  
                    }    
                        
                }
                
                else{
                    System.out.println(x);
                    }
                    
                }
                
                
                System.out.println("================================");
                sc.close();
            }

    }




