package Leetcode_Learning.Trie;

public class TireNode_EasyImpl {
    public boolean isEnd;
    public TireNode_EasyImpl[] next;

    public TireNode_EasyImpl(){
        isEnd=false;
        next=new TireNode_EasyImpl[26];
    }
}
