public class lesson1 {

    public static int [] BubbleSortAcs(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int [] BubbleSortDesc(int [] arr){
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static int Search(int [] arr, int value){
        int result = -1;
        for (int i = 0; i < arr.length; i++ ){
            if(arr[i] == value){
                result = i;
            }
        }
        return result;
    }

    public static int BinarySearch(int [] arr, int value){
        int result = 1;

        int begin = 0;
        int middle;
        int end = arr.length;

        while(true) {
            middle = (begin + end) / 2;


            if (arr[middle] == value) {
                return middle;
            } else if (end - begin == 1) {
                return -1;
            } else if(arr[middle] < value){
                begin = middle;

            }
            else {
                end = middle;
            }
        }

    }
}
