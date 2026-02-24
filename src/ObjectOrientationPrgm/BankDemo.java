package ObjectOrientationPrgm;


    class BankAccount {

        private int accountNumber;
        private double balance;

        BankAccount(int accNo, double bal) {
            accountNumber = accNo;
            balance = bal;
        }

        public void deposit(double amount) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient balance");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public class BankDemo {
        public static void main(String[] args) {

            BankAccount acc = new BankAccount(12345, 5000);

            acc.deposit(1000);
            acc.withdraw(2000);

            System.out.println("Current Balance: " + acc.getBalance());
        }
    }

