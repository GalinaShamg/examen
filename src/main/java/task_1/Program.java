package task_1;

public class Program {
    public static void main(String[] args) {
        int numbers[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.round((Math.random() * 10));
            System.out.print(numbers[i]+" ");
        }
        int max = getMax(numbers);
        int min = getMin(numbers);
        double average = getAverage(numbers);

        System.out.println("\nМаксимальное число " + max);
        System.out.println("Минимальное число " + min);
        System.out.println("Среднее значение всех чисел в массиве "+ average);
    }

    private static double getAverage(int[] inputArray) {
        int sum=0;
        for(int a=0; a<inputArray.length; a++){
                        sum=sum+inputArray[a];
        }
return sum/10;
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }

    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }
}