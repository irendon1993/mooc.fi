
public class YourFirstAccount {

    public static void main(String[] args) {
        // creates an account with a balance of 100.0
        Account myAccount = new Account("Isaac's Account", 100.0);
        
        // deposits 20.0 in it,
        myAccount.deposit(20.0);
        
        // and finally prints the balance.
        System.out.println(myAccount.saldo());
    }
}
