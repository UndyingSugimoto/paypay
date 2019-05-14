package queue;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import queue.impl.QueueExtend;

class QueueExtendTest {

    public class TestClass {
    }

    @Test
    void unitTest() {
        TestClass elmHead = new TestClass();
        TestClass elmTail = new TestClass();
        Queue<TestClass> target = new QueueExtend<>();
        Queue<TestClass> newResult = target.enQueue(elmHead);
        newResult = newResult.enQueue(elmTail);

        // 異なるオブジェクトであること
        assertNotEquals(target, newResult);

        // deQueueの前は2件ある
        assertFalse(newResult.isEmpty());

        // 先頭のオブジェクトであること
        assertEquals(newResult.head(), elmHead);

        // deQueueする
        newResult = newResult.deQueue();

        // 末尾のオブジェクトであること
        assertEquals(newResult.head(), elmTail);

        // deQueueする
        newResult = newResult.deQueue();

        // ２回deQueueしたので、空になる
        assertTrue(newResult.isEmpty());
    }

}
