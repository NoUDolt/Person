public class SalaryWorker extends Worker{
    private double annualSalary;

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public SalaryWorker(String id, String first_name, String last_name, String title, int yearOfBirth, double annualSalary) {
        super(id, first_name, last_name, title, yearOfBirth, 0);
        this.annualSalary = annualSalary;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        return annualSalary / 52;
    }

    public void displayWeeklyPay(double hoursWorked) {
        System.out.printf("%s has made: $%.2f a week.\n", getFirst_name(), calculateWeeklyPay(hoursWorked));
        System.out.printf("Which comes up to: $%.2f a year.\n\n", annualSalary);
    }

    @Override
    public String toCSV() {
        return getId() + ", " +
                getFirst_name() + ", " +
                getLast_name() + ", " +
                getTitle() + ", " +
                getYearOfBirth() +
                ", " + String.format("%.2f", annualSalary);
    }

    @Override
    public String toJSON(){
        return getId() + ":" +
                getFirst_name() + ":" +
                getLast_name() + ":" +
                getTitle() + ":" +
                getYearOfBirth() +
                ":" + String.format("%.2f", annualSalary);
    }

    @Override
    public String toXML(){
        return String.format("<SalaryWorker><ID>%s</ID><FirstName>%s</FirstName><LastName>%s</LastName><Title>%s</Title><YOB>%d</YOB><annualSalary>%.2f</annualSalary></SalaryWorker>",
                getId(),getFirst_name(), getLast_name(), getTitle(), getYearOfBirth(), getAnnualSalary());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
