class Constructor_rectangle{
    float height, width;
    Constructor_rectangle(float h, float w){
        height = h;
        width = w;
    }
    Constructor_rectangle(){
        height = 10;
        width = 20;
    }
    Constructor_rectangle r1 = new Constructor_rectangle();
    Constructor_rectangle r2 = new Constructor_rectangle();
    Constructor_rectangle r3 = new Constructor_rectangle(5,7);
    
    void area(){
        float finalarea;
        finalarea = height * width;
        System.out.println("Area of rectangle is: "+finalarea);
    }




    
    
}
//without parameter constructor is called default constructor and with parameter constructor is called parameterized constructor.