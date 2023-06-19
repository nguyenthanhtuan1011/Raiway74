import java.time.LocalDate;

public class Question {
	int id;
	String content;
	CategoryQuestion category;
	TypeQuestion type;
	Account creator;
	LocalDate createDate;

	public Question(int id, String content, CategoryQuestion category, TypeQuestion type, Account creator,
			LocalDate createDate) {
		super();
		this.id = id;
		this.content = content;
		this.category = category;
		this.type = type;
		this.creator = creator;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", categoryID=" + category.id + ", typeID=" + type.id
				+ ", creatorID=" + creator.id + ", createDate=" + createDate + "]";
	}

}
