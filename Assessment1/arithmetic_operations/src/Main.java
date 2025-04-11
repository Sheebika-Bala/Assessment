import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char operator;
        double num1,num2,result;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the first number : ");
        num1 = sc.nextInt();

        System.out.print("Enter the second number : ");
        num2 = sc.nextInt();


        System.out.print("Enter the arithmetic operator to be performed : + , - , * , / , % : ");
        operator=sc.next().charAt(0);

        switch(operator){
            case '+':
                result=num1+num2;
                System.out.print(num1 + " + " +num2 +" = " +result);
                break;

            case '-':
                result=num1-num2;
                System.out.print(num1 + " - " +num2 +" = " +result);
                break;

            case '*':
                result=num1*num2;
                System.out.print(num1 + " * " +num2 +" = " +result);
                break;

            case '/':
                result=num1/num2;
                System.out.print(num1 + " / " +num2 +" = " +result);
                break;

            case '%':
                result=num1%num2;
                System.out.print(num1 + " % " +num2 +" = " +result);
                break;

            default:
                System.out.print("Enter a valid operator");

        }
    }
}