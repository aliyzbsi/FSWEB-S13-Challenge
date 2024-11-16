package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runExample();
    }

    public static void runExample() {

        Healthplan plan1 = new Healthplan(1, "Health Plan 1", Plan.BASIC);
        Healthplan plan2 = new Healthplan(2, "Health Plan 2", Plan.PREMIUM);
        System.out.println(plan1);
        System.out.println(plan2);


        String[] healthPlans = new String[5];
        Employee emp1 = new Employee(1, "John Doe", "johndoe@example.com", "password123", healthPlans);
        emp1.addHealthPlan(0, "BASIC");
        System.out.println(emp1);


        String[] devNames = new String[5];
        Company company = new Company(1, "TechCorp", 1000000.0, devNames);
        company.addEmployee(0, "Alice");
        System.out.println(company);


        System.out.println(plan1.getPlan().getPrice());
    }
}
