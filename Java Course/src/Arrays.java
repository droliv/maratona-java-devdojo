public class Arrays {
    public static void main(String[] args){
        //declaring arrays ways
        int[] ages = new int[3];
        ages[0] = 15;
        int numbers[] = {1, 2, 3, 4, 5};
        int[] numbers1 = new int[]{1, 2, 3};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number: numbers1){
            System.out.println(number);
        }
    }
}
