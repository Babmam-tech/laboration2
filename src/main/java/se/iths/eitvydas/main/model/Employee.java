package se.iths.eitvydas.main.model;

import java.time.LocalDate;

public class Employee {
    private Integer employeeId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate hireDate;

    private Department department;
    private AccessCard accessCard;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, Department department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        this.department = department;
    }

    public void setAccessCard(AccessCard accessCard) {
        this.accessCard = accessCard;
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public Department getDepartment() {
        return department;
    }

    public AccessCard getAccessCard() {
        return accessCard;
    }
}
