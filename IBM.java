import java.util.Scanner;

public class IBM {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        double yourHeight,yourWeight,bmi;
        System.out.println("your height is: ");
        yourHeight=scanner.nextDouble();

        System.out.println("you weightis: ");
        yourWeight=scanner.nextDouble();

        bmi=yourWeight/Math.pow(yourHeight,2);

        if (bmi<=18)
            System.out.println("you are underweight");
        else if (bmi>18 && bmi<25.0)
            System.out.println("you are normal");
        else if (bmi>=25 && bmi<30)
            System.out.println("you are overwieght");
        else
            System.out.println("ar you human");

    }
}
