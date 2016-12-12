package module2;

public class Task2number1 {
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


    public static void main(String[] args) {
        double[] arr = {-1.2,24.3,45.3};
        int[] array = {-2,-3,5,-14,-0,-4,4,-3};
        System.out.println("sum: " + sum(array) + " , " + sum(arr));
        System.out.println("min: " + min(array) + " , " + min(arr));
        System.out.println("max: " + max(array) + " , " + max(arr));
        System.out.println("maxPositive: " + maxPositive(array) + " , " + maxPositive(arr));
        System.out.println("multiplication: " + multiplication(array) + " , " + multiplication(arr));
        System.out.println("modulus: " + modulus(array) + " , " + modulus(arr));
        System.out.println("secondLarges: " + secondLarges(array) + " , " + secondLarges(arr));
    }
}
