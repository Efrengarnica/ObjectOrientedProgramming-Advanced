package imp.dat;

public class Course {
	
	private String name;

	private int credits;

	private String professorName;

	    public Course( String name, int credits, String professorName )
	    {
	        this.name = name;
	        this.credits = credits;
	        this.professorName = professorName;
	    }

		@Override
		public String toString() {
			return "Course [name=" + name + ", credits=" + credits + ", professorName=" + professorName + "]";
		}
		
	
}
