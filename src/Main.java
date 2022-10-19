public class Main {
    int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println(sum);
        }

        int max = arr[0];
        int min = arr[0];
        for (int element : arr){
            if (element<min){
                element=min;
            }
            if (element>max){
                element=max;
            }
        }
        System.out.println("минимальная цена " + min);
        System.out.println("максимальная цена " + max);

        double average = 0;
        average=sum/30;
        System.out.println(average);


        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i>=0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}














