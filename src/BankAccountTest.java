public class BankAccountTest {
    public static void main(String[] args){
        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        int numberOfAccounts = BankAccount.numberOfAccounts();
        
        System.out.println("number of accounts: " + numberOfAccounts);

        System.out.println("-------account1--------");

        account1.deposite(153, "savings");
        account1.withdraw(23, "savings");

        account1.deposite(553, "checking");
        account1.withdraw(56, "checking");

        account1.withdraw(5000000, "savings");

        account1.showTotal();
        System.out.println("----end-----");

        System.out.println("-------account2--------");

        account2.deposite(175, "savings");
        account2.withdraw(50, "savings");

        account2.deposite(133, "checking");
        account2.withdraw(25, "checking");

        account2.withdraw(5000000, "savings");

        account2.showTotal();
        System.out.println("----end-----");
    }
}
