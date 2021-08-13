package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(reverseString("buttchugger"));
    }
    public static String reverseString(String str){
        Stack<Character> letterStack = new Stack<Character>();
        String reversedTo = new String();
        for (int i = 0; i < str.length(); i++) {
            letterStack.push(str.charAt(i));
        }
        for (int i = 0; i < str.length(); i++) {
            reversedTo += (letterStack.pop());
        }
        return reversedTo;
    }
    
}
