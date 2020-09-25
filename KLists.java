public class KLists{
	
	public static double [] mergeKLists (double [][] outerArray){
		int lengthCount = 0;
		for(double[] element: outerArray){
			lengthCount += element.length;
		}
		
		double[] result = new double[lengthCount];
		if(lengthCount == 0 || outerArray.length == 0){
			System.out.print("[]");
			return result;
		}
		int resultIndex = 0;
		for(int i = 0; i < outerArray.length; i++){
			for(int j = 0; j < outerArray[i].length; j++){
				result[resultIndex] = outerArray[i][j];
				resultIndex ++;
			}
		}
		
		for (int i = 1; i < result.length; i++) { 
			double max = result[i]; 
			int j = i - 1; 
			while (j >= 0 && result[j] > max) { 
				result[j + 1] = result[j]; 
				j = j - 1; 
			} 
			result[j + 1] = max; 
		} 
		
		System.out.print("[");
		for (int i = 0; i < result.length; i++){
			System.out.print(+result[i]+", ");
		}
		System.out.print(result[lengthCount-1]+ "]");
		return result;
	}
	
	
	
	public static void main(String[] args){
		double[][] myList ={{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6}};
		double[][] myList1 = {};
		double[][] myList2 = {{}};
		double[][] myList3 ={{9.7, 17.1}, {15.8}, {12.7, 18.5, 21.27}};
		KLists.mergeKLists(myList);
		System.out.println();
		KLists.mergeKLists(myList1);
		System.out.println();
		KLists.mergeKLists(myList2);
		System.out.println();
		KLists.mergeKLists(myList3);
		
	}
}