import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /*
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /** */
        CHECKINGS,
        /** */
        SAVINGS,
        /** */
        STUDENT,
        /** */
        WORKPLACE
    }

    private int accountNumber;
    public BankAccountType accountType;
    private double accountBalance;
    private String ownerName;
    public double interestRate;
    private double interestEarned;

    /**
     * dafd
     * @param name asdfsd
     * @param accountCategory adsf
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        /*
         * Implement this function
         */
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.totalAccounts++;
    }

    /*
     * Implement getters and setters as appropriate for private variables.
     */
    /** */
    public int getAccountNumber() {
        return accountNumber;
    }
    /** @param setAccountNumber  sdf*/
    public void setAccountNumber(final int setAccountNumber) {
        this.accountNumber = setAccountNumber;
    }

    /** */
    public double getAccountBalance() {
        return accountBalance;
    }

    /** @param setAccountBalance dfa*/
    public void setAccountBalance(final double setAccountBalance) {
        this.accountBalance = setAccountBalance;
    }

    /** */
    public String getOwnerName() {
        return ownerName;
    }

    /** @param setOwnerName dsklfj*/
    public void setOwnerName(final String setOwnerName) {
        this.ownerName = setOwnerName;
    }
}