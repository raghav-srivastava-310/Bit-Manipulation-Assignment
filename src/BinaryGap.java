class BinaryGap {
    public int binaryGap(int n) {
        int bitposition = 0;
        int i = -1;
        int maxGap = 0;
        int j = -1;
        int count = 0;
        while(n>0){
            int bit = n & 1;
            if(bit == 1){
                if(i<0){
                    i=bitposition;
                }
                j=bitposition;
                count++;
            }
            n = n>>1;
            if(count == 2){
                maxGap = Math.max(maxGap,j-i);
                i=j;
                count--;
            }
            bitposition++;
        }
        return maxGap;
    }
}