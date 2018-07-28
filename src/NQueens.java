import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NQueens {
	List<List<String>> result = new ArrayList<>();
	
	public List<List<String>> solveNQueens(int n){
		boolean[] visited = new boolean[n];
		boolean[] diag1 = new boolean[2*n-1];	// 2*n-1对角线
		boolean[] diag2 = new boolean[2*n-1];
		
		findNQueens(n, new ArrayList<String>(), visited, diag1, diag2, 0);
		return result;
	}
	
	private void findNQueens(int n, List<String> list, boolean[] visited, boolean[] diag1, boolean[] diag2, int rowIndex) {
		if(rowIndex == n) {
			result.add(new ArrayList<String>(list));
			return;
		}
		
		for(int i=0; i<n; i++) {
			//这一行、正对角线、反对角线都不能再放了，如果发现是true，停止本次循环
			if(visited[i] || diag1[rowIndex+i] || diag2[rowIndex-i+n-1]) continue;
			//init一个长度为n的一维数组，里面初始化为'.'
			char[] c = new char[n];
			Arrays.fill(c, '.');
			
			c[i] = 'Q';
			String s = new String(c);
			list.add(s);
			visited[i] = true;
			diag1[rowIndex+i] = true;
			diag2[rowIndex-i+n-1] = true;
			
			findNQueens(n,list,visited,diag1,diag2,rowIndex+1);
			// reset不影响回溯的下个目标
			list.remove(list.size()-1);
			c[i] = '.';
			visited[i] = false;
			diag1[rowIndex+i] = false;
			diag2[rowIndex-i+n-1] = false;
		}
	}
}
/*
// C++ solution 
bool is_ok(int row){
    for(int j=0;j!=row;j++){
        if(c[row]==c[j] || row-c[row]==j-c[j] || row+c[row]==j+c[j])
            return false;
    }
    return true;
}

void queen(int row){
    if(row==n)
        total++;
    else
        for(int col=0;col!=n;col++){
            c[row]=col;
            if(is_ok(row))
                queen(row+1);
        }       
}
 */
