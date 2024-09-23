import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryWorkerTest {

    @Test
    void calculateWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        assertEquals(1000.00, salaryWorker.calculateWeeklyPay(40), 0.01);  // 52000 / 52 weeks = 1000.00
    }

    @Test
    void displayWeeklyPay() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        salaryWorker.displayWeeklyPay(40);  // This will output to console, so you'll manually verify it for now
    }

    @Test
    void toCSV() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        String expectedCSV = "000001, Alice, Smith, Mrs., 1980, 52000.00";
        assertEquals(expectedCSV, salaryWorker.toCSV());
    }

    @Test
    void toJSON() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        String expectedJSON = "000001:Alice:Smith:Mrs.:1980:52000.00";
        assertEquals(expectedJSON, salaryWorker.toJSON());
    }

    @Test
    void toXML() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        String expectedXML = "<SalaryWorker><ID>000001</ID><FirstName>Alice</FirstName><LastName>Smith</LastName><Title>Mrs.</Title><YOB>1980</YOB><annualSalary>52000.00</annualSalary></SalaryWorker>";
        assertEquals(expectedXML, salaryWorker.toXML());
    }

    @Test
    void testToString() {
        SalaryWorker salaryWorker = new SalaryWorker("000001", "Alice", "Smith", "Mrs.", 1980, 52000);
        String expectedString = "000001     Alice     Smith     Mrs.     1980";
        assertEquals(expectedString, salaryWorker.toString());
    }
}