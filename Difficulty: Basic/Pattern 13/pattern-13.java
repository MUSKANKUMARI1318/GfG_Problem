class Solution {
    void printTriangle(int n) {
        int count = 1;
        for (int row = 1; row <= n; row++) {
            for (int col = 0; col < row; col++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
    }
}
