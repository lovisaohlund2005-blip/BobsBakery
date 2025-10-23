// skapar en ny klass PaymentSlip, med tre fält
public class PaymentSlip {
    // skapar tre privata attribut i klassen PaymentSlip
    private String name;
    private int hourlyRate;
    private int hoursWorked;

    // skapar en konstruktor som kräver tre parametrar för att skapa ett PaymentSlip
    // objekt
    public PaymentSlip(String name, int hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Skapar en getter metod för att returnera namnet på anställd
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourlyRate(int hourlyrate) {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHoursWorked(int hoursWorked) {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    // metod som räknar ut lönen före skatt
    public int calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // metod som räknar ut lönen efter 30% skatt
    public double calculateNetSalary() {
        return calculateSalary() * 0.7;
    }
}