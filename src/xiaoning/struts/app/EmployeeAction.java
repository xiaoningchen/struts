package xiaoning.struts.app;

import java.util.Map;

import org.apache.struts2.interceptor.RequestAware;

import com.opensymphony.xwork2.ModelDriven;

public class EmployeeAction implements RequestAware,ModelDriven<Employee>{
	
	private Map<String,Object> request;
	
	private Integer employeeId;
	
	private Employee emp;
	
	Dao dao = new Dao();
	
	public void setEmployeeId(Integer empId) {
		this.employeeId = empId;
	}
	
	public void setRequest(Map<String, Object> arg0) {
		this.request = arg0;
	}
	
	public Employee getModel() {
		emp = new Employee();
		return emp;
	}
	
	public String list(){
		request.put("emps", dao.getEmployee());
		return "list";
	}
	
	public String delete(){
		dao.delete(employeeId);
		return "succeed";
	}
	
	public String add(){
		
		dao.save(emp);
		return "succeed";
	}
	
}
