import java.util.Scanner;


public class Account {

    private String login;
    private String password;
    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;
    public int depositeFunds;
    public int toWithDrawFounds;
    public int action;


    //default values
    public Account() {
        this("unknown", "876354", "0 0000 0000 0000 00", 0.0,
                "Unknown User", "unknown.email@gmail.com", 555_555_555);
    }

    //constructor
    public Account(String login, String password, String accountNumber, double balance, String customerName, String email, int phoneNumber) {
        this.login = login;
        this.password = password;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    //user input
    public void setAction() {
        Scanner choice = new Scanner(System.in);
        this.action = choice.nextInt();
    }

    public int getAction() {
        do {
            if (this.action != 1 && this.action != 2 && this.action != 3 && this.action != 4)
                System.out.println("Incorrect value");
            else
                break;
        } while (true);
        return this.action;
    }


    //access
    public boolean checkAcces() {
        Scanner word = new Scanner(System.in);
        System.out.printf("Login: ");
        String userInputLogin = word.nextLine();
        System.out.printf("Password: ");
        String userInput = word.nextLine();
        if (this.login.equals(userInputLogin) && this.password.equals(userInput))
            return true;
        else
            return false;
    }

    //accountNumber
    public String getAccountNumber() {
        return this.accountNumber;
    }

    //balance
    public double getBalance() {
        return this.balance;
    }

    //customerName
    public String getCustomerName() {
        return this.customerName;
    }

    //email
    public String getEmail() {
        return this.email;
    }

    //phoneNumber
    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    //depositFounds
    public void setDepositFunds() {
        Scanner value = new Scanner(System.in);
        this.depositeFunds = value.nextInt();
        this.balance += this.depositeFunds;
    }

    //withDrawFounds
    public void setToWithDrawFunds() {
        Scanner value = new Scanner(System.in);
        this.toWithDrawFounds = value.nextInt();
        this.balance -= this.toWithDrawFounds;
    }

    //action menu
    public void showMenu() {
        System.out.println("\nAction: ");
        System.out.println("1.Deposit Funds\n2.Withdraw Funds");
        System.out.println("3.Actual Balance\n4.Log Out");
    }
}

