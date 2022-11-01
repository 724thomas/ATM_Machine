import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Users.addUser(new User("thomas","724",new Account()));
        User thomas = Users.getUserFromId("thomas");
        Users.showUsersAndPassWords();
        Users.checkUserIdExists("thomas");
        Users.checkUserIdExists("thomas1");
        Users.checkUserIdAndPassword("thomas","thomas");
        Users.checkUserIdAndPassword("thomas","724");

        Accounts testAccounts= new Accounts();
        for(Account Account:testAccounts.getAccounts()){
            Account.getLogs().showLogs();
        }


    }
}
