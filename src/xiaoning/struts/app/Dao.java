package xiaoning.struts.app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Dao {
	public static Map<Integer,Employee> emps = new LinkedHashMap<Integer, Employee>();
	
	static{
		emps.put(1, new Employee(1, "a", "11", "A"));
		emps.put(2, new Employee(2, "b", "22", "B"));
		emps.put(3, new Employee(3, "c", "33", "C"));
		emps.put(4, new Employee(4, "d", "44", "D"));
		emps.put(5, new Employee(5, "e", "55", "E"));
	}
	public void save(Employee emp){
		long time = System.currentTimeMillis();
		emp.setEmpId((int)time);
		emps.put(emp.getEmpId(), emp);
	}
	public List<Employee> getEmployee(){
		return new ArrayList<Employee>(emps.values());
	}
	
	public void delete(Integer empId){
		emps.remove(empId);
	}
}
