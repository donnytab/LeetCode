import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] matrix) {
    	List<Integer> resultList = new ArrayList<Integer>();
        for(int m=0; m<matrix.length; m++) {
        	for(int n=0; n<matrix[m].length; n++) {
        		resultList.add(matrix[m][n]);
        	}
        }
        return resultList;
    }
    
    public static void main(String[] args) {
    	int[][] matrix = {{1, 2, 3},{ 4, 5, 6},{ 7, 8, 9 }};
    	System.out.println(spiralOrder(matrix));
    }
}
