package module2;

import static module2.Task2number2.withdrawalBalanse;

public class Task2nubmer3 {

    public static void main(String[] args) {
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
        int[] balances = {1200, 250, 2000, 500, 3200};
        String ownerName = "Ann";
        int withdrawal = 100;
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
