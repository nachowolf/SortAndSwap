package co.projectcodex.sortandswap;

public class SwapMe {


    public static String[] swapFirstWithLast(String[] values) {
        String hold = values[values.length - 1];
        values[values.length - 1] = values[0];
        values[0] = hold;
        return values;
    }

    public static String[] swapFirstWithSecond(String[] values) {
        String hold = values[0];
        values[0] = values[1];
        values[1] = hold;
        return values;
    }

    public static int[] swapNeighbours(int[] numbers) {

        for (int i = 0; i <= numbers.length; i++) {

            if (i == numbers.length - 1) {
                break;
            } else if (numbers[i] > numbers[i + 1]) {
                int hold = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = hold;
            }

        }

        return numbers;

    }


//    BUBBLE SORT
    public static int[] sortList(int[] numbers) {
        int[] storedNumbers = numbers;
        boolean check = true;
        while (check) {
            check = false;
            if (storedNumbers != numbers) {
                break;
            } else {
                for (int i = 0; i < numbers.length; i++) {

                    if (i+1 < numbers.length) {
                        int hold = numbers[i];
                        int next = numbers[i+1];

                        if (numbers[i] > numbers[i + 1]) {

                            numbers[i] = next;
                            numbers[i+1] = hold;
                            check = true;
                        }
                    }

                }

            }
        }
        return numbers;
    }

    public static int[] selectionSort(int[] numbers){
        for(int i = 0; i<numbers.length;i++){


            int smallest = numbers[i];
            int index = i;


            for(int j = i; j<numbers.length;j++){

                if(smallest > numbers[j]){
                    smallest = numbers[j];
                    index = j;
                }
            }

            int hold = numbers[i];
            numbers[i] = smallest;
            numbers[index] = hold;


        }
        return numbers;
    }


}
