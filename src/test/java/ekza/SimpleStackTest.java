package ekza;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Stack;

import static org.junit.Assert.*;

/**
 * Created by elmk93 on 15/04/16.
 */
public class SimpleStackTest {

    SimpleStack simpleStack = new SimpleStackImpl();

    @Before
    public void setUp() throws Exception{

        System.out.println("***** Lancement des tests  *****");

    }

    @Test
    public void testIsEmpty() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element = "Hello my friend \n";
        Item item = new Item(element);
        simpleStack.push(item);
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testGetSize() throws Exception {
        Assert.assertEquals(0, simpleStack.getSize());
        String element = "Hello my friend \n";
        Item item = new Item(element);
        simpleStack.push(item);
        Assert.assertEquals(1, simpleStack.getSize());
    }

    @Test
    public void testPush() throws Exception {
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element = "Hello my friend \n";
        Item item = new Item(element);
        simpleStack.push(item);
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void testPeek() throws Exception {
        String element = "Hello my friend \n";
        Item item = new Item(element);
        simpleStack.push(item);
        Assert.assertTrue(simpleStack.getSize()!=0);
        Item itemPeek = simpleStack.peek();
        Assert.assertEquals(itemPeek, item);
    }

    @Test
    public void testPop() throws Exception {
        String element = "Hello my friend \n";
        Item item = new Item(element);
        simpleStack.push(item);
        Assert.assertTrue(simpleStack.getSize()!=0);
        Item itemPop = simpleStack.pop();
        Assert.assertTrue(simpleStack.isEmpty());
    }
}