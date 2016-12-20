import hello.Application;

import org.junit.After;

import org.junit.AfterClass;

import org.junit.Before;

import org.junit.BeforeClass;

import org.junit.Test;

import static org.junit.Assert.*;

 

/**

*

* @author gandlap

*/

public class ApplicationTest {

   

    public ApplicationTest() {

    }

   

    @BeforeClass

    public static void setUpClass() {

        System.out.println("In setUpClass() ");

    }

   

    @AfterClass

    public static void tearDownClass() {

        System.out.println("In tearDownClass() ");

    }

   

    @Before

    public void setUp() {

        System.out.println("In setUp() ");

    }

   

    @After

    public void tearDown() {

        System.out.println("In tearDown() ");

    }

 

    

    // test method to add two values

   @Test

   public void testAdd(){     

      Application.add(3, 3);

     

      int result =6;

      assertTrue(result == 6);

   }

}
