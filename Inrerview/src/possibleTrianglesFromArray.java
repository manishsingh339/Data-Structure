import java.util.Arrays;

// This solution is in complete
public class possibleTrianglesFromArray {
    public static void main(String[] args) {
        int[] potentialEdges = {3,3,3};
        int n = potentialEdges.length;
        nobOfTriangle(potentialEdges, n);
    }
    
    public static void nobOfTriangle(int[] a, int n){
    	int answer = 0;
        Arrays.sort(a);

        for (int i = 0; i < n; ++i){
            int k = i;
            for (int j = i; j < n; ++j){
                while (n > k && a[i] + a[j] > a[k])
                    ++k;
                answer += k - j;
            }
        }
        System.out.println(answer);
    }
}