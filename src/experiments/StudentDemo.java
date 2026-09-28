package experiments;

import java.util.Scanner;

class Student {
    String USN;
    String Name;
    String Branch;
    String Phone;

    Student(String USN, String Name, String Branch, String Phone) {
        this.USN = USN;
        this.Name = Name;
        this.Branch = Branch;
        this.Phone = Phone;
    }

    void display() {
        System.out.println(USN + "\t" + Name + "\t" + Branch + "\t" + Phone);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            System.out.print("USN: ");
            String usn = sc.next();

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Branch: ");
            String branch = sc.next();

            System.out.print("Phone: ");
            String phone = sc.next();

            students[i] = new Student(usn, name, branch, phone);
        }

        System.out.println("\nStudent Details");
        System.out.println("USN\tName\tBranch\tPhone");
        System.out.println("--------------------------------------------");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
