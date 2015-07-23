import java.util.Arrays;

/**
 * Created by manny on 22/07/15.
 */
public class FilipTheFrog {

    public int countReachableIslands(int[] positions, int L){
        int pivot = positions[0];
        Arrays.sort(positions);
        boolean pivotF = false;
        int n =1;
        for(int i=0; i<positions.length-1; i++){
            if(pivot == positions[i]){
                pivotF = true;
            }
            if(positions[i+1] - positions[i] <= L){
                n++;
            } else{
                if(!pivotF)
                    n=1;
                else
                    break;
            }
        }
        return n;
    }

    /*public static void main(String[] args) {
        FilipTheFrog filipTheFrog = new FilipTheFrog();
        int[] f = {17, 10, 22, 14, 6, 1, 2, 3};
        System.out.println(filipTheFrog.countReachableIslands(f, 4));

    }*/
}
