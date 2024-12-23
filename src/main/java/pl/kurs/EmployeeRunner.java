package pl.kurs;

public class EmployeeRunner {
    public static void main(String[] args) {
        Employee employee = new Employee("Tomasz", "Piekarski",5000);
        Employee employee2 = new Employee("Tomasz", "Piekarski",5000);
        Employee employee3 = new Employee("Tomasz", "Piekarski",15000);

        System.out.println(employee == employee2);
         //false, dwa różne adresy w pamięci

        System.out.println(employee.equals(employee2));
        System.out.println(employee.hashCode());
        System.out.println(employee2.hashCode());
        System.out.println(employee3.hashCode());

        System.out.println(employee.getClass());
        System.out.println(employee.getClass().getSimpleName());

    }
}
