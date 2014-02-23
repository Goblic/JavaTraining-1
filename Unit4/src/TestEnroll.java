

import elearning.Administrator;
import elearning.Course;
import elearning.Student;
import elearning.Teacher;
import elearning.User;

public class TestEnroll {

	static User[] users = {new Student("Christina"), new Student("Paul"), 
		new Student("Virginia"), new Teacher("Romeo"), new Administrator("Maria"),
		new Student("Juliet")};
	static Course[] courses = {new Course("Intro to Java"), new Course("Intro to SQL"),
		new Course("Linux Essentials"), new Course("Web Application Development")};
	
	public static void main(String[] args) {
		
		String userName = args[0];
		String courseName = args[1];
		int userIndex = 0; 
		int courseIndex = 0;
		
		for(int i=0; i<users.length; i++){
			if (userName.equals(users[i].getUsername())) {
				userIndex = i; //position of user in users array
				break;
			}
		}
		
		for(int i=0; i<courses.length; i++){
			if (courseName.equals(courses[i].getName())) {
				courseIndex = i; //position of course in courses array
				break;
			}
		}
		
		users[userIndex].enroll(courses[courseIndex]);
	}

}
