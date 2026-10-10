class Student {
    String name;
    int age;
    Student(){
        name = "ved";
        age = 19;
        
    }
    public static void main(String[] args) {
        Student s1 = new Student();

        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
    }


    
}
//default constructor is a constructor that takes no arguments and initializes the object with default values. In this case, the default constructor initializes the name to "ved" and age to 19. When an instance of the Student class is created using the default constructor, it will have these default values.