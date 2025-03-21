
package Matrix;

import java.lang.classfile.instruction.ArrayLoadInstruction;
import java.util.ArrayList;
import java.util.Arrays;

public class SprialRotation {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.println(getSprial(matrix));
    }
    public static ArrayList<Integer> getSprial(int[][] matrix){
        ArrayList<Integer> ans = new ArrayList<>();
        int colBegin = 0;
        int colEnd = matrix[0].length - 1;
        int rowBegin = 0;
        int rowEnd = matrix.length -1 ;
        while (rowBegin <= rowEnd && colBegin <= colEnd){
            //towards right
            for(int i = colBegin; i <= colEnd; i++){
                ans.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            //towards down
            for(int i = rowBegin; i <= rowEnd; i++){
                ans.add(matrix[i][colEnd]);
            }
            colEnd--;

            //towards right to left
            if(rowBegin<=rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    ans.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            //towards up
            if(colBegin<=colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    ans.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return ans;
    }
}
