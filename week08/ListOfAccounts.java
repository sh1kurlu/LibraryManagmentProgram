package week08;
import java.util.*;

class Account {
    private String firstname;
    private String lastname;
    private double balance;

    public Account(String firstname, String lastname, double balance) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", balance=" + balance +
                '}';
    }

    public String getFullname() {
        return firstname + " " + lastname;
    }

    public double getBalance() {
        return balance;
    }
}

public class ListOfAccounts {
    public static void main(String[] args) {
        List<Account> accountList = new ArrayList<>();

        accountList.add(new Account("Mehdi", "Shukurlu", 3000.0));
        accountList.add(new Account("Cavid", "Aghayev", 2000.0));
        accountList.add(new Account("Ramil", "Zohrabli", 2500.0));
        accountList.add(new Account("Kamal", "Mammadov", 1000.0));

        System.out.println("Original List:");
        for (Account account : accountList) {
            System.out.println(account);
        }

        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return account1.getFullname().compareTo(account2.getFullname());
            }
        });

        System.out.println("\nSorted by fullname:");
        for (Account account : accountList) {
            System.out.println(account);
        }

        Collections.sort(accountList, new Comparator<Account>() {
            @Override
            public int compare(Account account1, Account account2) {
                return Double.compare(account1.getBalance(), account2.getBalance());
            }
        });

        System.out.println("\nSorted by balance:");
        for (Account account : accountList) {
            System.out.println(account);
        }
    }
}
