// public class Hello {
//     public static void main(String[] args) {
//         System.out.println("Hello, World!");
//     }
// }

//Qn. In java is it important to have of same name of file as that of class?
//Ans. Yes, it is important—but only when the class is declared as public
//Rule 1: Public class → File name must match the class name
// So this file should be named as Hello.java
// Rule 2: Non-public class → File name can be different

// If you remove the public keyword:
class Hello {
    public static void main(String[] args) {
        System.out.println("Hello");
    }
}
// Now you can save it as: prac_file.java or any valid Java filename.
