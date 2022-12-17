package com.codewars.make-a-function-that-does-arithmetic;

/**
 *	https://www.codewars.com/ challenge solved by @author davidbalsasmartin
 **/
 
import java.util.HashMap;
import java.util.function.BiFunction;

class ArithmeticFunction {
  private final static HashMap<String, BiFunction<Integer, Integer, Integer>> OPERATIONS = new HashMap<>() {{
    put("add", (x, y) -> x + y);
    put("subtract", (x, y) -> x - y);
    put("multiply", (x, y) -> x * y);
    put("divide", (x, y) -> x / y);
  }};
  
  public static int arithmetic(int a, int b, String operator) {
    return OPERATIONS.get(operator).apply(a, b);
  }
}
