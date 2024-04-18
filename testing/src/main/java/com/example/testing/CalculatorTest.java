package com.example.testing;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorTest {

    calculator scc= new calculator();
    @BeforeAll
    public static  void setup(){
        System.out.println("This runs when runs the all test cases.");
    }

    @BeforeEach
    public void BeforeEveryTest(){
        System.out.println("Before runs the all the testcase");
    }
    @Test
    public void testAdd(){
    int result = calculator.add(2,6);
    int expected = 8;
        Assertions.assertEquals(expected, result);
        }
    @Test
        public void testMultipliy(){
        int result = calculator.Multiplication(10, 15);
        int expected = 150;
        Assertions.assertEquals(expected, result);
        }
        @Test
        public  void testSubtract(){
        int result = calculator.subtract(8, 5);
        int expected = 3;
        Assertions.assertEquals(expected, result);
        }
        @Test
        public void testDivision(){
            System.out.println("division");
        int result = calculator.Division(12, 4);
        int expected = 3;
        Assertions.assertEquals(expected, result);
        }
        @Test
        public void testminNumber(){
        int result = calculator.minNumber(2,3, 3,4);
        int expected = 12;
        Assertions.assertEquals(expected, result);
        }

        @AfterAll
        public static void after(){
            System.out.println("This clean after all the runs");
        }

}
