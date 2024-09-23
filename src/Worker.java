public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String id, String first_name, String last_name, String title, int yearOfBirth, double hourlyPayRate) {
        super(id, first_name, last_name, title, yearOfBirth);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getHourlyPayRate() { return hourlyPayRate; }

    public void setHourlyPayRate(double hourlyPayRate) { this.hourlyPayRate = hourlyPayRate; }

    public double calculateWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            return hoursWorked * hourlyPayRate;
        }
        else {
            return (40 * hourlyPayRate) + ((hoursWorked - 40) * (hourlyPayRate* 1.5));
        }
    }

    public void displayWeeklyPay(double hoursWorked) {
        if (hoursWorked <= 40) {
            System.out.printf("%s has worked %.2f hours.\n", getFirst_name(), hoursWorked);
            System.out.printf("Earning a total of: $%.2f\n\n", calculateWeeklyPay(hoursWorked));
        }
        else {
            System.out.printf("%s has worked %.2f hours.\n", getFirst_name(), hoursWorked);
            System.out.printf("For the first 40 hours, $%.2f of regular pay has been earned.\n", 40 * hourlyPayRate);
            System.out.printf("%.2f hours of overtime has been done to earn: $%.2f\n", (hoursWorked - 40), (hoursWorked - 40) * hourlyPayRate * 1.5);
            System.out.printf("Total pay earned for the week: $%.2f\n\n", calculateWeeklyPay(hoursWorked));
        }
    }

    @Override
    public String toCSV() {
        return super.toCSV() + ", " + String.format("%.2f", hourlyPayRate);
    }

    @Override
    public String toJSON(){
        return super.toJSON() + ":" + String.format("%.2f", hourlyPayRate);
    }

    @Override
    public String toXML(){
        return String.format("<Worker><ID>%s</ID><FirstName>%s</FirstName><LastName>%s</LastName><Title>%s</Title><YOB>%d</YOB><hourlyPayRate>%.2f</hourlyPayRate></Worker>", getId(),getFirst_name(), getLast_name(), getTitle(), getYearOfBirth(), hourlyPayRate);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
