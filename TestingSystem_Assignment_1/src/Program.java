import java.time.LocalDate;

public class Program {
	public static void main(String[] args) {

		System.out.println("----------------Question2------------------");

		// Department
		Department dep1 = new Department(1, "sale");
		Department dep2 = new Department(2, "marketing");
		Department dep3 = new Department(3, "management");

		// Position
		Position pos1 = new Position(1, Position.PositionName.DEV);
		Position pos2 = new Position(2, Position.PositionName.PM);
		Position pos3 = new Position(3, Position.PositionName.TEST);

		// Account
		Account acc1 = new Account(1, "anguyenvan@gmail.com", "anguyenvan", "Nguyen Van A", dep1, pos1,
				LocalDate.now());
		Account acc2 = new Account(2, "bphamthi@gmail.com", "bphamthi", "Pham Thi B", dep2, pos1, LocalDate.now());
		Account acc3 = new Account(3, "ctranvan@gmail.com", "ctranvan", "Tran Van C", dep1, pos3, LocalDate.now());

		// Group
		Group gr1 = new Group(1, "Railway", acc1, LocalDate.now());
		Group gr2 = new Group(2, "Rocket", acc3, LocalDate.now());
		Group gr3 = new Group(3, "FE", acc2, LocalDate.now());

		// Group of each account
		Group[] groupArray1 = { gr1, gr2 };
		acc1.groups = groupArray1;
		acc3.groups = groupArray1;

		Group[] groupArray2 = { gr1, gr3 };
		acc2.groups = groupArray2;

		// Account in each group
		Account[] accountArray1 = { acc1, acc2 };
		gr1.accounts = accountArray1;

		Account[] accountArray2 = { acc2, acc3 };
		gr2.accounts = accountArray2;
		gr3.accounts = accountArray2;

		// GroupAccount (thoi gian them acc vao group)
		GroupAccount groupAccount1 = new GroupAccount(gr1, acc1, LocalDate.now());
		GroupAccount groupAccount2 = new GroupAccount(gr2, acc1, LocalDate.now());

		GroupAccount groupAccount3 = new GroupAccount(gr1, acc2, LocalDate.now());
		GroupAccount groupAccount4 = new GroupAccount(gr3, acc2, LocalDate.now());

		GroupAccount groupAccount5 = new GroupAccount(gr1, acc3, LocalDate.now());
		GroupAccount groupAccount6 = new GroupAccount(gr2, acc3, LocalDate.now());

		// TypeQuestion
		TypeQuestion typeQues1 = new TypeQuestion(1, TypeQuestion.TypeName.ESSAY);
		TypeQuestion typeQues2 = new TypeQuestion(2, TypeQuestion.TypeName.MULTIPLE_CHOICE);

		// CategoryQuestion
		CategoryQuestion categoryQues1 = new CategoryQuestion(1, "Java");
		CategoryQuestion categoryQues2 = new CategoryQuestion(2, ".NET");
		CategoryQuestion categoryQues3 = new CategoryQuestion(3, "Ruby");

		// Question
		Question ques1 = new Question(1, "Java la gi", categoryQues1, typeQues1, acc1, LocalDate.now());
		Question ques2 = new Question(2, ".NET la gi", categoryQues2, typeQues2, acc3, LocalDate.now());
		Question ques3 = new Question(3, "Ruby la gi", categoryQues3, typeQues1, acc2, LocalDate.now());

		// Answer
		Answer ans1 = new Answer(1, "Java la ngon ngu lap trinh huong doi tuong", ques1, Answer.ISCorrect.TRUE);
		Answer ans2 = new Answer(2, "A", ques2, Answer.ISCorrect.FALSE);
		Answer ans3 = new Answer(3, "Ruby la ngon ngu lap trinh huong doi tuong", ques3, Answer.ISCorrect.TRUE);

		// Exam
		Exam exam1 = new Exam(1, "E01", "Java cuoi ki", categoryQues1, "1h", acc1, LocalDate.now());
		Exam exam2 = new Exam(2, "E02", ".NET giua ki", categoryQues2, "2h", acc2, LocalDate.now());
		Exam exam3 = new Exam(3, "E03", "Ruby cuoi ki", categoryQues3, "1h", acc3, LocalDate.now());

		// ExamQuestion
		Question[] quesArray1 = { ques1, ques2 };
		exam1.questions = quesArray1;

		Question[] quesArray2 = { ques1, ques3 };
		exam2.questions = quesArray2;

		Question[] quesArray3 = { ques2, ques3 };
		exam3.questions = quesArray3;

		System.out.println("----------------Question3------------------");
		System.out.println(dep1.toString());
		System.out.println(pos2.toString());
		System.out.println(acc1.toString());
		System.out.println(gr1.toString());
		System.out.println(typeQues1.toString());
		System.out.println(categoryQues1.toString());
		System.out.println(ques2.toString());
		System.out.println(ans3.toString());
		System.out.println(exam2.toString());

	}
}
