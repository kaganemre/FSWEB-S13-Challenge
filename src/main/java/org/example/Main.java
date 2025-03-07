package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        checkObjects();
    }

    private static void checkObjects() {
        Healthplan healthplan =  new Healthplan(1, "B Sigorta", Plan.BASIC);
        System.out.println(healthplan);

        String[] healthplans = new String[2];
        healthplans[0] = healthplan.getName();
        Employee employee = new Employee(1, "Jane Doe", "jane@info.com", "123", healthplans);
        System.out.println(employee);

        String[] employees = new String[2];
        employees[0] = employee.getFullName();
        Company company = new Company(1, "ESP Guitars", -1, employees);
        System.out.println(company);
    }

}