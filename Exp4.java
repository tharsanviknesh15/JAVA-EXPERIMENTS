class Account {
    String accName;
    String accNum;

    Account(String accName, String accNum) {
        this.accName = accName;
        this.accNum = accNum;
    }

    void displayDetails() {
        System.out.println("Account Name : " + accName);
        System.out.println("Account Number : " + accNum);
    }
}

class SavingsAccount extends Account {
    SavingsAccount(String accName, String accNum) {
        super(accName, accNum);
    }
}

class CurrentAccount extends Account {
    CurrentAccount(String accName, String accNum) {
        super(accName, accNum);
    }
}

class PremiumSavingsAccount extends SavingsAccount {
    PremiumSavingsAccount(String accName, String accNum) {
        super(accName, accNum);
    }
}

public class Exp4 {
    public static void main(String[] args) {
        SavingsAccount saving = new SavingsAccount("Sudharshan", "S101");
        CurrentAccount current = new CurrentAccount("Arun", "C101");
        PremiumSavingsAccount premium = new xp5.javaPremiumSavingsAccount("Kumar", "P101");

        System.out.println("Saving Account Details:");
        saving.displayDetails();

        System.out.println("\nCurrent Account Details:");
        current.displayDetails();

        System.out.println("\nPremium Saving Account Details:");
        premium.displayDetails();
    }
}