package list;
import list.IList;
import list.MyArrayList;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class MyArrayListTest {
    @Test
    public void add()
    {
        IList <Integer> given = new MyArrayList<>();
        for(int i = 0; i < 52; i++)
        {
            given.add(i);
            assertEquals(i, given.get(i));
        }
    }
    @Test
    public void insert()
    {
        MyArrayList<Integer> given = new MyArrayList<>();
        MyArrayList<Integer> given2 = new MyArrayList<>();
        // 일단 50개 채워두고
        for(int i = 0; i < 4; i++)
        {
            given.add(i);
            given2.add(i);
        }
        given.insert(2,100);

        assertArrayEquals(given2.getArray(),given.getArray());

    }
    @Test
    public void clear()
    {
        IList<Integer> given = new MyArrayList<>();
        for(int i = 0; i < 100; i++)
        {
            given.add(i);
        }
        // 100개가 담겼나 확인
        assertEquals(100, given.size());
        // 초기화
        given.clear();
        // 0개가 담겼나 확인
        assertEquals(0, given.size());
    }
    @Test
    public void delete()
    {
        IList<Integer> given = new MyArrayList<>();
        // given 배열에 0부터 49 채워넣기
        for(int i = 0; i < 50; i++)
        {
            given.add(i);
        }
        // given 에 값이 30인 값의 인덱스를 찾아 삭제
        given.delete(30);
        // 값을 삭제했으니 given 의 사이즈가 줄어들었나 확인
        assertEquals(49, given.size());
        // 값이 정말 삭제되었나 확인 (삭제되었으면 배열에 30이 없으니 -1 리턴됌)
        assertEquals(-1, given.indexOf(30));
    }
    @Test
    public void deleteByIndex()
    {
        IList<Integer> given = new MyArrayList<>();
        // given 배열에 0부터 49 채워넣기
        for(int i = 0; i < 50; i++)
        {
            given.add(i);
        }
        // 10번 인덱스 삭제하기(9 삭제)
        given.deleteByIndex(10);
        // 사이즈가 줄어들었나 확인
        assertEquals(49, given.size());
        // 10번 인덱스가 삭제되었나 확인(삭제되었으면 배열에 9이 없으니 -1 리턴됌)
        assertEquals(-1, given.indexOf(10));
    }
}
