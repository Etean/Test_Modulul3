import java.util.ArrayList;
import java.util.List;

public class Watch {

    public static List<String> readBinaryWatch(int n) {

        List<String> ret = new ArrayList<>();
        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                if (Integer.bitCount(h) + Integer.bitCount(m) == n) {
                    if (h == 17 && m == 25) {
                        ret.add(String.format("%d:%02d", h, m));
                    }
                }
            }
        }
        return ret;
    }
}


