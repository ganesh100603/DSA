class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        Map<Character,String>  ps= new HashMap<>();
        Map<String,Character> sp = new HashMap<>();
        if(arr.length != pattern.length()) return false;
        for(int i = 0; i < pattern.length(); i++){
            char a = pattern.charAt(i);
            String b = arr[i];
            if(ps.containsKey(a)){
                if(!ps.get(a).equals(b)){
                    return false;
                }
            }else{
                ps.put(a,b);
            }

            if(sp.containsKey(b)){
                if(!sp.get(b).equals(a)){
                    return false;
                }
            }else{
                sp.put(b,a);
            }
        }
        return true;
    }
}