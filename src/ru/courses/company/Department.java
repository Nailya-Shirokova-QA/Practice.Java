package ru.courses.company;

class Department {
    private String name;
    private Employee head;

    Department(String name, Employee head) {
        this.name = name;
        this.head = head;
    }

    String getName() {
        return name;
    }

    Employee getHead() {
        return head;
    }

    void setHead(Employee head) {
        this.head = head;
    }
}
