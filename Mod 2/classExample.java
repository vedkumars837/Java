class sub {
    int a,b;
    void sub1(){
        System.out.println("Subtraction of two numbers is: "+(a-b));
    }
    // void Setvalue(int a ,int b){
    //     a= a1;
    //     b= b1;
    
}

public  class classExample{
    public static void main(String args[]){
        {
            sub s1 = new sub();
            s1.a=10;
            s1.b=5;
            s1.sub1();
        }

    }
