import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        //control incorrect password
        int incorrectLoginPassword = 3;

        Account userAccount = new Account("Przemek", "haslo", "40 2533 0000 0987 1498", 5_600.49,
                "Przemysław Turalski", "przemko7ko@gmail.com", 656_987_000);


        System.out.println("Welcome to TL International Mobile Bank\n");

        //information and account access
        while (true) {

            if (userAccount.checkAcces()) {
                System.out.println("\nWelcome !");
                System.out.println("Account owner: " + userAccount.getCustomerName());
                System.out.println("Email address: " + userAccount.getEmail());
                System.out.println("Phone number: " + userAccount.getPhoneNumber());
                System.out.println("Account number: " + userAccount.getAccountNumber());
                System.out.println("Balance: " + userAccount.getBalance() + "PLN");
                break;
            } else {
                incorrectLoginPassword--;
                if (incorrectLoginPassword == 0)
                    System.exit(0);
                System.out.println("Incorrect login or password (" + incorrectLoginPassword + " attempts left)\n");
                //System.out.print("Enter password once again: ");
            }
        }
        //printing menu on screen
        userAccount.showMenu();

        while (true) {
            //user input
            userAccount.setAction();

            switch (userAccount.getAction()) {
                case 1:
                    System.out.printf("Enter your value: ");
                    userAccount.setDepositFunds();
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Transfer completed \u2713");
                    break;
                case 2:
                    System.out.printf("Enter your value: ");
                    userAccount.setToWithDrawFunds();
                    TimeUnit.SECONDS.sleep(2);
                    System.out.println("Withdraw completed \u2713");
                    break;
                case 3:
                    System.out.println(userAccount.getBalance());
                    break;
                case 4:
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("logged out Successfully");
                    System.exit(0);
                    break;
            }

            userAccount.showMenu();
        }

    }
}
