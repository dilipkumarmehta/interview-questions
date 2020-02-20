package dilip.desing.patter;
public class PrototypePattern {

	public static void main(String[] args) {
		Student s = new Student(1, "dilip");
		System.out.println();
		Student instance = (Student) s.getInstance();
		System.out.println(s);
		System.out.println(instance);
		System.out.println("dfdsf");
	}
}

interface ProtoType {

	ProtoType getInstance();
}

class Student implements ProtoType {

	int id;
	String name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	@Override
	public ProtoType getInstance() {
		// TODO Auto-generated method stub
		return new Student(id, name);
	}

}
