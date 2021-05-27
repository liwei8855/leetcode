package 排序;

public class SelectSort {
    public static void main(String[] args) {

        int list[] = {16,25,85,94,14,5,38};
        selectSort(list);
        pList(list);
    }

    static void selectSort(int[] arr){
        for (int j=arr.length-1;j>0;j--){
            int index=0;
            for (int i=1;i<=j;i++){
                if (arr[index]<arr[i]){
                    index=i;
                }
            }

            int tmp = arr[j];
            arr[j]=arr[index];
            arr[index]=tmp;

            pList(arr);
            System.out.println();
        }
    }
    static void pList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
    }
}
