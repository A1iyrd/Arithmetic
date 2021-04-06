package Leetcode_Learning.Trie.Trie;

import Leetcode_Learning.Trie.TireNode_EasyImpl;

public class Trie_Easy {
    private TireNode_EasyImpl root;
    public Trie_Easy(){
        root=new TireNode_EasyImpl();
    }
    public void insert(String word) {
        TireNode_EasyImpl node = root;
        for (char c : word.toCharArray()) {
            if (node.next[c - 'a'] == null) {
                node.next[c - 'a'] = new TireNode_EasyImpl();
            }
            node = node.next[c - 'a'];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        TireNode_EasyImpl node = root;
        for (char c : word.toCharArray()) {
            node = node.next[c - 'a'];
            if (node == null) {
                return false;
            }
        }
        return node.isEnd;
    }

    public boolean startsWith(String prefix) {
        TireNode_EasyImpl node = root;
        for (char c : prefix.toCharArray()) {
            node = node.next[c - 'a'];
            if (node == null) {
                return false;
            }
        }
        return true;
    }
}
