import java.time.LocalDate;

public class Group {
	int id;
	String name;
	Account creator;
	LocalDate createDate;

	Account[] accounts;

	public Group(int id, String name, Account creator, LocalDate createDate) {
		super();
		this.id = id;
		this.name = name;
		this.creator = creator;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Group [id=" + id + ", name=" + name + ", creator=" + creator.fullName + ", createDate=" + createDate
				+ ", accounts=" + accounts[0].fullName + "," + accounts[1].fullName + "]";
	}

}
