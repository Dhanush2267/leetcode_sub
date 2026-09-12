class Solution {
    public int function(int n,int c)
    {
        if(n==0)
        {
            return c;
        }
        if(n%2==0)
        {
            return function((n/2),c+1);
        }
    
            return function((n-1),c+1);
        
    }
    public int numberOfSteps(int num) {
        return function(num,0);
    }
}