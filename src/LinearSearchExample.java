public class LinearSearchExample {

    public static void main(String[] args) {

        int[] array = {5, 2, 9, 1, 7, 6};
        int searchArray = linearSearch(array , 1);
        System.out.println(searchArray);



}

    private static int linearSearch(int[] array, int searchArray) {

        for (int i = 0 ; i < array.length ; i++){
           if (array[i] == searchArray){
               return i ;
           }
        }
        return -1 ;
    }
    }
