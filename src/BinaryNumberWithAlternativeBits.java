public class BinaryNumberWithAlternativeBits {
        public boolean hasAlternatingBits(int n) {
            int result1 = -1;
            int result2 = -1;
            while(n>0){
                result1 = n & 1;
                n=n>>1;
                if((result2 == result1)){
                    return false;
                }
                result2 = n & 1;
                n=n>>1;
                if((result2 == result1)){
                    return false;
                }
            }
            return true;
        }
}
