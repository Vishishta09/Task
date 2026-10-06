package Multiple_Inheritance;

public class MobileDemo {

	    public static void main(String[] args) {

	        MobileApp app = new MobileApp();

	        app.setAppName("Google Maps");
	        app.setLocation("Hyderabad");

	        System.out.println("----- Mobile App Details -----");
	        app.displayAppDetails();

	        app.getLocation();

	        app.takePhoto();
	    }
	}

