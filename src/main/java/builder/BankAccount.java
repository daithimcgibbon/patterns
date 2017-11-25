package builder;

public class BankAccount {

    private String name;
    private String accountNumber;

    public BankAccount(builder bankAccountBuilder) {
        this.name = bankAccountBuilder.name;
        this.accountNumber = bankAccountBuilder.accountNumber;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static class builder {

        private String name;
        private String accountNumber;

        public builder name(String name) {
            this.name = name;
            return this;
        }

        public builder accountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }

    }

}
