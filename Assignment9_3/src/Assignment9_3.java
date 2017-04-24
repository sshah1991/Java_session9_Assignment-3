import java.util.HashMap;

public class Assignment9_3 {

	public static void main(String[] args) {
		// Create a Collection emp as HashMap having EmpCode as Integer and EmployeeName as String
		HashMap<Integer,String> emp=new HashMap<Integer,String>();
		// Populate the Collection emp
		emp.put(1001, "Sumeet");
		emp.put(1005, "Arjun");
		emp.put(1041, "neta");
		emp.put(1085, "Supriya");
		emp.put(1068, "Shah");
		
	
		
		//Display only the Employee Names
		System.out.println(emp.values());
	}

}