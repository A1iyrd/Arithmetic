package Leetcode_Learning.Trie.Trie;

import Leetcode_Learning.Trie.TireNode_AdvanceImpl;

public class Trie_Advance {
    private TireNode_AdvanceImpl root;

    public Trie_Advance() {
        root = new TireNode_AdvanceImpl();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TireNode_AdvanceImpl node = root;
        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);
            if (!node.containsKey(currentChar)) {
                node.put(currentChar, new TireNode_AdvanceImpl());
            }
            node = node.get(currentChar);
        }
        node.setEnd();
    }
    private TireNode_AdvanceImpl searchPrefix(String word) {
        TireNode_AdvanceImpl node = root;
        for (int i = 0; i < word.length(); i++) {
            char curLetter = word.charAt(i);
            if (node.containsKey(curLetter)) {
                node = node.get(curLetter);
            } else {
                return null;
            }
        }
        return node;
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TireNode_AdvanceImpl node = searchPrefix(word);
        return node != null && node.isEnd();
    }
    public boolean startsWith(String prefix) {
        TireNode_AdvanceImpl node = searchPrefix(prefix);
        return node != null;
    }


}
