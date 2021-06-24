package 排序;

public class MergeSort {

    static int list1[] = {16,5,34,66,74,94,85};
    static int[] tempArr = new int[list1.length>>1];
    public static void main(String[] args) {
        pList(list1);
        mergeSort(0,list1.length);
        pList(list1);
    }

    static void pList(int[] list){
        System.out.println();
        for (int i=0;i<list.length;i++){
            System.out.print(list[i]+"_");
        }
        System.out.println();
    }

    static void mergeSort(int begin, int end){
        //至少2个元素
        if (end-begin<2) return;
        int middle = (begin+end)>>1;
        mergeSort(begin,middle);
        mergeSort(middle,end);
        merge(begin,middle,end);
    }

    static void merge(int begin,int middle,int end){
        System.out.println(begin+"_"+middle+"_"+end);

        int li = 0,le = middle-begin;
        for (int i=li;i<le;i++){
            tempArr[i] = list1[begin+i];
        }

        int index = begin;
        int ri = middle,re = end;
        //注意begin不一定为0，li<le是控制循环次数
        //**tempArr中始终是0开始，注意li不能用begin
        //**list1必须用begin否则位置可能不对，可能是中间部分不是最前边0开始
        while (li<le){
            if (ri<re && tempArr[li]>list1[ri]){
                list1[index++] = list1[ri++];
            } else {
                list1[index++] = tempArr[li++];
            }
        }
    }

}
