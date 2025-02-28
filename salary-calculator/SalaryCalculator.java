public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        return daysSkipped >= 5 ? 0.85 : 1.0;
    }

    public int bonusMultiplier(int productsSold) {
        return productsSold >= 20 ? 13 : 10;
    }

    public double bonusForProductsSold(int productsSold) {
        return bonusMultiplier(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double totalSalary = salaryMultiplier(daysSkipped) * 1000.00 + bonusForProductsSold(productsSold);
        return  totalSalary <= 2000.00 ? totalSalary: 2000.00;

    }
}
