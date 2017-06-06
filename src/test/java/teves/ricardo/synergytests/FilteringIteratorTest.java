/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teves.ricardo.synergytests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 *
 * @author rfteves
 */
public class FilteringIteratorTest {
    
    public FilteringIteratorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of hasNext method, of class FilteringIterator.
     */
    @Test(expected=NullPointerException.class)
    public void testHasNext() {
        System.out.println("hasNext");
        FilteringIterator instance = null;
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testHasNext2() {
        System.out.println("hasNext2");
        FilteringIterator instance = mock(FilteringIterator.class);
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of next method, of class FilteringIterator.
     */
    @Test(expected=NullPointerException.class)
    public void testNext() {
        System.out.println("next");
        FilteringIterator instance = null;
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of next method, of class FilteringIterator.
     */
    @Test
    public void testNext2() {
        System.out.println("next2");
        FilteringIterator instance = mock(FilteringIterator.class);
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
    }
    
}
