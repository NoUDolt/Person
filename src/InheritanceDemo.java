import java.util.ArrayList;


public class InheritanceDemo {
    public static void main(String[] args) {
        ArrayList<Worker> workers = new ArrayList<>();

        // Creating 3 Worker objects
        workers.add(new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00));
        workers.add(new Worker("000002", "Jane", "Doe", "Ms.", 1985, 30.00));
        workers.add(new Worker("000003", "Jim", "Joe", "Mr.", 1975, 20.00));

        // Creating 3 SalaryWorker objects
        workers.add(new SalaryWorker("000004", "Alice", "Smith", "Mrs.", 1980, 52000));
        workers.add(new SalaryWorker("000005", "Bob", "Jones", "Mr.", 1970, 62000));
        workers.add(new SalaryWorker("000006", "Charlie", "Brown", "Mr.", 1995, 72000));

        double[] hoursWorked = {40, 50, 40};

            for (int week = 0; week < 3; week++) {
                System.out.println("\nWeek " + (week + 1) + ": ");
                for (Worker worker : workers) {
                    worker.displayWeeklyPay(hoursWorked[week]);
                }
            }

    }
}