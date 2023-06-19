
public class Answer {
	int id;
	String content;
	Question question;
	ISCorrect isCorrect;

	public enum ISCorrect {
		TRUE, FALSE

	}

	public Answer(int id, String content, Question question, Answer.ISCorrect isCorrect) {
		super();
		this.id = id;
		this.content = content;
		this.question = question;
		this.isCorrect = isCorrect;
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", content=" + content + ", question=" + question + ", isCorrect=" + isCorrect
				+ "]";
	}

}
