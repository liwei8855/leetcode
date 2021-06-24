package 排序;

public class QuickSort {

    static int list[] = {16,5,34,66,74,94,85};

    public static void main(String[] args) {
        quickSort(0,list.length);
        pList(list);
    }

    static void quickSort(int begin,int end){
        if (end-begin<2) return;
        int pivot = pivot(begin,end);
        quickSort(begin,pivot);
        quickSort(pivot+1,end);
    }

    static int pivot(int begin,int end){
        int value=list[begin];
        end--;
        while (begin<end){
            //从右向左扫描
            while (begin<end){
                if (value < list[end]){
                    end--;
                } else {
                    list[begin++] = list[end];
                    break;//换方向
                }
            }
            //从左向右扫描
            while (begin<end){
                if (list[begin]<value){
                    begin++;
                } else {
                    list[end--] = list[begin];
                    break;//换方向
                }
            }
        }
        list[begin] = value;
        return begin;
    }

    static void pList(int[] list){
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
    }

}
