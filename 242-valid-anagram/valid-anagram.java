class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        Map<Character, Integer> ts = new HashMap<>();

        for(int i = 0; i < t.length(); i++){
            char a = t.charAt(i);
            ts.put(a, ts.getOrDefault(a, 0) + 1);
        }

        for(int j = 0; j < s.length(); j++){
            char b = s.charAt(j);
            if(ts.containsKey(b)){
                if(ts.get(b) == 0) return false; 
                else ts.put(b, ts.get(b) - 1);
            }else return false;
        }
        return true;
    }
}