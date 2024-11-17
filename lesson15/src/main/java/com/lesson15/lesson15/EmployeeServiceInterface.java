package com.lesson15.lesson15;

import java.util.List;

public interface EmployeeServiceInterface {
    void setPerson(Employee employee) throws EmployeeStorageIsFullException;
    void delPerson(String firstName, String lastName) throws EmployeeNotFoundException;
    List<Employee> getAllEmployees();
}