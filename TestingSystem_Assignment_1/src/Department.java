
public class Department {
	int id;
	String name;

	public Department(int i, String departmentName) {
		super();
		this.id = i;
		this.name = departmentName;
	}

	@Override
	public String toString() {
		return "Department [departmentID=" + id + ", departmentName=" + name + "]";
	}

}
