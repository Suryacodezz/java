package Module_8;


    import java.util.*;

public class Question3 {

    public static void main(String[] args) {
            String[] strs = {"eat","tea","tan","ate","nat","bat"};
            System.out.println(groupAnagrams(strs));
        }

        static List<List<String>> groupAnagrams(String[] strs) {
            Map<String, List<String>> map = new HashMap<>();

            for (String s : strs) {
                char[] ch = s.toCharArray();
                Arrays.sort(ch);
                String key = new String(ch);

                map.putIfAbsent(key, new ArrayList<>());
                map.get(key).add(s);
            }

            return new ArrayList<>(map.values());
        }

}
