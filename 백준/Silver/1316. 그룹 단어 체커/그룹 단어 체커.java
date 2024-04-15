import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = n;
        for(int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean[] check = new boolean[26];
            for(int j = 0; j < str.length() - 1; j++) {
                if(str.charAt(j) != str.charAt(j + 1)) {
                    if(check[str.charAt(j + 1) - 97]) {
                        count--;
                        break;
                    }
                }
                check[str.charAt(j) - 97] = true;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}