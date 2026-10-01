package college.paractice;

class Employee{
    void display(){
        System.out.println("I am Employee");
    }
}
class Manager extends Employee{
    void manager(){
        System.out.println("Manager manages the Team ");
    }
}
class Developer extends Employee{
    void developer(){
        System.out.println("Developer writes Code");
    }
}
class Tester extends Employee{
    void test(){
        System.out.println("Tester tests the Software");
    }
}
public class Main2{
    public static void main (String args[]){
        Manager e1 = new Manager();
        Developer e2 = new Developer();
        Tester e3 = new Tester();
        e1.display();
        e1.manager();
        e1.display();
        e2.developer();
        e3.test();
    }
}