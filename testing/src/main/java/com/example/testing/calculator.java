package com.example.testing;

import org.springframework.stereotype.Component;
@Component
public class calculator {
public static int add(int x, int y){
    return x + y;
}
public static int subtract(int x, int y){
    return x - y;
}
public static int Multiplication(int x, int y){
    return x * y;
}
public static int Division(int x, int y){
    return x /y;
}
public static int minNumber(int... numbers){
    int a = 0;
    for(int x : numbers){
    a += x;
    }
    return a;
}
}
