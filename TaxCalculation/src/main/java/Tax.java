import java.util.ArrayList;
import java.util.List;

public class Tax {

        private String LastName;
        private double Salary;
        private double taxAmount;
        private double cessAmount;

        public Tax(String FirstName, String LastName, double Salary, double taxAmount, double cessAmount, int employee){
            this.LastName = LastName;
            this.Salary = Salary;
            this.taxAmount = taxAmount;
            this.cessAmount = cessAmount;

        }



    private double calculateTax(double yearlySalary) {
        double tax = 0;

        if (yearlySalary <= 250000) {
            tax = 0;
        } else if (yearlySalary <= 500000) {
            tax = (yearlySalary - 250000) * 0.05;
        } else if (yearlySalary <= 1000000) {
            tax = (250000 * 0.05) + ((yearlySalary - 500000) * 0.1);
        } else {
            tax = (250000 * 0.05) + (500000 * 0.1) + ((yearlySalary - 1000000) * 0.2);
        }

        return tax;
    }

}
