import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {
    public List<String> letterCasePermutation(String s) {

        List<String> ans = new ArrayList<String>();
        Queue<StringBuilder> queue = new ArrayDeque<StringBuilder>();
        queue.offer(new StringBuilder());
        while (!queue.isEmpty()) {
            StringBuilder curr = queue.peek();
            if (curr.length() == s.length()) {
                ans.add(curr.toString());
                queue.poll();
            } else {
                int pos = curr.length();
                if (Character.isLetter(s.charAt(pos))) {
                    StringBuilder next = new StringBuilder(curr);
                    next.append((char) (s.charAt(pos) ^ 32));
                    queue.offer(next);
                }
                curr.append(s.charAt(pos));
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        LetterCasePermutation lcp = new LetterCasePermutation();
        List<String> ans = lcp.letterCasePermutation("abC");
        System.out.println(ans.toString());
    }
}
