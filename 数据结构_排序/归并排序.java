package 数据结构_排序;

public class 归并排序{
    public static void main(String[] args) {
        int[] arr = {1,8,36,5,2,4,6};
        MergeSort sort = new MergeSort();
        sort.mergeSort(arr,0,arr.length-1);
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
}

class MergeSort{
    /**
     *
     * @param a  add a list of need sort
     * @param start  where you start sorting
     * @param end  where you end sorting
     */
    public void mergeSort(int[] a,int start,int end){
        if(start < end){
            int mid = (start+end)/2;
            mergeSort(a,start,mid);
            mergeSort(a,mid+1,end);
            merge(a,start,mid,end);
        }
    }

    /**
     *
     * @param a    to add two list
     * @param left  the first list of start
     * @param mid   the middy of between a and b list
     * @param right  the second list of end
     */
    public void merge(int[] a,int left,int mid,int right){
        int[] temp = new int[a.length];
        int p1 = left,p2 = mid+1,k = left;

        while(p1 <= mid && p2 <= right){
            if(a[p1] <= a[p2])
                temp[k++] = a[p1++];
            else
                temp[k++] = a[p2++];
        }

        while (p1 <= mid)  temp[k++] = a[p1++];
        while (p2 <= right)  temp[k++] = a[p2++];

        for (int i = left;i <= right;i++){
            a[i] = temp[i];
        }
    }
}
