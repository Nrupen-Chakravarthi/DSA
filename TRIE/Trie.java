package TRIE;

public class Trie {
    private Node root;
    Trie(){
        root = new Node();
    }
    public void insert(String word){
        Node current = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isEOW = true;
    }
    public boolean search(String word){
        Node current = root;
        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            if(current.children[index] == null){
                return false;
            }
            current = current.children[index];
        }
        return current.isEOW;
    }
}
class Node{
    Node[] children;
    boolean isEOW;

    Node(){
        children = new Node[26];
        isEOW = false;
    }
}
