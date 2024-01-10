public class LegalPerson implements Client{
    private String firstName;
    private String lastName;

    private String numberClient;

    public LegalPerson(String firstName, String lastName, String numberClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberClient = numberClient;
    }

    public String info(){
        return String.format("Клиент №%s:%s %s", this.numberClient, this.lastName, this.lastName);
    }
}
