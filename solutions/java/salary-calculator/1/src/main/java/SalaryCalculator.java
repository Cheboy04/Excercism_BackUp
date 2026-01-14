public class SalaryCalculator {
    public double salaryMultiplier(int daysSkipped) {
        double salaryMult = daysSkipped < 5 ? 1.0 : 0.85;
        return salaryMult;
    }

    public int bonusMultiplier(int productsSold) {
        int bonusMult = 10;
        bonusMult = productsSold >= 20 ? bonusMult = 13 : bonusMult;
        return bonusMult;
    }

    public double bonusForProductsSold(int productsSold) {
        double bonusSold = bonusMultiplier(productsSold);
        return bonusSold * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        double salary = salaryMultiplier(daysSkipped) * 1000;
        double bonusSold = bonusForProductsSold(productsSold);
        double finalSal = salary + bonusSold;
        int maxSal = 2000;
        return finalSal <= 2000 ? finalSal : maxSal;
    } 
}
