import java.util.ArrayList;
import java.util.List;

public class GrayCode {

        public List<Integer> grayCode(int n) {
            int totalNumber = 1<<n;
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<totalNumber;i++){
                list.add(i^(i>>1));
            }
            return list;
        }

}
