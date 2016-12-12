package module2;

/**
 * Created by pan on 12.12.16.
 */
public class Task2nubmer4 {

    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
    static int[] balances = {1200, 250, 2000, 500, 3200};

    public static void main(String[] args) {
        String ownerName = "Ann";
        double withdrawal = 100;
        System.out.println( ownerName + " " +foundBalance(ownerName, withdrawal));
    }

    public static double foundBalance(String ownerName, double found){
        int i = 0;
        while (i < ownerName.length()+1){
            if(ownerNames[i].contains(ownerName)){
                balances[i] += found;
                break;
            }
            i++;
        }
        return balances[i];
    }
}
