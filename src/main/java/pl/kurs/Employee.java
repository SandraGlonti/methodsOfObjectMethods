package pl.kurs;

import java.util.Objects;

public class Employee {
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Sprawdzamy adres w pamieci, jezeli rowny to obiekty sa takie same
        if (o == null || getClass() != o.getClass()) return false; // Sprawdzamy czy obiekt z argumentu jest nullem
                                                        // badz ma inna klase, jezeli tak to obiekty NIE sa rowne
        Employee employee = (Employee) o; // Rzutowanie na klase Employee
        return Double.compare(salary, employee.salary) == 0 && Objects.equals(firstName, employee.firstName)
                && Objects.equals(lastName, employee.lastName); // Sprawdzenie czy wszystkie wartosci sa rowne
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary);
    }
}
