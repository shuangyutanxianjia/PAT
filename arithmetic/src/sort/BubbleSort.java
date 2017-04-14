package sort;
/**
 * 冒泡算法
 * 实现思路：数向上慢慢爬
 * @author xuguowei
 *
 */
public class BubbleSort {
	
	/**
	 * 时间复杂度：o(n2)
	 * @param sortArray
	 * @return
	 */
	public int[] BubbleSort_1(int[] sortArray){
		for(int i = 0;i<sortArray.length;i++){
			for(int j=sortArray.length-1;j>i;j--){
				if(sortArray[j-1]>=sortArray[j]){
					int temp = sortArray[j];
					sortArray[j] = sortArray[j-1];
					sortArray[j-1] = temp;
				}
			}
		}
		
		return sortArray;
	}
	

	
	public static void main(String[] args) {
		BubbleSort sort = new BubbleSort();
		int[] sortArray = {5,3,7,4,1,6,2};
		int[] result = sort.BubbleSort_1(sortArray);
		for(int m = 0;m<sortArray.length;m++){
			System.out.println(result[m]);
			}
	}
}
