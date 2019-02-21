import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        Map<String, String> strMap = new HashMap<>();
        
        strMap.put("1", "Day la value of key A1");
        strMap.put("2", "Day la value of key A2");
        strMap.put("3", "Day la value of key A3");
        strMap.put("4","Day la value of key A4");
        
        System.out.println(strMap.get("3"));
        
    }
}
