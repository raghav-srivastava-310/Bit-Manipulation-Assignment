public class NumberComplement {
    public int findComplement(int num) {
        int temp = num;
        int mask = 0;
        int i = 0;
        while(temp>0){
            mask = (mask << 1) | 1;
            temp = temp>>1;
        }
        int result = mask ^ num;
        return result;
    }
}
