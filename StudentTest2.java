
package august19th;

public class StudentTest2 {
    public static void main(String[] args) {
        // Create a Student object
        Student2 student = new Student2("Tamim Amin", 90.5);

        // Display student's letter grade
        System.out.printf("%s's letter grade is: %s%n", student.getName(), student.getLetterGrade());

        // Calculate class average
        System.out.println("\nCalculating class average:");
        student.classAverage();

        // Analyze exam results
        System.out.println("\nAnalyzing exam results:");
        student.analysis();
    }
}
