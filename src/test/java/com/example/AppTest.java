package com.example;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.beans.Transient;

import org.junit.Test;

import com.example.DevelopedStack;
import com.example.Infix;
import com.example.Txtreader;

public class AppTest {

    private DevelopedStack stack = new DevelopedStack();

    @Test
    public void testApp() {
        Txtreader txtreader = new Txtreader();
        assertEquals(txtreader.readTxTFile("prueba.txt").get(0), "6");
        assertEquals(txtreader.readTxTFile("prueba.txt").get(1), "2");
        assertEquals(txtreader.readTxTFile("prueba.txt").get(2), "3");
        assertEquals(txtreader.readTxTFile("prueba.txt").get(3), "+");
    }

    @Test
    public void testPushAndTop() {
        stack.push(1);
        assertEquals(1, stack.top());
        stack.push(2);
        assertEquals(2, stack.top());
        stack.push(3);
        assertEquals(3, stack.top());
    }

    @Test
    public void testPop() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        assertEquals(2, stack.pop(2));
        assertEquals(1, stack.pop(1));
        assertEquals(null, stack.pop(0));
        assertNull(stack.pop(0));
    }

    @Test
    public void testIsEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
        stack.pop(0);
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testTopOnEmptyStack() {
        assertNull(stack.top());
    }

    @Test
    public void testPopOnEmptyStack() {
        assertNull(stack.pop(0));
    }
    
    @Test
    public void testInfixToPostfix() {
        assertEquals(Infix.infixToPostfixa(new Txtreader().readTxTFile("prueba.txt")).get(0), "6");
        assertEquals(Infix.infixToPostfixa(new Txtreader().readTxTFile("prueba.txt")).get(1), "2");
        assertEquals(Infix.infixToPostfixa(new Txtreader().readTxTFile("prueba.txt")).get(2), "3");
        assertEquals(Infix.infixToPostfixa(new Txtreader().readTxTFile("prueba.txt")).get(3), "+");
    }
}
