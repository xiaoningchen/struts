package xiaoning.struts.app;

public class Employee {
	private Integer empId;
	private String name;
	private String phone;
	private String email;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Employee(Integer empId, String name, String phone, String email) {
		super();
		this.empId = empId;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	public Employee() {
	}
}
