package Leetcode_Learning.Trie;

public class TireNode_AdvanceImpl {
    private TireNode_AdvanceImpl[] links;

    private final int R = 26;

    private boolean isEnd;

    public TireNode_AdvanceImpl() {
        links = new TireNode_AdvanceImpl[R];
    }

    public boolean containsKey(char ch) {
        return links[ch -'a'] != null;
    }
    public TireNode_AdvanceImpl get(char ch) {
        return links[ch -'a'];
    }
    public void put(char ch, TireNode_AdvanceImpl node) {
        links[ch -'a'] = node;
    }
    public void setEnd() {
        isEnd = true;
    }
    public boolean isEnd() {
        return isEnd;
    }
}
