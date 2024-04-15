import java.util.List;

public class GreatestEnglishLetter {
    public String greatestLetter(String s) {
        List<Character> temp = List.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        int len = temp.size();
        String out = "";

        for(int i=len-1; i>=0; i--){
            char ch = temp.get(i);
            String a = (ch + "").toLowerCase();
            String b = (ch + "").toUpperCase();
            if(s.contains(a) && s.contains(b)){
                return b;
            }
        }
        return out;
    }
}
