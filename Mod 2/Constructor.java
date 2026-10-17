// Online Java Compiler (Editor)
// Write and run Java online using this editor.

class Constructor_rectangle{
    float height, width,finalarea;
    void area(){
        finalarea = height * width;
        System.out.println("Area of rectangle is: "+finalarea);
        }    
    Constructor_rectangle(){
        height = 10;
        width = 20;
    }
    Constructor_rectangle(float h, float w){
        height = h;
        width = w;
    }
public static void main(String[] args){
    Constructor_rectangle r1 = new Constructor_rectangle();
    r1.area();
    Constructor_rectangle r2 = new Constructor_rectangle();
    r2.area();
    Constructor_rectangle r4 = new Constructor_rectangle(5,7);
    r4.area();
    Constructor_rectangle r3 = new Constructor_rectangle(5.1f,7);
    r3.area();
    }
}
//without parameter constructor is called default constructor and with parameter constructor is called parameterized constructor.