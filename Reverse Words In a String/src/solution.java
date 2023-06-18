public class solution {

    public String reverseWords(String s) {

        String ans = "";

        int i = s.length() - 1;
        int j = s.length();

        int count = 0;

        while (i >= 0) {

            if (s.charAt(i) != ' ') {

                while (i >= 0 && s.charAt(i) != ' ') {
                    i--;
                }
                i++;
                String temp = s.substring(i, j);
                System.out.println("temp : " + temp);
                if (count == 0) {
                    ans = temp;
                } else {
                    ans = ans + " " + temp;
                }
                j = i;
                i--;
                count++;

            } else {
                i--;
                j--;
            }

        }

        return ans;

    }
}