package com.lesson15.lesson15;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/person")
public class EmployeeController {
    private final EmployeeService employeeService;

    private static final String STATUS = "status";
    private static final String MESSAGE = "message";

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/add")
    public ResponseEntity<?> addPerson(@RequestParam("name") String firstName, @RequestParam("surname") String lastName) {
        System.out.println("Полученные данные: Имя = " + firstName + ", Фамилия = " + lastName); // Помощь в проверке переданных значений
        try {
            employeeService.addPerson(firstName, lastName);
            return new ResponseEntity<>(new Employee(firstName, lastName), HttpStatus.CREATED); // Вернуть добавленного сотрудника
        } catch (EmployeeStorageIsFullException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Ошибка: " + e.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

    @GetMapping(path = "/del")
    public String delPerson(@RequestParam("name") String firstName, @RequestParam("surname") String lastName) {
        try {
            employeeService.delPerson(firstName, lastName);
            return "Пользователь " + firstName + " " + lastName + " удален";
        } catch (EmployeeNotFoundException e) {
            return "Ошибка: " + e.getMessage();
        }
    }
    @GetMapping("/all") // Путь для получения всех сотрудников
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees(); // Возвращаем список сотрудников
    }
}