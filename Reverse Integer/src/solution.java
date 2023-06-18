import java.util.ArrayList;

public class solution {
    public int reverse(int x) {

        ArrayList<Integer> list = new ArrayList<>();
        int result = 0;
        int temp = 0;
        if (x == 0)
            return 0;
        int xx = x;
        if (x < 0)
            x = -x;

        while (x != 0) {
            temp = x % 10;
            list.add(temp);
            x = x / 10;
        }
        int power = list.size() - 1;
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {

            result += list.get(i) * Math.pow(10, power);
            System.out.println("result = " + result);
            power = power - 1;

            if (result <= -Math.pow(2, 31) || result >= Math.pow(2, 31) - 1) {
                result = 0;
                break;
            }
        }
        if (result == 0) {
            return 0;
        } else if (xx < 0) {
            return -result;
        } else {
            return result;
        }
    }

}