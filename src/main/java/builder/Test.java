package builder;

public class Test {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount
                                    .builder()
                                    .name("David McGibbon")
                                    .accountNumber("123456789")
                                    .build();

        System.out.println(bankAccount.getName());
        System.out.println(bankAccount.getAccountNumber());
    }
}
