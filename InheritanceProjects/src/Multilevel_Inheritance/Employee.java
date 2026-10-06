package Multilevel_Inheritance;

public class Employee {

	    private String name;
	    private int employeeId;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public void displayEmployeeDetails() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	    }
	}

class Developer extends Employee {

    private String programmingLanguage;

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public void displayDeveloperDetails() {
        System.out.println("Programming Language: " + programmingLanguage);
    }
}

class SeniorDeveloper extends Developer {

    private int experience;

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void displaySeniorDetails() {
        System.out.println("Experience: " + experience + " years");
    }
}
