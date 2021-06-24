package 排序;

public class InsertSort {
    public static void main(String[] args) {
        int list1[] = {16,5,34,66,74,94,85};
        insertSort2(list1);
        for (int i=0;i<list1.length;i++){
            System.out.print(list1[i]+"_");
        }
    }

    static void insertSort(int[] arr){
        for (int j=1;j<=arr.length-1;j++){
            int begin = j;
            int value = arr[begin];
            while (begin>0 && arr[begin-1]>arr[begin]){
                arr[begin] = arr[begin-1];
                begin--;
            }
            arr[begin]=value;
        }
    }

    static void insertSort2(int[] arr){
        for (int j=1;j<=arr.length-1;j++){
            int index = -1;
            for (int i=j;i>0;i--){
                if (arr[i] < arr[i-1]){
                    index = i-1;
                }
            }
            if (index != -1) {
                int tmp = arr[j];
                arr[j] = arr[index];
                arr[index] = tmp;
            }
        }
    }
}
