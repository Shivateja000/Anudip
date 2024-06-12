package Samplepackage;

interface Person1 {
	public void speak();
}

class Student1 implements Person1 {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("GOOD MORNING MAM!students say ");
	}

}

class Teacher implements Person1 {

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("Teacher ask students to study");
	}

}

public class Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s = new Student1();
		s.speak();
		Teacher t = new Teacher();
		t.speak();
	}

}
