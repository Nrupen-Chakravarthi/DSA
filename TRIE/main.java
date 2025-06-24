package TRIE;

public class main {
    public static void main(String[] args) {
        Trie obj = new Trie();
        obj.insert("apple");
        obj.insert("app");
        System.out.println(obj.search("appp"));
    }
}
