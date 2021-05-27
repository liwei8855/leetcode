package 排序;


public class BubbleSort {

    public static void main(String[] args) {
        int list[] = {16,25,85,94,14,5,38};
        bubbleSort(list);
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
    }

    static void bubbleSort (int[] arr) {
        for (int j=arr.length-1;j>0;j--) {
            for (int i=1; i<=j; i++) {
                if (arr[i-1] > arr[i]){
                    int tmp = arr[i];
                    arr[i] = arr[i-1];
                    arr[i-1] = tmp;
                }
            }
        }
    }

}
