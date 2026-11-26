package se.iths.eitvydas.main;

import se.iths.eitvydas.main.model.AccessCard;
import se.iths.eitvydas.main.model.Department;
import se.iths.eitvydas.main.model.Employee;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Department it = new Department("IT", "Stockholm");
        Department ekonomi = new Department("Ekonomi", "Göteborg");
        Department hr = new Department("HR", "Malmö");

        Employee anna = new Employee("Anna", "Svensson", "anna.svensson@foretag.se",
                LocalDate.of(2021, 3, 15), it);
        Employee erik = new Employee("Erik", "Johansson", "erik.johansson@foretag.se",
                LocalDate.of(2022, 8, 1), it);
        Employee sara = new Employee("Sara", "Lind", "sara.lind@foretag.se",
                LocalDate.of(2023, 1, 10), it);
        Employee ali = new Employee("Ali", "Hassan", "ali.hassan@foretag.se",
                LocalDate.of(2020, 5, 20), ekonomi);
        Employee lina = new Employee("Lina", "Berg", "lina.berg@foretag.se",
                LocalDate.of(2024, 2, 5), ekonomi);


            anna.setAccessCard(new AccessCard("KORT-1001", LocalDate.of(2021, 3, 15), LocalDate.of(2026, 3, 15)));
            erik.setAccessCard(new AccessCard("KORT-1002", LocalDate.of(2022, 8, 1), LocalDate.of(2027, 8, 1)));
            ali.setAccessCard(new AccessCard("KORT-1003", LocalDate.of(2020, 5, 20), LocalDate.of(2025, 5, 20)));

        List<Employee> employees = List.of(anna, erik, sara, ali, lina);

        for (Employee e : employees) {
            String card = "inget kort";
            if (e.getAccessCard() != null) {
                card = e.getAccessCard().getCardNumber();
            }
            IO.println(e.getFirstName() + " " + e.getLastName()
                    + " - " + e.getDepartment().getName()
                    + " - " + card);
        }
    }
}