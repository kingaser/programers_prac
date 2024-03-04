import java.io.*;

class Main {
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            char[] word = br.readLine().toCharArray();
            cnt = 0;
            int res = isPalindrome(word);
            if (res == 1) {
                System.out.println(1 + " " + cnt);
            } else {
                System.out.println(0 + " " + cnt);
            }
        }
    }

    private static int recursion(char[] word, int l, int r) {
        if (l >= r) return 1;
        else if (word[l] != word[r]) return 0;
        else {
            cnt++;
            return recursion(word, l + 1, r - 1);
        }
    }

    private static int isPalindrome(char[] word) {
        cnt++;
        return recursion(word, 0, word.length - 1);
    }
}