public class Programmer implements Employee {
    private double hoursWorked;
    private double hourlyRate;
    private String firstName;
    private String lastName;

    public Programmer(String firstName, String lastName, double hoursWorked, double hourlyRate) {

        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double calculationSalary(){
        return this.hourlyRate * this.hoursWorked;
    }

    public String info(){
        return String.format("Сотрудник: %s %s. Тарифная ставка: %.2f", this.lastName, this.firstName, this.hourlyRate);
    }
}