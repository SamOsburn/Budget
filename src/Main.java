import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int budget;
        int months;
        int totalExpense= 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is your allotted budget for the month");
        budget = Integer.parseInt(keyboard.nextLine());

        System.out.println("How many months is the budget covering?");
        months= Integer.parseInt(keyboard.nextLine());
        //use for loop to iterate through the expenses
        for(int i = 1; i <= months; i++){
            System.out.printf("enter cost of expense %d%n ",i);
            int expense1 = Integer.parseInt(keyboard.nextLine());
            totalExpense+= expense1;
           // System.out.print(totalExpense);
        }
        System.out.print(" your budget is  " +  budget);
        System.out.print(" your total expenses are  " + totalExpense);
        System.out.print(" Your leftover money is  ");
        System.out.print( budget - totalExpense);



    }
}