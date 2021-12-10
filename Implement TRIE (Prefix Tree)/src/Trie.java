class Trie {

    class Node{
        boolean end = false;
        Node[] nodes;
    }

    Node[] node;
    public Trie() {
        node = new Node[26];
    }

    public void insert(String word) {
        insert(node,word,0);
    }

    public void insert(Node[] node,String word,int index){
        int charValue = word.charAt(index) - 'a';

        if(node[charValue] == null){
            node[charValue] = new Node();
        }

        if(index == word.length() - 1){
            node[charValue].end = true;
            return;
        }

        if(node[charValue].nodes == null){
            node[charValue].nodes = new Node[26];
        }
        insert(node[charValue].nodes,word,index+1);
    }

    public boolean search(String word) {
        return completeSearch(node,word,0,false);
    }

    public boolean startsWith(String prefix) {
        return completeSearch(node,prefix,0,true);
    }

    public boolean completeSearch(Node[] node, String word, int index, boolean startsWith){
        int charValue = word.charAt(index) - 'a';

        if(node[charValue] == null)return false;
        if(index == word.length()-1){
            return startsWith || node[charValue].end;
        }
        if(node[charValue].nodes == null)return false;
        return completeSearch(node[charValue].nodes, word, index+1, startsWith);
    }
}