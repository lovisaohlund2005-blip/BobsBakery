// skapar en ny klass PaymentSlip, med tre fält
public class PaymentSlip {
    // skapar tre privata attribut i klassen PaymentSlip
    private String name;
    private double hourlyRate;
    private double hoursWorked;

    // skapar en konstruktor som kräver tre parametrar för att skapa ett PaymentSlip
    // objekt
    public PaymentSlip(String name, Double hourlyRate, Double hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Skapar en getter metod för att returnera namnet på anställd
    public String getName() {
        return name;
    }

    // metod som räknar ut lönen före skatt
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    // metod som räknar ut lönen efter 30% skatt
    public double calculateNetSalary() {
        return calculateSalary() * 0.7;
    }
}