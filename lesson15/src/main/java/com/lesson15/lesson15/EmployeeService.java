package com.lesson15.lesson15;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();
    private static final int MAX_EMPLOYEES = 5;

    public void addPerson(String firstName, String lastName) throws EmployeeStorageIsFullException {
        if (employees.size() >= MAX_EMPLOYEES) {
            throw new EmployeeStorageIsFullException("Превышен лимит сотрудников.");
        }
        Employee employee = new Employee(firstName, lastName);
        employees.add(employee);
        // Добавьте логирование, чтобы отслеживать добавление
        System.out.println("Сотрудник добавлен: " + firstName + " " + lastName);
    }

    public void delPerson(String firstName, String lastName) throws EmployeeNotFoundException {
        boolean removed = employees.removeIf(employee ->
                employee.getFirstName().equals(firstName) && employee.getLastName().equals(lastName));

        if (!removed) {
            throw new EmployeeNotFoundException("Сотрудник не найден: " + firstName + " " + lastName);
        }
    }

    public List<Employee> getAllEmployees() {
        return new ArrayList<>(employees);
    }

}