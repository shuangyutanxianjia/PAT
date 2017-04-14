package sort;
/**
 * 归并算法
 * @author xuguowei
 *
 */
public class MyMergeSort {
	/**
	 * 将两个数组a[first:mid],a[mid:last]合并
	 * @param a
	 * @param first
	 * @param mid
	 * @param last
	 * @param temp
	 */
	public void mergeArray(int[] a,int first,int mid,int last,int temp[]){
		int i = first;
		int j = mid+1;
		int m = mid;
		int n = last;
		int k = 0;
		while (i<=m&&j<=n){
			if(a[i]<=a[j]){
				temp[k++]=a[i++];
			}else{
				temp[k++]=a[j++];
			}
		}
		while (i<=m){
			temp[k++]=a[i++];
		}
		while(j<=n){
			temp[k++]=a[j++];
		}
		
		for(i= 0;i<k;i++){
			a[first+i]=temp[i];
		}
	}
	
	//归并排序
	public int[] mergeSort(int[] sortArray,int first,int last,int[] temp){
		
		if(first<last){
			int mid = (first+last)/2;
			mergeSort(sortArray, first, mid, temp);			
			mergeSort(sortArray, mid+1, last, temp);
			mergeArray(sortArray, first, mid, last, temp);
		} 
		return sortArray;
	}
	
	public static void main(String[] args) {
		MyMergeSort sort = new MyMergeSort();
		int[] sortArray = {5,3,7,4,1,6,2};
		int[] temp = new int[sortArray.length];
		int[] result = sort.mergeSort(sortArray, 0, sortArray.length-1, temp);
		for(int m = 0;m<sortArray.length;m++){
			System.out.println(result[m]);
			}
	}
}
