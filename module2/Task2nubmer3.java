package module2;

import static module2.Task2number2.withdrawalBalanse;

public class Task2nubmer3 {
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static double[] balances = {1200, 250, 2000, 500, 3200};

    public static void main(String[] args) {

        String ownerName = "Ann";
        double withdrawal = 100;

        int i = 0;
        while (i < ownerName.length()+1){ // почему тут ownerName.length() = 3 ???
            if(ownerNames[i].contains(ownerName) && withdrawal + (withdrawal * 0.05) < balances[i]){
                System.out.println(ownerNames[i] + " " + withdrawal + " " + withdrawalBalanse(balances[i],withdrawal,0.5));
            }else if (ownerNames[i].contains(ownerName) && withdrawal + (withdrawal * 0.05) >= balances[i]){
                System.out.println(ownerNames[i] + " No");
            }
            i++;
        }
    }
}
