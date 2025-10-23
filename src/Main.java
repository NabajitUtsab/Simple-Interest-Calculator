import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int principal;
        float interestRate;
        String year;

        System.out.print("Please enter the principle : ");
        principal = sc.nextInt();
        System.out.println();

        System.out.print("Please enter the interest rate : ");
        interestRate = sc.nextFloat();
        System.out.println();

        System.out.print("Please enter the year : ");
        year = sc.next();
        System.out.println();

        int time = Integer.parseInt(year.substring(0,year.length()-1));
        char c = year.charAt(year.length()-1);

        if(c == 'm'){     // if time in month then coverting it into year
            time=time/12;
        }


        double interest = ( principal * interestRate * time )/100;


        System.out.println("Your interest is : " + interest + " taka ");

    }
}