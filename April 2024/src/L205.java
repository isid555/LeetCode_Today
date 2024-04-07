import java.util.HashMap;

public class L205 {
    public boolean isIsomorphic(String s, String t) {
//        HashMap<Character ,Integer> smap = new HashMap<>();
//        HashMap<Character,Integer> tmap = new HashMap<>();
//if(s.length() != t.length()){
//    return false;
//}
//        int n = s.length();
//        int m = t.length();
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            char d = t.charAt(i);
//            if(smap.containsKey(c)){
//                int freq  = smap.get(c);
//                smap.put(c,freq+1);
//            }
//            else{
//                smap.put(c,1);
//            }
//            if(tmap.containsKey(d)){
//                int freq  = tmap.get(d);
//                tmap.put(d,freq+1);
//            }
//            else{
//                tmap.put(d,1);
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            char c = s.charAt(i);
//            char d = t.charAt(i);
//            if(smap.get(c) != tmap.get(d)){
//                return false;
//            }
//        }
//        return true;

        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        if(s.length() != t.length()){
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map1.containsKey(a) && map1.get(a)!= b || map2.containsKey(b) && map2.get(b)!= a ){
                return false;
            }
            map1.put(a,b);
            map2.put(b,a);

        }
        return true;
    }
}
