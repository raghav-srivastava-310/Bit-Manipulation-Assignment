class PrimeNumberOfSetBits {
        public int countPrimeSetBits(int left, int right) {
            int primeSetBitCounts = 0;
            for(int i = left;i<=right;i++){
                int setBits = countSetBits(i);
                if(setBits == 2 || setBits == 3 || setBits == 5 || setBits == 7 || setBits == 11 ||
                        setBits == 13 || setBits == 17 || setBits == 19 || setBits == 23 || setBits == 29 || setBits == 31){
                    primeSetBitCounts++;
                }
            }
            return primeSetBitCounts;
        }

        int countSetBits(int n){
            int count = 0;
            while(n != 0){
                n = n & (n-1);
                count++;
            }
            return count;
        }

}