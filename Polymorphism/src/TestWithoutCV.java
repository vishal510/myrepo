
public class TestWithoutCV {
	public static void main(String[] args) {
		Exam e = new Exam();
		Person p = e.getPerson();
		System.out.println(p.name);
		if(p instanceof Student) {
			Student s1  = (Student)p;
			System.out.println(s1.course);
		}
	}

}
