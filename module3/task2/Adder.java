package module3.task2;

/**
 * Created by pan on 14.12.16.
 */
public class Adder extends Arithmetic {
    boolean check(Integer a, Integer b){
        if (a >= b)
            return true;
        else
            return false;
    }
}
