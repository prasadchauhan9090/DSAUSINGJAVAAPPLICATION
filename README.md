# Adjacent String ASCII Difference Calculator

## Description
This Java program calculates the sum of ASCII differences between **adjacent characters** in a given string. It converts each character into its ASCII value, finds the absolute difference between consecutive characters, and adds them together.

For example, for the string `hello`, it calculates the ASCII differences between:
- `h` and `e`
- `e` and `l`
- `l` and `l`
- `l` and `o`

and prints their individual values and total sum.

---

## How the Program Works

1. Takes a string as input (currently hardcoded).
2. Loops through adjacent characters.
3. Converts characters to ASCII values.
4. Finds the absolute difference of each pair.
5. Adds and prints the total.

---

## Sample Code

```java
package com.dsa.in;

public class AdjcentStringCalculationUsingJava {
    
    public static void main(String args[]) {
        
        String s = "hello";
        int temp = 0;
        int add = 0;
        int c = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            char d = s.charAt(i);
            char dd = s.charAt(i + 1);
            
            int a = d;
            int b = dd;
            
            temp = Math.abs(a - b);
            add = add + temp;
            System.out.println(temp);
        }
        
        System.out.println(c);
        System.out.println("RESULT: " + add);
    }
}
