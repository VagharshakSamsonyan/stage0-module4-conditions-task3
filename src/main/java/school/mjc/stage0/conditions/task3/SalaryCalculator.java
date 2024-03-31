package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary < 0) {
            System.out.println("wrong input!");
        } else {
            double taxes;
            if (salary <= 10000) {
                taxes = salary * 0.15;
            } else if (salary <= 20000) {
                taxes = salary * 0.18;
            } else {
                taxes = salary * 0.20;
            }
            double netSalary = salary - taxes;
            System.out.println(netSalary);
        }
    }

    public static void main(String[] args) {
        SalaryCalculator calculator = new SalaryCalculator();
        calculator.calculateSalary(8000); // Example usage
    }
}
