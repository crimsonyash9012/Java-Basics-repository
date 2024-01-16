import java.util.ArrayList;
import java.util.LinkedList;

public class j112_HashMap_Implementation {
    static class hashMap<K,V>{ // K,V -> generics
        private class Node{
            K key;
            V value;

            public Node(K key, V value){
                this.key = key;
                this.value = value;
            }
        }

        private int n;
        private int N;
        private LinkedList<Node> [] buckets; // N=buckets.length

//      @SuppressWarnings("unchecked");

        public hashMap(){
            this.N = 4;
            this.buckets = new LinkedList[4];
            for(int i=0; i<4; i++){
                this.buckets[i] = new LinkedList<>();
            }
        }

        private int hashFunction(K key){
            int bucketIndex = key.hashCode(); // can return any number (+ve or -ve)
            return Math.abs(bucketIndex)%N; // 0 -> N-1
        }

        private int searchInLL(K key, int bi){
            LinkedList<Node> ll = buckets[bi];
            for(int i=0; i<ll.size(); i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }

            return -1;
        }

        private void rehash(){
            LinkedList<Node> oldBucket[] = buckets;
            buckets = new LinkedList[N*2];

            for(int i=0; i<N*2; i++){
                buckets[i] = new LinkedList<>();
            }

            for(int i=0; i<oldBucket.length; i++){
                LinkedList<Node> ll = oldBucket[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    put(node.key, node.value);
                }
            }

        }

        public void put(K key, V value){
            int bucketIndex = hashFunction(key);
            int di = searchInLL(key, bucketIndex);

            if(di==-1){ // key doesn't exist
                buckets[bucketIndex].add(new Node(key, value));
                n++;
            }
            else{ // key exists
                Node data = buckets[bucketIndex].get(di);
                data.value = value;
            }

            double lambda = (double) n/N;
            if(lambda>2.0){
                rehash();
            }
        }

        public V get(K key){
            int bucketIndex = hashFunction(key);
            int di = searchInLL(key, bucketIndex);

            if(di==-1){ // key doesn't exist
                return null;
            }
            else{ // key exists
                Node node = buckets[bucketIndex].get(di);
                return node.value;
            }
        }

        public boolean containsKey(K key){
            int bucketIndex = hashFunction(key);
            int di = searchInLL(key, bucketIndex);

            if(di==-1){ // key doesn't exist
                return false;
            }
            else{ // key exists
                return true;
            }
        }

        public V remove(K key){
            int bucketIndex = hashFunction(key);
            int di = searchInLL(key, bucketIndex);

            if(di==-1){ // key doesn't exist
                return null;
            }
            else{ // key exists
                Node node = buckets[bucketIndex].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isEmpty(){
            return n==0;
        }

        public ArrayList<K> keySet(){
            ArrayList<K> keys = new ArrayList<>();

            for(int i=0; i< buckets.length; i++){
                LinkedList<Node> ll = buckets[i];
                for(int j=0; j<ll.size(); j++){
                    Node node = ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }
    }

    public static void main(String[] args) {
        hashMap<String, Integer> map = new hashMap<>();
        map.put("India", 190);
        map.put("Sri Lanka", 19);
        map.put("China", 200);
        map.put("USA", 20);

        ArrayList<String> keys = map.keySet();

        for(int i=0; i<keys.size(); i++){
            System.out.println(keys.get(i) + " " + map.get(keys.get(i)));
        }

        map.remove("China");
        System.out.println(map.get("China"));
        System.out.println(map.get("Sri Lanka"));
    }
}
