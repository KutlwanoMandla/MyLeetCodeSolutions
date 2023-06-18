public class solution {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        if (x < 0)
            return false;

        String temp = Integer.toString(x);

        for (int i = 0; i <= temp.length() / 2; i++) {
            if (temp.charAt(i) != temp.charAt(temp.length() - 1 - i)) {
                ans = false;
                break;
            }
        }

        return ans;
    }

}