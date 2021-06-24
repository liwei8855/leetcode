package 排序;

public class BubbleSort {

    public static void main(String[] args) {
//        int list1[] = {16,25,85,94,14,5,38};
        int list1[] = {16,5,34,66,74,85,94};

        bubbleSort(list1);
        for (int i=0;i<list1.length;i++){
            System.out.print(list1[i]+"_");
        }

//        int list2[] = {16,25,85,94,14,5,38};
//        int list2[] = {16,5,34,66,74,85,94};
//        bubbleSort2(list2);
//        for (int i=0;i<list2.length;i++){
//            System.out.print(list2[i]+"_");
//        }
    }

    static void bubbleSort (int[] arr) {
        int swapCount = 0;
        for (int j=arr.length-1;j>0;j--) {
            for (int i=1; i<=j; i++) {
                swapCount++;
                if (arr[i-1] > arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                }
            }
        }
        System.out.println("swap:"+swapCount);
    }

    static void bubbleSort2(int[] arr){
        int swapCount = 0;
        for (int j=arr.length-1;j>0;j--) {
            boolean isSwaped = false;
            for (int i=1;i<=j;i++){
                swapCount++;
                if (arr[i] < arr[i-1]){
                    isSwaped = true;
                    int temp = arr[i-1];
                    arr[i-1] = arr[i];
                    arr[i] = temp;
                }
            }
            if (!isSwaped){
                break;
            }
        }
        System.out.println("swap:"+swapCount);
    }
}
