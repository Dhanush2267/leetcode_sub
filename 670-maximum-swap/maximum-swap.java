class Solution {
    public int maximumSwap(int num) {
        int digit = (int)Math.log10(num)+1;
        int[] arr = new int[digit];
        for(int i = digit-1 ;i >= 0 ;i--)
        {
            arr[i] = num%10;
            num/=10;
        }
       // System.out.println(Arrays.toString(arr));
        int count = 0;
        int maxIndex = 0;
        for(int i = 0; i < arr.length-1 && count<1; i++)
        {
            int max = 0;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j] >= max) {
                max = arr[j];
                maxIndex = j;
    }            }
         //   System.out.println(max);
            if(max > arr[i])
            {
                int temp = arr[maxIndex];
                arr[maxIndex]=arr[i];
                arr[i]=temp;
                count++;
            }
        }
        System.out.println(Arrays.toString(arr));
        int k = 0;
        for(int i = 0;i<arr.length;i++)
        {
            k = k*10+arr[i];
        }
        return k;
    }
}