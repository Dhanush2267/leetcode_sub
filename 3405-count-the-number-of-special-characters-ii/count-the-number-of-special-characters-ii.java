class Solution {
    public int numberOfSpecialChars(String word) {
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        for(int i = 0;i<word.length();i++)
        {
            char c = word.charAt(i);
            map.put(c,i);
        }
        int count = 0;
        for(char c : map.keySet())
        {
              if (Character.isLowerCase(c)) {

            char st = Character.toUpperCase(c);
            if(map.containsKey(st))
            {
                if(word.indexOf(st)>map.get(c))
                {
                    count++;
                    // map.remove(c);
                    // map.remove(st);
                }
            }
              }
        }
        return count;
    }
}