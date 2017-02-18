package module6;

/**
 * Created by pan on 30.01.17.
 */
public final class ArraysUtils {

    public static double sum(double tempArray[]){
        int i = 0;
        double sum = 0;
        while (i < tempArray.length){
            sum += tempArray[i];
            i++;
        }
        return sum;
    }

    public static int sum(int array[]){
        int i = 0;
        int sum = 0;
        while (i < array.length){
            sum += array[i];
            i++;
        }
        return sum;
    }

    public static int min(int array[]){
        int i = 0;
        int min = array[0];
        while (i < array.length){
            if (min > array[i])
                min = array[i];
            i++;
        }
        return min;
    }

    public static int max(int array[]){
        int i = 0;
        int max = array[0];
        while (i < array.length){
            if (max < array[i])
                max = array[i];
            i++;
        }
        return max;
    }

    public static double min(double array[]){
        int i = 0;
        double min = array[0];
        while (i < array.length){
            if (min > array[i])
                min = array[i];
            i++;
        }
        return min;
    }

    public static double max(double array[]){
        int i = 0;
        double max = array[0];
        while (i < array.length){
            if (max < array[i])
                max = array[i];
            i++;
        }
        return max;
    }

    public static int maxPositive(int array[]){
        int  maxPositive = max(array);
        if (maxPositive >= 0);
        return maxPositive;
    }

    public static double maxPositive(double array[]){
        double  maxPositive = max(array);
        if (maxPositive >= 0);
        return maxPositive;
    }

    public static double multiplication(double array[]){
        int i = 0;
        double multiplication = array[0];
        while (i < array.length){
            multiplication *= array[i];
            i++;
        }
        return multiplication;
    }

    public static long multiplication(int array[]){
        int i = 0;
        long multiplication = array[0];
        while (i < array.length){
            multiplication *= array[i];
            i++;
        }
        return multiplication;
    }

    public static double mod(double tempArray[]){
        int i = 0;
        double sum = 0;
        while (i < tempArray.length){
            sum %= tempArray[i];
            i++;
        }
        return sum;
    }

    public static long modulus(int array[]){
        long modulus = array[0] % array[array.length-1];
        return modulus;
    }

    public static double modulus(double array[]) {
        double modulus = array[0] % array[array.length - 1];
        return modulus;
    }

    public static int secondLarges(int array[]){
        int max = max(array);
        int secondLarges = array[0];
        int i = 0;
        while (i < array.length){
            while (array[i] != max && secondLarges < array[i])
                secondLarges = array[i];
            i++;
        }
        return secondLarges;
    }

    public static double secondLarges(double array[]){
        double max = max(array);
        double secondLarges = array[0];
        int i = 0;
        while (i < array.length){
            while (array[i] != max && secondLarges < array[i])
                secondLarges = array[i];
            i++;
        }
        return secondLarges;
    }

    public static int[] reverse(int[] array){
        int index = array.length - 1;
        int[] reversArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
                reversArray[i] = array[index];
                index--;
        }
        return reversArray;

    }
    public static int[] findEvenElements(int[] array){
        int countEvent = 0;
        for (int i : array) {
            if (i % 2 == 0)
                countEvent++;
        }
        int[] eventArray = new int[countEvent];
        int index = 0;
        for (int j = 0; j < array.length ; j++) {
            if (array[j] % 2 == 0){
                eventArray[index] = array[j];
                index++;
            }
        }
        return eventArray;
    }
}
