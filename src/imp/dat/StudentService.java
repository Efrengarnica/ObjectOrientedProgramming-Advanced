package imp.dat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import imp.exceptions.CourseNotFoundException;
import imp.exceptions.StudentNotFoundException;

public class StudentService
{
	private HashMap<String, Course> courseList = new HashMap<>();

	private HashMap<String, Student> students = new HashMap<>();

	private HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents ( String courseName, String studentID ) throws StudentNotFoundException, CourseNotFoundException
    {
    
        Course course = courseList.get( courseName );
        
        if (course == null) {
        	
            throw new CourseNotFoundException();
        }
        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
        	throw new StudentNotFoundException();
            
        }
      
        coursesEnrolledByStudents.get( studentID ).add( course );
        
    }
    
    
    

    public void unEnrollStudents( String courseName, String studentID ) throws StudentNotFoundException, CourseNotFoundException
    {
        Course course = courseList.get( courseName );
        if (course == null) {
            throw new CourseNotFoundException();
        }
        if ( !coursesEnrolledByStudents.containsKey( studentID ) )
        {
        	throw new StudentNotFoundException();
            
        }
            coursesEnrolledByStudents.get( studentID ).remove( course );
        
    }

    public void showEnrolledStudents(String courseId){
//    	for (HashMap.Entry<String, List<Course>> entry : coursesEnrolledByStudents.entrySet()) {
//       
//           entry.getValue().forEach(cour -> if(cour.) );
//           
//        }
    	System.out.println(courseId + " enrolled: ");
    	Course course = courseList.get(courseId);
    	for(String studentId: coursesEnrolledByStudents.keySet()) {
    		List<Course> allCourse = coursesEnrolledByStudents.get(studentId);
    		if(allCourse.contains(course)) {
    			Student student = students.get(studentId);
    			System.out.println(student);
    		}
    	}
    	
    		
    	
    }

    public void showAllCourses(){
        //TODO implement using collections loops
    	courseList.forEach((key, value) -> System.out.println("[Key] es : "+ key + "  [Curso] es " + value ));
    }

	public void addStudent(Student student) {
		System.out.println("Se incribió correctamente al alumno con matricula: " + student.getId()
				);
		students.put(student.getId(), student);
		coursesEnrolledByStudents.put(student.getId(), student.getCourseList());
	}//addStudent

    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
    
}
