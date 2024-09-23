import static org.junit.jupiter.api.Assertions.*;

class WorkerTest {

    @org.junit.jupiter.api.Test
    void calculateWeeklyPay() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        assertEquals(1000.00, worker.calculateWeeklyPay(40), 0.01);  // 40 * $25 = $1000.00
    }

    @org.junit.jupiter.api.Test
    void displayWeeklyPay() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        assertEquals(1187.50, worker.calculateWeeklyPay(45), 0.01);  // 40 hours at $25 + 5 hours at $37.50 = $1187.50
    }

    @org.junit.jupiter.api.Test
    void toCSV() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        String expectedCSV = "000001, John, Doe, Mr., 1990, 25.00";
        assertEquals(expectedCSV, worker.toCSV());
    }

    @org.junit.jupiter.api.Test
    void toJSON() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        String expectedJSON = "000001:John:Doe:Mr.:1990:25.00";
        assertEquals(expectedJSON, worker.toJSON());
    }

    @org.junit.jupiter.api.Test
    void toXML() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        String expectedXML = "<Worker><ID>000001</ID><FirstName>John</FirstName><LastName>Doe</LastName><Title>Mr.</Title><YOB>1990</YOB><hourlyPayRate>25.00</hourlyPayRate></Worker>";
        assertEquals(expectedXML, worker.toXML());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        Worker worker = new Worker("000001", "John", "Doe", "Mr.", 1990, 25.00);
        String expectedString = "000001     John     Doe     Mr.     1990";
        assertEquals(expectedString, worker.toString());
    }
}