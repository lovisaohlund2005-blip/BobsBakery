
// importerar scanner namespacet 
import java.util.Scanner;

//skapar klassen som är programmets entry point
public class App {
    // main metoden som anropas när programmet körs
    public static void main(String[] args) throws Exception {
        // skapar ett scanner-objekt som läser indata från användaren
        Scanner input = new Scanner(System.in);

        // skriver ut text i konsolen
        System.out.println("What is the employee´s name?");

        // läser vad användaren skriver in och sparar det i variabeln name
        String name = input.nextLine();

        // ber användaren mata in hourlyRate
        System.out.println("What is their hourly rate?");
        // läser in hourlyRate och sparar det i variabeln hourlyRate
        Double hourlyRate = input.nextDouble();

        // ber användaren mata in hoursWorked
        System.out.println("How many hours did they work this month?");
        // läser in hoursWorked och sparar det i variabeln hoursWorked
        Double hoursWorked = input.nextDouble();

        // skapar en variabel av typen PaymentSlip med namnet ps, och tilldelar den ett
        // nytt paymentslip-objekt
        PaymentSlip ps = new PaymentSlip(name, hourlyRate, hoursWorked);

        System.out.println("Calculating ...");

        // skriver ut paymentslip information där både salary och netsalary räknas ut
        // genom att anropa metoderna på paymentslip objektet
        System.out.println("--------------------");
        System.out.println("## PAYMENT INFORMATION ##");
        System.out.println();
        System.out.println("Name: \t\t" + ps.getName());
        System.out.println("Hourly Rate: \t$" + hourlyRate);
        System.out.println("Hours Worked: \t" + hoursWorked);
        System.out.println();
        System.out.println("Salary before tax: \t$" + ps.calculateSalary());
        System.out.println("Salary after tax: \t$" + ps.calculateNetSalary());
        System.out.println();
        System.out.println("If you have any questions regarding your salary, contact Bob.");
        System.out.println("--------------------");

        // säger till programmet att jag inte kommer läsa mer från konsolen
        input.close();
    }
}