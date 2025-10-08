public class accounts {
    int accountsid;
    String bankname;
    int balance;

    public accounts(int accountsid, String bankname, int balance) {
    this.accountsid = accountsid;
    this.bankname = bankname;
    this.balance = balance;

    }
    
public void showaccountsdetails() {
    System.out.println("Account ID: " + accountsid);
    System.out.println("Bank Name: " + bankname);
    System.out.println("Balance: " + balance);
}

}
