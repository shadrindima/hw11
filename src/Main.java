import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //это пример вызова массива в котором мы рандомно создаем 30 элементов с разной суммой
        int[] expenses = generateRandomArray();
        ///вот тут дальше можно писать код заданий на обработку этого массива в уиклах
        System.out.println(Arrays.toString(expenses));
        System.out.println("Задание 1");
        int sum = 0;
        for(int expense : expenses){
            sum+=expense;
        }
        System.out.println("Сумма трат за месяц составила " + sum+ " рублей");
        System.out.println("Задание 2");
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int expense : expenses){
            if (expense > max);{
                max = expense;
            }

            if (expense < min);{
                min = expense;
            }
            System.out.println("Максимальная сумма трат за день " + max + " рублей");
            System.out.println("Минимальная сумма трат за день " + min + " рублей");
        }
        System.out.println("Задание 3");
        float averageExpense = (float) sum / expenses.length;
        System.out.println("Средняя сумма трат за месяц " +averageExpense+" рублей");
        System.out.println("Задание 4");
        char[] reverseFullName ={ 'a','m','i','D',' ','n','i', 'r', 'd', 'a','h','S',};
        for (int i= reverseFullName.length-1; i>=0;i--){
            System.out.print(reverseFullName[i] );
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] expenses = new int[30];
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = random.nextInt(100_000) + 100_000;
        }
        return expenses;
    }
}