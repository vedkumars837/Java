class Car {
    String Man;
    String colour;
    
    Car(String m , String c){
        Man = m;
        colour = c;

    }
    public static void main(String[] args){
        Car c1 = new Car("Ved" , "REd");
        System.out.println(c1.Man + " is driving a car whose colour is "+ c1.colour);

        Car c2 = new Car("Naati" , "Purple");
        System.out.println(c2.Man + " is driving a car whose colour is "+ c2.colour);

        Car c3 = new Car("Pranjal" , "Black");
        System.out.println(c3.Man + " is driving a car whose colour is "+ c3.colour);
    }
}
