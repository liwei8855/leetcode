package 排序;

public class InsertSort {
    public static void main(String[] args) {
        int list1[] = {16,5,34,66,74,94,85};
        insertSort(list1);
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
}
