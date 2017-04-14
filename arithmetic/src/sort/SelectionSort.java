package sort;
/**
 * 选择排序
 * 实现思路：选择最小的放到第一位
 * 时间复杂度：O(n*n)
 * @author xuguowei
 *
 */
public class SelectionSort {
	
	public int[] SelectionSort_1(int[] sortArray){
		for(int i=0;i<sortArray.length;i++){
			int min = sortArray[i]; 
			int minIndex = i;
			for(int j=i+1;j<sortArray.length;j++){ 
				if(min>sortArray[j]){
					min = sortArray[j];
					minIndex = j;
				}
			}
			
			int temp = sortArray[i];
			sortArray[i] = sortArray[minIndex];
			sortArray[minIndex] = temp;
			
		}		
		return sortArray;
	}
	
	public static void main(String[] args) {
		SelectionSort sort = new SelectionSort();
		int[] sortArray = {5,3,7,4,1,6,2};
		int[] result = sort.SelectionSort_1(sortArray);
		for(int m = 0;m<sortArray.length;m++){
			System.out.println(result[m]);
			}
	}
}


