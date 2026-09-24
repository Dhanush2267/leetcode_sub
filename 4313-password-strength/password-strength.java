class Solution {
    public int passwordStrength(String password) {
        HashSet<Character> map = new HashSet<>();
        for(char x : password.toCharArray())
        {
            map.add(x);
        }
        //char[] arr = {'!','@','#','$'};
        String arr = "!@#$";
        int ans = 0;
        for(char x : map)
        {
            if(Character.isUpperCase(x))
                ans += 2;
            else if (Character.isLowerCase(x))
                ans += 1;
            else if (Character.isDigit(x))
                ans += 3;
            // else if (x == '!' || x == '@' || x == '#' || x == '$')
            //     ans += 5;
            else if (arr.indexOf(x)!=-1)
                ans += 5;
        }
        return ans;
    }
}