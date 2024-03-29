public class YourFirstBankTransfer {

    public static void main(String[] args) {
    //  Creates an account named "Matthews account" with the balance 1000
    Account mattsAccount = new Account("Matthews account", 1000.0);
    //  Creates an account named "My account" with the balance 0
    Account myAccount = new Account("My account", 0);
    //  Withdraws 100.0 from Matthew's account
    mattsAccount.withdrawal(100.0);
    //  Deposits 100.0 to "my account"
    myAccount.deposit(100.0);
    //  Prints both the accounts
        System.out.println(mattsAccount);
        System.out.println(myAccount);
    }
}
