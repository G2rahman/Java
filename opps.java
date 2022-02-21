//package calculator;
import java.util.Scanner;

public class opps{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your operator ( +, -, *, / )");
        //Scan the user input and put it in a variable
        //char operator=scan
        String operator=scan.nextLine();
        //>>>userinput was assigned to operator variable//System.out.println(operator);
        System.out.println("Enter number one");
        double dnum1=scan.nextDouble();
        //System.out.println(dnum1);
        System.out.println("Enter number two");
        double dnum2=scan.nextDouble();
        //double dnum1; 
        //double dnum2;       
        scan.nextLine();
        //input.close();
        switch(operator) {
            case "+":
                 double sum=dnum1 + dnum2;
                System.out.println(sum);
            case "-":
                double sub=dnum1 - dnum2;
                System.out.println(sub);
            case "*":
                double mult=dnum1 * dnum2;
                System.out.println(mult);
            case "/":
                double quote=dnum1 / dnum2;
                System.out.println(quote);
                break;
            default:
                if(dnum1<1 && dnum2>5)
                System.out.println("N/A");
        }
    }
}