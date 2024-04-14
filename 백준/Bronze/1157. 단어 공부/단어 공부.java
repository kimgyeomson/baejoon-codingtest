import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        char a = (char) getMaxDup(str);
        System.out.println(a);

    }
    public static int getMaxDup(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for(char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        char c = '\n';
        int max = 0;
        for(char cr : map.keySet()) {
            if (map.get(cr) > max) {
                max = map.get(cr);
                c = cr;
            }
            else if (map.get(cr) == max) {
                c = '?';
            }
        }
        return c;
    }
}