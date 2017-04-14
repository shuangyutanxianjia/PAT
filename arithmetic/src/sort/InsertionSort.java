package sort;
/**
 *插入排序
 *实现思路：将数据插入到有序的数组中
 *时间复杂度：O(n*n)
 * @author xuguowei
 *
 */

public class InsertionSort {
	/**
	 *
	 * @param sortArray
	 */
	public int[] InsertionSort_1(int[] sortArray){
		for(int i=1;i<sortArray.length;i++){	
			int j = 0;
			while(j<i&&sortArray[j]<=sortArray[i])	
				j++; 
			
			if(j<i){	
				int k = i;	
				int temp = sortArray[i];
				while(k>j){
					sortArray[k] = sortArray[k-1]; 
					k--;
				}
				sortArray[k]=temp;
			}	
		}
		return sortArray;		
	}

	public int[] InsertionSort_2(int[] sortArray){
		
		return sortArray;
	}
	public static void main(String[] args) {
		InsertionSort insertionSort = new InsertionSort();
		int[] sortArray = {5,3,7,4,1,6,2};
		int[] result = insertionSort.InsertionSort_1(sortArray);
		for(int m = 0;m<sortArray.length;m++){
			System.out.println(result[m]);
			}
	}

}
