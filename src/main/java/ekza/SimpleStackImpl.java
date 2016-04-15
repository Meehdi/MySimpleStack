package ekza;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by elmk93 on 15/04/16.
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    @Override
    public boolean isEmpty() {
        boolean empty = true;
        if(this.getSize()!=0){
            empty = false;
        }

        return empty;
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {

        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();

    }
}
