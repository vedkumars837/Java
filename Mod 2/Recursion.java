public class Recursion{
    static String year(int n){
        if (n%400 ==0 || (n % 4 == 0 && n%100 != 0)){
            return n + " is a leap year";
        }
        return year(n - 1);

    }
    public static void main(String[] args) {
        System.out.println(year(1900));
    }

    
}
