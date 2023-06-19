
public class Position {
	int id;
	PositionName name;

	public enum PositionName {
		DEV, TEST, SCRUM_MASTER, PM
	}

	public Position(int id, Position.PositionName name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Position [positionID=" + id + ", positionName=" + name + "]";
	}

}
