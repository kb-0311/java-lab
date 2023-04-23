// CODE BY KANISHKA BANSODE 112115070   
import java.util.Scanner;

public class bankingSystem {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Enter Your Full Name");
        String name = ob.nextLine();
        System.out.println("Enter Your Amount you want to deposit");
        System.out.println("Min Balance should be 500");
        int bal = ob.nextInt();
        if (bal<500) {
            System.out.println("Invalid bal");    
            ob.close();
            return ;    
        }
        Account a = new Account(name, bal);
        char c = 'g';
        while (c!='q') {
            System.out.println("enter q to quit");
            System.out.println("Hello, "+a.name+"Would you like to -");
            System.out.println("a) Withdraw");
            System.out.println("b) Deposit");
            System.out.println("c) Show Current Balance");
            c = ob.next().charAt(0);
            switch (c) {
                case 'a':
                    System.out.println("Enter amount to withdraw");
                    int amtw = ob.nextInt();
                    System.out.println("Current bal - "+ a.withdraw(amtw));
                    break;
                case 'b':
                    System.out.println("Enter amount to deposit");
                    int amtd = ob.nextInt();
                    System.out.println("Current bal - "+ a.deposit(amtd));
                    break;
                case 'c':
                    a.showBalance();
                    break;
                default:

                    break;
            }

        }

        ob.close();

    }
}

/**
 * InnerbankingSystem
 */
class Account {
    int bal;
    String name;
    Account(String name , int bal) {
        this.bal = bal;
        this.name = name;
    }

    boolean check(int amt) {
        if (this.bal-amt<500) {
            return false;
        }
        return true;
    }
    
    int withdraw(int amt) {
        if(!check(amt)){
            System.out.println("after deduction bal < 500 so transaction failed");
        } else {
            this.bal-=amt;
            System.out.println("amt successfully withdrawn"); 
        }


        return this.bal;
    }

    int deposit(int amt) {
        this.bal+=amt;
        System.out.println("amt successfully deposit");
        return this.bal;
    }

    void showBalance(){
        System.out.println("Current balance = "+this.bal);
    }

}



