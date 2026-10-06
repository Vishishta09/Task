package inheritance;
 
public class HierA {

	 int id = 101;
	 String name = "Vish";
	
	 public void details() {
	 System.out.println(id+" "+name);

	}
}
 class HierB extends HierA{
		
		int b = 123;
		
		public void detailsB() {
		System.out.println(b);
		
		details();
		
		}	
	}
