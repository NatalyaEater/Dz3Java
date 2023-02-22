// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task {
    public static void main(String[] args) {
        int[] onearr = { 1, 3, 5, 7, 9 };
        int[] twoarr = { 2, 4, 6, 8, 10 };
        int[] res = new int[onearr.length + twoarr.length];

        Logger logger = Logger.getLogger(task.class.getName());
        FileHandler fh;
        try {
            fh = new FileHandler("log.txt");
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();
            fh.setFormatter(formatter);

            int i=0, j=0;
            for (int k=0; k<res.length; k++) {
        
                if (i > onearr.length-1) {
                    int a = twoarr[j];
                    res[k] = a;
                    j++;
                }
                else if (j > twoarr.length-1) {
                    int a = onearr[i];
                    res[k] = a;
                    i++;
                }
                else if (onearr[i] < twoarr[j]) {
                    int a = onearr[i]; 
                    res[k] = a;
                    i++;
                }
                else {
                    int b = twoarr[j];
                    res[k] = b;
                    j++;
                }
            logger.info("Sorted array" + Arrays.toString(res));
            } 
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}