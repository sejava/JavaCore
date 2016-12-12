package module2;

public class Task2number2 {

    public static double withdrawalBalanse(double balase,double withdrawal,double procent){
        balase = balase - (withdrawal + (withdrawal * (procent / 10)));
        return balase;
    }

    public static void main(String[] args) {
        double balase = 100;
        double withdrawal = 10;
        double procent = 0.5;
        if (withdrawal+withdrawal*procent > balase)
            System.out.println("NO");
         else
        System.out.println("OK " + procent + " " + withdrawalBalanse(balase,withdrawal,procent));
    }
}
