import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = {"c=", "c-" , "dz=", "d-", "lj", "nj", "s=", "z="};
        br.close();
        for(int i = 0; i < arr.length; i++) {
            if(str.contains(arr[i])) {
                str = str.replace(arr[i], "!");
            }
        }
        bw.write(String.valueOf(str.length()));
        bw.flush();
        bw.close();
    }
}