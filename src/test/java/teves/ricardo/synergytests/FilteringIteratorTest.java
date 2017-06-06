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
    
    @Test
    public void testHasNext3() {
        System.out.println("hasNext3");
        FilteringIterator another = mock(FilteringIterator.class);
        when(another.hasNext()).thenReturn(Boolean.FALSE);
        when(another.next()).thenReturn(null);
        IObjectTest myTest = mock(IObjectTest.class);
        when(myTest.test(another)).thenReturn(Boolean.FALSE);
        FilteringIterator instance = new FilteringIterator(another, myTest);
        boolean expResult = false;
        boolean result = instance.hasNext();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testHasNext4() {
        System.out.println("hasNext4");
        FilteringIterator another = mock(FilteringIterator.class);
        when(another.hasNext()).thenReturn(Boolean.TRUE);
        when(another.next()).thenReturn(another);
        IObjectTest myTest = mock(IObjectTest.class);
        when(myTest.test(another)).thenReturn(Boolean.TRUE);
        FilteringIterator instance = new FilteringIterator(another, myTest);
        boolean expResult = true;
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

    /**
     * Test of next method, of class FilteringIterator.
     */
    @Test
    public void testNext3() {
        System.out.println("next3");
        FilteringIterator another = mock(FilteringIterator.class);
        when(another.hasNext()).thenReturn(Boolean.FALSE);
        when(another.next()).thenReturn(null);
        IObjectTest myTest = mock(IObjectTest.class);
        when(myTest.test(another)).thenReturn(Boolean.FALSE);
        FilteringIterator instance = new FilteringIterator(another, myTest);
        Object expResult = null;
        Object result = instance.next();
        assertEquals(expResult, result);
    }
    

    /**
     * Test of next method, of class FilteringIterator.
     */
    @Test
    public void testNext4() {
        System.out.println("next4");
        FilteringIterator another = mock(FilteringIterator.class);
        when(another.hasNext()).thenReturn(Boolean.TRUE);
        when(another.next()).thenReturn(another);
        IObjectTest myTest = mock(IObjectTest.class);
        when(myTest.test(another)).thenReturn(Boolean.TRUE);
        FilteringIterator instance = new FilteringIterator(another, myTest);
        Object expResult = another;
        Object result = instance.next();
        assertEquals(expResult, result);
    }
    
}
