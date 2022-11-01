import java.util.Date;

public class Log {

    private String time;
    private int balanceChange;


    public Log(){
        this.time=Time.now();
        this.balanceChange=0;
    }
    public Log(int balanceChange){
        this.time=Time.now();
        this.balanceChange=balanceChange;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getBalanceChange() {
        return balanceChange;
    }

    public void setBalanceChange(int balanceChange) {
        this.balanceChange = balanceChange;
    }
}
