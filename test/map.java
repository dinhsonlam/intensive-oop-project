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
        
//        System.out.println(strMap.get("3"));
        
        
        List <String> list1;
        list1 = new ArrayList<>();
        
        list1.add("em1");
        list1.add("em2");
        list1.add("em3");
        list1.add("em4");
        list1.remove(1);//this is remote value of possition of number 2
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(" "+list1.get(i));
        }
        
//        test la day
    }
}
