package Multilevel_Inheritance;

public class EmployeeDemo {

	    public static void main(String[] args) {

	        SeniorDeveloper sd = new SeniorDeveloper();

	        sd.setName("Rahul");
	        sd.setEmployeeId(101);

	        sd.setProgrammingLanguage("Java");

	        sd.setExperience(5);

	        sd.displayEmployeeDetails();
	        sd.displayDeveloperDetails();
	        sd.displaySeniorDetails();
	    }
	}


