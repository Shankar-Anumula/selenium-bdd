package sample;

class Employee {
    public static void display() { // line 2
          System.out.print(" Employee ");
    }
}

public class Tester extends Employee {
    public static void display() { // line 5
          System.out.print(" Trainee ");
    }
    public static void main(String[] args) {
          Employee employee = new Tester();
          employee.display(); // line 9
    }
}