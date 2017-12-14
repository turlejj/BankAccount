public class Main {
    public static void main(String[] args){

        Account userAccount = new Account("40 2533 0000 0987 1498",5_600.49,
                "Przemysław Turalski","przemko7ko@gmail.com",656_987_000);


        System.out.println("Welcome to TL International Mobile Bank\n");
        System.out.printf("Please enter your password: ");

        while(true) {
            if (userAccount.checkAcces()) {
                System.out.println("\nWelcome mr.Turalski");
                System.out.println("Account owner: " + userAccount.getCustomerName());
                System.out.println("Email address: " + userAccount.getEmail());
                System.out.println("Phone number: " + userAccount.getPhoneNumber());
                System.out.println("Account number: " + userAccount.getAccountNumber());
                System.out.println("Balance: " + userAccount.getBalance() + "PLN");
                break;
            }
            else {
                System.out.println("Incorrect password");
                System.out.print("Enter password once again: ");
            }
        }

        System.out.println("\nAction: ");
        System.out.println("1.Deposit Funds\n2.Withdraw Funds");

        userAccount.setAction();

        switch (userAccount.getAction()){
            case 1:
                System.out.printf( "Enter your value: ");
                userAccount.setDepositFunds();
                break;
            case 2:
                System.out.printf( "Enter your value: ");
                userAccount.setToWithDrawFunds();
                break;
        }

        System.out.println("\nFinal account balance: " + userAccount.getBalance());
    }
}
