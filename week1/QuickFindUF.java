/**
 * @author zhaoyou
 */
public class QuickFindUF {

    private int[] result;

    public QuickFindUF(int n) {
        result = new int[n];
        for(int i = 0; i < n; i++) {
            result[i] = i;
        }
    }

    public static void Main(String [] args) {

    }
}