import java.util.Scanner;

public class MethodOverloading {
    public int Add(int a,int b,int c)
    {
        return (a+b+c);

    }
    public double Add(int a , double c)
    {
        return (a+c);
    }
    public double Add(double c, int b){
        return (c+b);
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = s.nextInt();
        System.out.println("Enter second  number(integer): ");
        int b=s.nextInt();
        System.out.println("Enter second  number(double): ");
        double c=s.nextDouble();
        MethodOverloading m=new MethodOverloading();
        System.out.println("Sum: "+(m.Add(a,b,a)));
        System.out.println("Sum: "+(m.Add(a,c)));
        System.out.println("Sum: "+(m.Add(c,b)));



    }
}
