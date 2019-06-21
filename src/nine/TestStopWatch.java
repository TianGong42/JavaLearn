package nine;

import java.util.Arrays;
public class TestStopWatch {

    public static void main(String[] args){
        int[] a = new int[100000];
        StopWatch s = new StopWatch();
        for(int i = 0;i<a.length;i++){
            a[i] = (int)(Math.random()*1000000);
        }
        Arrays.sort(a);
        s.stop();
        System.out.println(s.getElapsedTime());
    }
}
