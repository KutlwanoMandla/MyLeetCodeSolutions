import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class solution {
    public List<String> findRepeatedDnaSequences(String s) {
        List<String> list = new ArrayList<>();
        Hashtable<String, Integer> htable = new Hashtable<>();
        String temp = "";
        int len = 10;
        for (int i = 0; i < s.length() - len + 1; i++) {
            temp = s.substring(i, i + len);
            if (htable.keySet().contains(temp)) {
                htable.put(temp, htable.get(temp) + 1);
                if (!list.contains(temp)) {
                    list.add(temp);
                }
            } else {
                htable.put(temp, 1);
            }
        }
        return list;

    }

}