import java.util.Scanner;
public class string {
    public static void main(String[] args)
    {
        char ch[]={'a','b','c'};
        String str = "";
        for (int i=0;i<ch.length;i++)
        {
            // System.out.println(ch[i]);
            str = str.concat(String.valueOf(ch[i]));
        }
        System.out.println(str);
    }
    
}
