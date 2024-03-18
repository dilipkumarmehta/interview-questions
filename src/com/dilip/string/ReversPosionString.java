package com.dilip.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReversPosionString {
    public static void main(String[] args) {
        String s = "dilip kumar mehta dilip how are you";
        String result = Arrays.stream(s.split(" "))
                             .map(word -> word.equals("dilip") ? reverseString(word) : word)
                             .collect(Collectors.joining("\t"));
      //  System.out.println(result);
        
        StringBuilder b=new StringBuilder();
        b.append(s);
       
        System.out.println("reverse: "+b.reverse());
    }
    
  

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
