class Car{
    String colour;
    String Man;
    void abc(){
        System.out.println(Man +" is driving a car whose colour is "+ colour);
        
    }
    
    
}

public class xyz{
    public static void main(String[] args){
        Car mycar1 = new Car();
        mycar1.colour = "red";
        mycar1.Man = "Rahul";
        mycar1.abc();
        
        Car mycar2 = new Car();
        mycar2.colour = "blue";
        mycar2.Man = "Alice";
        mycar2.abc();
        
        Car mycar3 = new Car();
        mycar3.colour = "green";
        mycar3.Man = "Bob";
        mycar3.abc();
        
    }
}