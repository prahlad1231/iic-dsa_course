package recursion;

public class TailRecursion {

    int addRecursion(int n) {
        if (n <= 0) return 0;
        return n + addRecursion(n-1);
    }

    int addNonRecursive(int n) {
        int ans = 0;
        for (int i = 1; i <= n; ++  i) {
           ans += i;
        }
        return ans;
    }

    public static void main(String[] args) {
        TailRecursion tr = new TailRecursion();
        System.out.println(tr.addRecursion(3)); // 1 + 2 + 3 = 6
        System.out.println(tr.addRecursion(5)); // 1 + 2 + 3 + 4 + 5 = 15
        System.out.println(tr.addNonRecursive(3));
        System.out.println(tr.addNonRecursive(5));
    }
}
