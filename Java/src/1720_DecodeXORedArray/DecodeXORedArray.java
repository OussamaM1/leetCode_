class Solution {
    public int[] decode(int[] encoded, int first) {
        int undecoded[]=new int[encoded.length+1];
            
            undecoded[0]=first;
            
            int j=0;
        
            for(int i=1;i<undecoded.length;i++)
            {
                undecoded[i]=undecoded[i-1]^encoded[j];
                j++;
            }
        return undecoded;
    }
}
