
public class App {
    public static void main(String[] args) throws Exception {
         // Create a new student object with name JasonOwen

        Student jasonOwen = new Student("Jason2", "Owen2", "CS2");

         // Output information about the object
         System.out.println("Name: " + jasonOwen.getFirstName() + " " + jasonOwen.getLastName() + " is a " + jasonOwen.getMajor() + " major.");
    }
}
