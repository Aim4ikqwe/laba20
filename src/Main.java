import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);      System.out.println("Введите х");      double x = input.nextDouble();      System.out.println("Введите y");      double y = input.nextDouble();      calculator.result.values(x,y);      System.out.println(calculator.result.calculate());   }
}
enum calculator {
    result;   private double x, y;   public void values(double x, double y){
        this.x = x;      this.y = y;   }
    public double calculate(){
        return 2*x+3/y;   }
}
