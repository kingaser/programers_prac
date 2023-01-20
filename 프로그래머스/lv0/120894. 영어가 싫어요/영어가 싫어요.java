class Solution {
    public long solution(String n) {
        n = n.replaceAll("zero", "0");
        n = n.replaceAll("one", "1");
        n = n.replaceAll("two", "2");
        n = n.replaceAll("three", "3");
        n = n.replaceAll("four", "4");
        n = n.replaceAll("five", "5");
        n = n.replaceAll("six", "6");
        n = n.replaceAll("seven", "7");
        n = n.replaceAll("eight", "8");
        n = n.replaceAll("nine", "9");
        return Long.valueOf(n);
    }
}