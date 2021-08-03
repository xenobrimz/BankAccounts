public class BankAccount {
    private double checkingBalance = 0;
    private double savingBalance = 0;
    private static int accounts = 0;
    public BankAccount(){    
        accounts++;
    }

    public static int numberOfAccounts(){
        return accounts;
    }

    public double getCheckingBalance(){
        return checkingBalance;
    }

    public double getSavingBalance(){
        return savingBalance;
    }

    public void deposite(double ammount, String account){
        if(account == "savings"){
            savingBalance += ammount;
            System.out.println("made deposite of $" + ammount + " into savings");
        } else if(account == "checking"){
            checkingBalance += ammount;
            System.out.println("made deposite of $" + ammount + " into checking");
        }
    }

    public void withdraw(double ammount, String account){
        if(account == "savings" && savingBalance - ammount > 0){
            savingBalance -= ammount;
            System.out.println("made withdrawl of $" + ammount + " into savings");
        } else if(account == "checking" && checkingBalance - ammount > 0){
            checkingBalance -= ammount;
            System.out.println("made withdrawl of $" + ammount + " into checking");
        }
        else{
            System.out.println("Insufficient funds");
        }
    }

    public void showTotal(){
        System.out.println("Total: " +checkingBalance + savingBalance);
    }

}
