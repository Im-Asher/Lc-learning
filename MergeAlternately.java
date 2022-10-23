/*
 * 题目描述
 * 给你两个字符串 word1 和 word2 。请你从 word1 开始，通过交替添加字母来合并字符串。如果一个字符串比另一个字符串长，就将多出来的字母追加到合并后字符串的末尾。
 * 返回合并后的字符串 。
 * 
 * 
 * 示例 1：

    输入：word1 = "abc", word2 = "pqr"
    输出："apbqcr"
    解释：字符串合并情况如下所示：
    word1：  a   b   c
    word2：    p   q   r
    合并后：  a p b q c r

 * 
 * 
 */

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        char[] char1 = word1.toCharArray();
        char[] char2 = word2.toCharArray();
        int N = char1.length >= char2.length ? char1.length : char2.length;
        for (int i = 0; i < N; i++) {
            if (i < char1.length) {
                res.append(char1[i]);
            }
            if (i < char2.length) {
                res.append(char2[i]);
            }
        }
        return res.toString();
    }
}