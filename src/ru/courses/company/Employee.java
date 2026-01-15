package ru.courses.company;

class Employee {
    private String name;
    private Department department;

    Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    String getName() {
        return name;
    }

    Department getDepartment() {
        return department;
    }

    void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        if (this == department.getHead()) {
            return name + " is head of " + department.getName() + " department";
        } else {
            return name + " works in " + department.getName() +
                    " department, head is " + department.getHead().getName();
        }
    }
}
