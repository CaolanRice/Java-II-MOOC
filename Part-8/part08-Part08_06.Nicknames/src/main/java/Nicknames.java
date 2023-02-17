
import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<String, String>();
        hashmap.put("matthew", "matt");
        hashmap.put("michael", "mix");
        hashmap.put("arthur", "artie");
        
        System.out.println(hashmap.get("matthew"));
    }

}
