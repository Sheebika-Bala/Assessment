//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int factorial=1;
        int number=3;
        for(int i=1;i<=number;i++){
            factorial=factorial*i;
        }
        System.out.println("The factorial of a given number is: " +factorial);
    }
}