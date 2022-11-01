import java.util.Arrays;

public class Logs {

    private Log[] logs;

    public Logs(){
        this.logs=new Log[]{new Log()};
    }

    public void addLog(Log newLog){
        Log[] tempLogs = new Log[this.logs.length+1];
        for(int i=0; i<this.logs.length; i++){
            tempLogs[i] = this.logs[i];
        }
        tempLogs[this.logs.length] = newLog;
        this.logs = tempLogs;
    }

    public void showLogs(){
        for(Log logs:logs){
            System.out.print(logs.getTime() + " " + logs.getBalanceChange() + "원");
        }
    }
}
