package 搜索;

public class BinarySearch {
    public static void main(String[] args) {
        int list1[] = {16,25,35,68,74,85,94};
        int index = binarySearch(list1,94);
        System.out.print(index+1);
    }

    static int binarySearch(int[] arr,int v){
        if (arr==null || arr.length==0) return -1;
        int begin = 0;
        int end = arr.length;
        while (begin<end){
            int index = (begin+end)>>1;
            System.out.print(index);
            if (arr[index] == v){
                return index;
            } else if(arr[index]>v){
                end = index;
            } else if(arr[index]<v){
                begin = index+1;
            }
        }
        return -1;
    }


}
