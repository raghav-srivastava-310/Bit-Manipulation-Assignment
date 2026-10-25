public class ComplementOfBase10Integer {
        public int bitwiseComplement(int n) {
            if(n==0) return 1;
            int mask = 0;
            int temp = n;
            while(temp >= 0){
                temp = temp >> 1;
                mask = (mask << 1) | 1;
            }
            return n ^ mask;
        }
}
