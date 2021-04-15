class Solution {
    public boolean isMonotonic(int[] A) {
        return inc(A) || dec(A);
    }

    public boolean inc(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] > A[i + 1])
                return false;
        }
        return true;
    }

    public boolean dec(int[] A) {
        for (int i = 0; i < A.length - 1; i++) {
            if (A[i] < A[i + 1])
                return false;
        }
        return true;
    }
}