class Student1 {
    String name;
    int age;

    Student1(String n, int a) {
        name = n;
        age = a;
    }

    public static void main(String[] args) {
        Student1 s1 = new Student1("ved", 19);
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);

        Student1 s2 = new Student1("john", 20);
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);

        Student1 s3 = new Student1("jane", 18);
        System.out.println("Name: " + s3.name);
        System.out.println("Age: " + s3.age);
    }
}

        
