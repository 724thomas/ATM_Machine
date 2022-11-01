public class User {

    private Account[] accounts;
    private String idAndAccount;
    private String id;
    private String password;
    private Account account;
    private String time;


    public User() {
    }

    public User(String Id, String password, Account account){
        this.idAndAccount=Id + account;
        this.id=Id;
        this.password=password;
        this.account=account;
    }


    public String getIdAndAccount() {
        return idAndAccount;
    }
    public void setIdAndAccount(String idAndAccount) {
        this.idAndAccount = idAndAccount;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public Account getAccount() {
        return account;
    }
    public void setAccount(Account account) {
        this.account = account;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
}
