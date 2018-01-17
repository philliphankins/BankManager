import java.util.Date;

public class BankManager {

    public static void main(String[] args) {

        class BankAccount {
            String acctNumber;
            double balance;
        }

        class Checking extends BankAccount{
            double limit;
        }

        class Savings extends BankAccount{
            int transfers;
        }

        class COD extends BankAccount{
            Date expiry;



        }


    }

}
