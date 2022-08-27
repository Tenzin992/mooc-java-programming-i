
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mathews = new Account("Matthews account", 1000.0);
        Account name = new Account("My account", 0);
        
        mathews.withdrawal(100);
        name.deposit(100);
        
        System.out.println(mathews);
        System.out.println(name);
    }
}
