
public class TypeQuestion {
	int id;
	TypeName name;

	public enum TypeName {
		ESSAY, MULTIPLE_CHOICE
	}

	public TypeQuestion(int id, TypeQuestion.TypeName name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "TypeQuestion [id=" + id + ", name=" + name + "]";
	}

}
