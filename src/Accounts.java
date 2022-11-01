public class Accounts {

    Account[] accounts;

    public Accounts() {
        this.accounts = new Account[]{new Account()};
    }

    public void addAccount(Account newAccount){
        Account[] tempAccounts = new Account[this.accounts.length+1];
        for(int i=0; i<this.accounts.length; i++){
            tempAccounts[i] = this.accounts[i];
        }
        tempAccounts[this.accounts.length] = newAccount;
        this.accounts = tempAccounts;
    }

    public Account[] getAccounts() {
        return accounts;
    }

    public void setAccounts(Account[] accounts) {
        this.accounts = accounts;
    }
}
