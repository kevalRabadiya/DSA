package ATM_PROJECT;
import java.util.*;

class ATM{
    float balance;
//    Manually Enter Pin, No database Connectivity
    int pin = 5674;

    public void checkpin(){
        System.out.println("Enter your pin:");
        Scanner sc = new Scanner(System.in);
        int Enterpin = sc.nextInt();

        if(Enterpin==pin){
            menu();
        }else{
            System.out.println("Incorrect PIN Number! Please RETRY:");
            checkpin();
        }
    }
    public void menu(){
        System.out.println("Enter your choice:");
        System.out.println("1.Enter A/C Balance");
        System.out.println("2.Enter Withdraw Amount");
        System.out.println("3.Enter Deposite Amount");
        System.out.println("4.Exit");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option==1){
            Checkbalance();
        }else if(option==2){
            WithdrawAmount();
        }else if(option==3){
            DepositeAmount();
        }else if(option==4){
            return;
        }
        else{
            System.out.println("Enter valid choice");
        }
    }
    public void Checkbalance(){
        System.out.println("Balance:" + balance);
        menu();
    }
    public void WithdrawAmount(){
        System.out.println("Enter Amount to withdraw:");
        Scanner sc = new Scanner(System.in);
        float EnterMoney = sc.nextFloat();
        if(balance>EnterMoney){
            balance = balance - EnterMoney;
            System.out.println("Money Withdraw successfully");
            System.out.println("--------------------------");
        }else{
            System.out.println("Insufficient balance");
            System.out.println("--------------------------");

        }
        menu();
    }
    public void DepositeAmount(){
        System.out.println("Enter Amount:");
        Scanner sc = new Scanner(System.in);
        float EnterMoney = sc.nextFloat();
        if(EnterMoney>0){
            balance = balance + EnterMoney;
            System.out.println("Deposite Amount Sucessfully");
            System.out.println("--------------------------");

        }else{
            System.out.println("Enter valid Amount");
        }
        menu();
    }

}
public class ATMMachine {
    public static void main(String[] args) {
        ATM obj = new ATM();
        obj.checkpin();
    }
}
