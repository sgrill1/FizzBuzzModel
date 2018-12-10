package FizzBuzzV2.Test;

import org.junit.Test;
import java.text.DecimalFormat;
import FizzBuzzV2.Main.FizzBuzz;


public class PerformanceTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    public void testRunTime(){
        long start = System.nanoTime ();
        fizzBuzz.fizzBuzzIterator(-100,100);
        long end = System.nanoTime ();
        printResult(start,end);
    }

    private void printResult(long start, long end){
        long time = end - start;
        DecimalFormat df = new DecimalFormat("###,###.####");
        System.out.println ("Time taken: " + (df.format((time)) + " nano seconds"));
    }
}
