package StaticMethods;

import java.util.ArrayList;
import java.util.List;

public class GoldenRatio {
    public static int magicalString(int n) {
        List<Integer> list = new ArrayList<>();
        
        list.add(1);
        list.add(2);
        
        int i = 1;
        int j = 1;
        while (j < n) {
            int num = list.get(j);
            
            if (num == 2) {
                if (list.get(i) == 2) {
                    if (list.get(i - 1) == 2) {
                        list.add(1);
                        list.add(1);
                        i += 2;
                    } else {
                        list.add(2);
                        i += 1;
                    }
                } else {
                    if (list.get(i) == 1) {
                        list.add(2);
                        list.add(2);
                        i += 2;
                    } else {
                        list.add(1);
                        i += 1;
                    }
                }
            } else {
                list.add(list.get(i - 1) == 2? 1 : 2);
                i++;
            }
            j++;
        }
        
        int count = 0;
        for (i = 0; i < n; i++) {
            count += (list.get(i) == 1? 1 : 0);
        }
        
        return count;
    }
	public static void main(String[] args) {
		magicalString(7);
	}

}
