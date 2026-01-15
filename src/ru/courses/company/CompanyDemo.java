package ru.courses.company;

public class CompanyDemo {
    public static void main(String[] args) {
        Department itDepartment = null;
        Employee head = new Employee("Alex", itDepartment);

        itDepartment = new Department("IT", head);
        head.setDepartment(itDepartment);

        Employee worker = new Employee("Maria", itDepartment);

        System.out.println(head);
        System.out.println(worker);

        Employee newHead = new Employee("John", itDepartment);
        itDepartment.setHead(newHead);
        newHead.setDepartment(itDepartment);

        System.out.println("\nAfter change:");
        System.out.println(head);
        System.out.println(worker);
        System.out.println(newHead);
    }
}
