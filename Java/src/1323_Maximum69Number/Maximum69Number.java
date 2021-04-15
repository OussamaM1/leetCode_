class Solution {
    public int maximum69Number(int num) {
        int number = num;
        int count = 0;
        int index = -1;
        while (number > 0) {
            if (number % 10 == 6)
                index = count;
            number /= 10;
            count++;
        }

        if (index == -1)
            return num;
        else
            return num + 3 * (int) Math.pow(10, index);
    }
}