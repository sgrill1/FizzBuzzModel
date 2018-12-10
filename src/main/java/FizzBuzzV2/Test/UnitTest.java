package FizzBuzzV2.Test;

import FizzBuzzV2.Main.FizzBuzz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

public class UnitTest {

    public FizzBuzz fizzBuzz = new FizzBuzz();
    private HashMap<Integer, String> fizzBuzzHashMap;

    @Before
    public void initialize(){
        fizzBuzz.fizzBuzzIterator(-30,30);
        fizzBuzzHashMap = fizzBuzz.getFizzBuzzHashMap();
    }


    @Test
    public void checkDivisibleByFifteenReturnFizzBuzz(){
        for (Integer key: fizzBuzzHashMap.keySet()
             ) {
            if (key % 15 == 0 && key != 0){
                Assert.assertEquals(fizzBuzzHashMap.get(key), " FizzBuzz");
            }
        }
    }

    @Test
    public void checkDivisibleByThreeReturnsFizz(){
        for (Integer key: fizzBuzzHashMap.keySet()
        ) {
            if (key % 3 == 0 && key % 15 != 0){
                Assert.assertEquals(fizzBuzzHashMap.get(key), " Fizz");
            }
        }
    }

    @Test
    public void checkDivisibleByFiveReturnsBuzz(){
        for (Integer key: fizzBuzzHashMap.keySet()
        ) {
            if (key % 5 == 0 && key % 15 != 0){
                Assert.assertEquals(fizzBuzzHashMap.get(key), " Buzz");
            }
        }
    }

    @Test
    public void checkZeroReturnsNull(){
        Assert.assertEquals(fizzBuzzHashMap.get(0), " Null");
    }

    @Test
    public void checkTotalGivesSizeOfHashMap(){
        Assert.assertEquals(fizzBuzzHashMap.size(), fizzBuzz.getTotal());
    }







}
