package com.informatica.restassured.restapi.swatiPersonal;
import org.testng.annotations.Test;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.*;


public class TestHackathon2  {

    String data;
    @Test()
    public void HackTest1() {
        //Negate the NullPointerException
        System.out.println( data); // throws NullPointerException
    }
    @Test()
    public void HackTest2() {
        //Conquer the ClassCastException
        Date today = new Date();
        Timestamp time = (Timestamp)today;

        long seconds = System.currentTimeMillis();
         time = new Timestamp(seconds);
         today = (Date)time; // this cast works

    }
    @Test()
    public void HackTest3() {
        //ArrayIndexOutOfBoundsException example
        String[] data = new String[5];
        data[6] = "More Data";
    }
    @Test()
    public void HackTest4() {
        //ArrayStoreException
        Number[] bigInt = new BigInteger[5];
        bigInt[0] = Double.valueOf(12345);
    }
    @Test()
    public void HackTest5() {
       //Knock out the NoSuchElementException
        Set set = new HashSet();
        set.iterator().next();
    }
    @Test()
    public void HackTest6() {
        //Anticipate the ArtithmeticException
        int test_123test = 100;
        System.out.println( test_123test); // throws ArithmeticException
    }
    @Test()
    public void HackTest7() {
        //Anticipate the ArtithmeticException
        int x = 100;
        int y = 0;  // denominator is set to zero
        System.out.println( x/y ); // throws ArithmeticException
    }

}
