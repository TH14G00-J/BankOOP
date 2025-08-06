import entities.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account account;
        double value;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();

        char answer;
        System.out.print("Is there an initial deposit (y/n)? ");
        answer = sc.next().toUpperCase().trim().charAt(0);

        if (answer == 'Y') {
            System.out.print("Enter the deposit value: ");
            value = sc.nextDouble();
            account  = new Account(holder, number, value);
        }else {
            account  = new Account(holder, number);
        }

        System.out.println("Account data: ");
        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        value = sc.nextDouble();
        account.deposit(value);

        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("Enter a withdraw value: ");
        value = sc.nextDouble();
        account.withdraw(value);

        System.out.println("Updated account data: ");
        System.out.println(account);
    }
}