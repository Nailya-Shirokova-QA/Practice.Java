/*public class Department {
    private String departmentName;
    private Employee boss;

    // Вложенный класс Employee
    public class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public Department getDepartment() {
            return Department.this;
        }

        public boolean isBoss() {
            return Department.this.boss == this;
        }

        @Override
        public String toString() {
            if (isBoss()) {
                return name + " начальник отдела " + Department.this.departmentName;
            } else if (Department.this.boss != null) {return name + " работает в отделе " + Department.this.departmentName +
                    ", начальник которого " + Department.this.boss.name;
            } else {
                return name + " работает в отделе " + Department.this.departmentName +
                        " (начальник не назначен)";
            }
        }
    }

    // Конструкторы Department
    public Department(String departmentName, Employee boss) {
        this.departmentName = departmentName;
        setBoss(boss);
    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    // Геттеры и сеттеры
    public String getDepartmentName() {
        return departmentName;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        this.boss = boss;
    }

    // Фабричный метод
    public Employee createEmployee(String name) {
        return new Employee(name);
    }

    @Override
    public String toString() {
        return "Отдел: " + departmentName +
                (boss != null ? ", начальник: " + boss.getName() : "");
    }

    // Метод main для тестирования (опционально)
    public static void main(String[] args) {
        // Создаем отдел
        Department it = new Department("IT");

        // Создаем сотрудников
        Department.Employee anton = it.createEmployee("Anton");
        Department.Employee alex = it.createEmployee("Alex");
        Department.Employee pete = it.createEmployee("Pete");

        // Назначаем начальника
        it.setBoss(anton);

        System.out.println(alex);
        System.out.println(pete);
        System.out.println(anton);

        // Меняем начальника
        Department.Employee liz = it.createEmployee("Liz");
        it.setBoss(liz);

        System.out.println("\nПосле смены начальника:");
        System.out.println(alex);
        System.out.println(liz);
        System.out.println(anton);
    }
} */