class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length() ;i++)
        {
            char c = s.charAt(i);
            if(c>='A' && c<='Z')
            {
                c = Character.toLowerCase(c);
            }
            if((c>='0'&& c<='9') || (c>='a' && c<='z'))
            {
                sb.append(c);
            }
        }
        String ans = sb.toString();
        System.out.println(ans);
        int i = 0;
        int j = ans.length()-1;
        while(i<=j)
        {
            if(ans.charAt(i)!=ans.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}