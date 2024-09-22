package imp;
import imp.dat.Student;
import imp.dat.StudentService;
import imp.exceptions.CourseNotFoundException;
import imp.exceptions.StudentNotFoundException;

public class Main {

    public static void main(String[] args) {
	    StudentService studentService = new StudentService();
	    //TODO refactor this code to use encapsulation inside studentsService
        studentService.addStudent( new Student( "Carlos", "1030", 31 ) );
        studentService.addStudent( new Student( "Ian", "1040", 28 ) );
        studentService.addStudent( new Student( "Elise", "1050", 26 ) );
        studentService.addStudent( new Student( "Santiago", "1060", 33 ) );
        try {
        studentService.enrollStudents( "Math", "1030" );
        studentService.enrollStudents( "Math", "1040" );
        studentService.enrollStudents( "Art", "1050" );
        studentService.enrollStudents( "Art", "1060" );
        studentService.enrollStudents( "ArtT", "1090" );
        studentService.enrollStudents( "Art", "1090" );
        //studentService.unEnrollStudents( "Math", "1033" );
        }catch(StudentNotFoundException e){
        	System.out.println(e.getMessage());
        }catch(CourseNotFoundException f) {
        	System.out.println(f.getMessage());
        }
        System.out.println("-----------------------");
        studentService.showEnrolledStudents("Math");
        System.out.println("-----------------------");
        studentService.showEnrolledStudents("Art");
        System.out.println("-----------------------");
        studentService.showAllCourses();
        System.out.println("-----------------------");
        
    }
}
