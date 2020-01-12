package leetcode.p895;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FreqStackTest {

    @Test
    public void shouldHandleBasicCase() {
        FreqStack2 freqStack = new FreqStack2();
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(5);
        freqStack.push(7);
        freqStack.push(4);
        freqStack.push(5);

        assertEquals(5, freqStack.pop());
        assertEquals(7, freqStack.pop());
        assertEquals(5, freqStack.pop());
        assertEquals(4, freqStack.pop());
        assertEquals(7, freqStack.pop());
        assertEquals(5, freqStack.pop());
    }

}