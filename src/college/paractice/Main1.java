package college.paractice;

class Person{
	void displayPerson() {
		System.out.println("I am a Person");
	}
}
class Studentt extends Person{
	void displayStudent() {
		System.out.println("I am a Student");
	}
	
}
class EngineeringStudent extends Studentt{
	void displayEngineering() {
		System.out.println("I am an Engineering Student");
	}
}
public class Main1{
	public static void main(String[] args) {
		EngineeringStudent e=new EngineeringStudent();
		e.displayPerson();
		e.displayStudent();
		e.displayEngineering();
	}
	
}