public class FindTheDifference {
        public char findTheDifference(String s, String t) {
            char ans = 0;
            for(int i=0;i<t.length();i++){
                ans ^= t.charAt(i);
                if(i<s.length()){
                    ans ^= s.charAt(i);
                }
            }
            return ans;
        }
}
