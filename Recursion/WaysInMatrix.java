public class WaysInMatrix {

    public static void main(String[] args) {
      // To find ways to reach diagonally opposite positions in a nxm matrix using recursion
        System.out.println(totalWays(2,3));
    }

    public static int totalWays(int n, int m) {
        if ((n == 1) || (m == 1)) {         // base case
            return 1;
        }

        return (totalWays(n, m-1) + totalWays(n-1, m));
    }
}
