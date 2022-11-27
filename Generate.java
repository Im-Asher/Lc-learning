import java.util.ArrayList;
import java.util.List;

public class Generate {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();

        ans.add(new ArrayList<Integer>() {
            {
                add(1);
            }
        });

        for (int i = 1; i < numRows; i++) {
            List<Integer> currentLine = new ArrayList<>();

            List<Integer> lastLine = ans.get(i - 1);
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    currentLine.add(lastLine.get(0));
                    continue;
                }
                if (j == i) {
                    currentLine.add(lastLine.get(i - 1));
                    continue;
                }
                currentLine.add(lastLine.get(j - 1) + lastLine.get(j));
            }
            ans.add(currentLine);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Generate().generate(4));

    }
}
