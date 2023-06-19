import java.time.LocalDate;

public class Exam {
	int id;
	String code;
	String title;
	CategoryQuestion categoryQuestion;
	String duration;
	Account creator;
	LocalDate createDate;

	Question[] questions;

	public Exam(int id, String code, String title, CategoryQuestion categoryQuestion, String duration, Account creator,
			LocalDate createDate) {
		super();
		this.id = id;
		this.code = code;
		this.title = title;
		this.categoryQuestion = categoryQuestion;
		this.duration = duration;
		this.creator = creator;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", categoryID=" + categoryQuestion.id
				+ ", duration=" + duration + ", creatorID=" + creator.id + ", createDate=" + createDate + ", questions="
				+ questions[0].content + "," + questions[1].content + "]";
	}

}
