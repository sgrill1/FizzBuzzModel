package FizzBuzzV2.Main;

import java.util.HashMap;


public class FizzBuzz {

    private HashMap<Integer, String> fizzBuzzHashMap;
    private Integer total = 0;


    public void fizzBuzzIterator(Integer start, Integer end){
        fizzBuzzChecker(start, end);
        System.out.println(fizzBuzzHashMap);
    }

    private void fizzBuzzChecker(Integer start, Integer end){
        fizzBuzzHashMap= new HashMap<Integer, String>();
        for (int i = start; i <= end ; i++) {
            if (i % 15 == 0 && i != 0) {
                fizzBuzzHashMap.put(i, " FizzBuzz");
                total += i;
            } else if (i % 3 == 0 && i != 0) {
                fizzBuzzHashMap.put(i, " Fizz");
                total += i;
            } else if (i % 5 == 0 && i != 0 ) {
                fizzBuzzHashMap.put(i, " Buzz");
                total += i;
            } else {
                fizzBuzzHashMap.put(i, " Null");
                total += i;
            }
        }
    }
    public HashMap<Integer, String> getFizzBuzzHashMap(){
        return fizzBuzzHashMap;
    }

    public int getTotal() {
        return total;
    }


}
