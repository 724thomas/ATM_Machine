import java.time.LocalTime;
import java.util.Date;

public class Account {

    private int balance;
    private Logs logs;

    public Account() {
        this.balance = 0;
        this.logs = new Logs();
    }


    //입금
    public void deposit(int n){
        System.out.println("입금 : " + n + " 원. 현재 잔액 : " + (getBalance()+n) + " 원");

        setBalance(getBalance()+n);
    }

    //출금
    public void withdraw(int n){
        if (n>balance){
            System.out.println("잔액이 부족합니다. 현재 잔액 : " + getBalance() + " 원");
        }else{
            System.out.println("출금 : " + n + " 원. 현재 잔액 : " + (getBalance()-n) + " 원");
            setBalance(getBalance()-n);
        }
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Logs getLogs() {
        return logs;
    }

    public void setLogs(Logs logs) {
        this.logs = logs;
    }
}
