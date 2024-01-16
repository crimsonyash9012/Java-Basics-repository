import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class j111_HashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("China", 150);
        hm.put("Venice", 1);
        hm.put("USA", 30);

        System.out.println(hm);
        if(hm.containsKey("China")){
            System.out.println("The map contains China");
        }
        System.out.println(hm.get("Indonesia"));

        for(Map.Entry<String, Integer> e :hm.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = hm.keySet();
        for(String key: keys ){
            System.out.println(key + " " + hm.get(key));
        }

        hm.remove("Venice");
        System.out.println(hm);
    }
}
