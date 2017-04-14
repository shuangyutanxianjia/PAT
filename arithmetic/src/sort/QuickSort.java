package sort;
/**
 * 快速排序
 * 实现思路：分而治之
 * 时间复杂度:o(nlogn)
 * @author xuguowei
 *
 */
public class QuickSort {
	
	public int[] QuickSort_1(int[] sortArray,int head,int tail){	 //快速排序确定第i个元素
		
		if(head<tail){	//用于递归确定
			int i = head;
			int j = tail;
			int x = sortArray[i];
			while(i < j){
				while (i < j && sortArray[j]>=x) j--;
				if(i<j){
					sortArray[i] = sortArray[j];
					i++;
				}
				
				while(i < j && sortArray[i]<=x) i++;
				if(i<j){
					sortArray[j] = sortArray[i]; 
					j--;
				}
			}
			sortArray[i] = x;
			this.QuickSort_1(sortArray, head, i-1);	//递归调用
			this.QuickSort_1(sortArray, i+1,tail);
		}
		return sortArray;
	}
	
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		int[] sortArray = {5,3,7,4,1,6,2};
		int[] result = sort.QuickSort_1(sortArray, 0, sortArray.length-1);
		for(int m = 0;m<sortArray.length;m++){
			System.out.println(result[m]);
			}
	}
}
	

