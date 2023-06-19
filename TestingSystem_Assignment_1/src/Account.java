import java.time.LocalDate;

public class Account {
	int id;
	String email;
	String userName;
	String fullName;
	Department department;
	Position position;
	LocalDate createDate;

	Group[] groups;

	public Account(int id, String email, String userName, String fullName, Department department, Position position,
			LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.department = department;
		this.position = position;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", userName=" + userName + ", fullName=" + fullName
				+ ", departmentID=" + department.id + ", positionID=" + position.id + ", createDate=" + createDate
				+ ", groups=" + groups[0].name + ", " + groups[1].name + "]";
	}

}
