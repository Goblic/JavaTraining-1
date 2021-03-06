package elearning;

public class Administrator extends User{

	public Administrator(String string) {
		setUsername(string);
	}

	@Override
	public void enroll(Course course) {
		System.out.println("Enrolling administrator "+ getUsername() + " to course \"" + course.getName() + "\"");
		course.setNumberOfParticipants((short) (course.getNumberOfParticipants()+1));
		UserRights newParticipant = new UserRights(this, true, true, true);
		course.getParticipants()[course.getNumberOfParticipants()-1] = newParticipant;
	}
	
	public void createCourse(){
		System.out.println("ADMIN CREATES A NEW COURSE");
	}

}
