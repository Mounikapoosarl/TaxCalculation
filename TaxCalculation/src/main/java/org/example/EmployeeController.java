package org.example;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

    private final List<Employee> employees = new ArrayList<>();

    @RestController
    public class TaxController {

        @GetMapping("/employees/tax-deduction")
        public ResponseEntity<List<TaxDeduction>> getTaxDeduction() {


                List<TaxDeduction> taxDeductions = new ArrayList<>();
                List<Employee> employees = getEmployee();

            for (Employee employee : employees) {
                double yearlySalary = employee.getSalary() * 12;
                double taxAmount = calculateTax(yearlySalary);
                double cessAmount = taxAmount * 0.04;

                TaxDeduction taxDeduction = new TaxDeduction(
                        employee.getFirstName(),
                        employee.getLastName(),
                        yearlySalary,
                        taxAmount,
                        cessAmount
                );

                taxDeductions.add(taxDeduction);
            }

            return new ResponseEntity<>(taxDeductions, HttpStatus.OK);
        }
        private double calculateCessAmount(double yearlySalary) {

            if (yearlySalary > 2500000) {
                return (yearlySalary - 2500000) * 0.02;
            } else {
                return 0;
            }
        }
        private boolean isValidEmployee(Employee employee) {
            return (employee.getEmployeeId() != null && !employee.getEmployeeId().isEmpty()
                    && employee.getFirstName() != null && !employee.getFirstName().isEmpty()
                    && employee.getLastName() != null && !employee.getLastName().isEmpty()
                    && employee.getEmail() != null && !employee.getEmail().isEmpty()
                    && employee.getDoj() != null
                    && employee.getSalary() > 0);
        }
    }
}


