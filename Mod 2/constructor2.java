class constructor2 {
    float height, width;
    constructor2(float h, float w){
        height = h;
        width = w;
    }
    void area(constructor2 r){
        float finalarea;
        finalarea = (height + r.height) *(width + r.width);
        System.out.println("Area of rectangle is: " + finalarea);
    }
}
