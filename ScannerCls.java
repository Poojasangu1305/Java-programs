package javapractice;

import java.util.Scanner;

class Student {
    String name;
    int rollnum;
    int id;

    
    Student(Scanner scan) {
        System.out.print("Enter name: ");
        this.name = scan.nextLine();
        
        System.out.print("Enter roll number: ");
        this.rollnum = scan.nextInt();
        
        System.out.print("Enter ID: ");
        this.id = scan.nextInt();
        
        
    }

   
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollnum);
        System.out.println("ID: " + id);
    }
}

public class ScannerCls {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student s1 = new Student(scan);
        Student s2 = new Student(scan);
        s1.display();
        s2.display();
        scan.close();
    }
}
