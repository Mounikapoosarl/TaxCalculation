package org.example;

import java.util.ArrayList;
import java.util.List;



    public class Employee {

        public List<Employee> employees = new ArrayList<>();
        public String employeeId;
        public String firstName;
        public String lastName;
        public String email;
        public long phoneNumber;
        public String doj;
        public double salary;


        public  Employee(String employeeId, String firstName,String lastName, String email, long phoneNumber,String doj,long salary) {

        }
        public String getEmployeeId() {
            return employeeId;
        }

        public void setEmployeeId(String employeeId) {
            this.employeeId = employeeId;
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

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public double getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(long phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getDoj() {
            return doj;
        }

        public void setDoj(String doj) {
            this.doj = doj;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
    }


