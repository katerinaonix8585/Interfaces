public class Admin implements Authorization{
    private String login;
    private String password;

    public Admin(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public boolean authorization(String login, String password){
        if (this.login == login && this.password == password) {
            return true;
        }else return false;
    }
}
