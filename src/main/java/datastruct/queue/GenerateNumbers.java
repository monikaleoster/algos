package datastruct.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class GenerateNumbers {

    static Queue<Integer> queue = new ArrayDeque<>();
    static void printFirstN(int n, int[] digits){

        for(int i =0;i<digits.length;i++){
            queue.add(digits[i]);
        }
        for(int i =0; i<n;i++){
            int digit = queue.poll();
            System.out.println(digit);
            for(int j =0;j<digits.length;j++) {
                queue.add(new Integer(digit+""+digits[j]));

            }

            }



        }
    public static void main(String[] args) {
        int[] digits = {0,1,2,3,4,5,6};
        printFirstN(20,digits);
    }
}
