package Hash;

import Hash.IHashTable;
import Hash.MyLinkedHashTable;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class MyHashTableTest {

    @Test
    public void put(){
        IHashTable<String, Integer> given = new MyLinkedHashTable<>();
        
        //임의의 키,값 put
        given.put("hello",1);
        given.put("world",3);
        given.put("korea",10);
        given.put("awesome",5);
        given.put("data",3);
        given.put("hard",111);
        
        //해쉬맵에 들어있는 요소들 크기 확인
        assertEquals(6, given.size());

        //hello키값이 존재하는지 확인
        assertTrue(given.contains("hello"));


        
        //키 값 타입 바꿔서 동작하는지 해보기
        IHashTable<Integer, String> given2 = new MyLinkedHashTable<>();
        given2.put(201, "철수");
        given2.put(202, "짱구");
        given2.put(311, "훈이");
        given2.put(305, "맹구");
        given2.put(509, "유리");

        //해쉬맵에 들어있는 요소들 크기 확인
        assertEquals(5, given2.size());

        //311키 존재하는 지 확인
        assertTrue(given2.contains(311));

        //111키 존재안하는 지 확인
        assertFalse(given2.contains(111));
        
        //201호에 철수가 있는지 확인
        assertEquals("철수", given2.get(201));
    }

    @Test
    public void get(){
        IHashTable<String, Integer> given = new MyLinkedHashTable<>();
        //임의의 키,값 put
        given.put("hello",1);
        given.put("world",3);
        given.put("korea",10);
        given.put("awesome",5);
        given.put("data",3);
        given.put("hard",111);

        //korea키값 안에 10이 들어있는 지 확인
        assertEquals(10,given.get("korea"),"value 값이 다릅니다.!!!");

        //없는 키값 입력
        assertNotEquals(10,given.get("hihi"),"존재하는 키값입니다.");
    }

    @Test
    public void delete(){
        IHashTable<Integer, String> given = new MyLinkedHashTable<>();
        //임의의 키,값 put
        given.put(201, "철수");
        given.put(202, "짱구");
        given.put(311, "훈이");
        given.put(305, "맹구");
        given.put(509, "유리");

        //해쉬맵에 들어있는 요소들 크기 확인
        assertEquals(5, given.size());
        
        given.delete(305);  //305호 맹구 삭제
    
        //크기가 줄었는지 확인
        assertEquals(4, given.size());

        //키값 305호가 삭제되었는지 확인
        assertFalse(given.contains(305));
        
        //305키에 데이터가 없는지 확인
        assertEquals(null, given.get(305));

    }

    @Test
    public void contain(){
        IHashTable<Integer, String> given = new MyLinkedHashTable<>();
        //임의의 키,값 put
        given.put(201, "철수");
        given.put(202, "짱구");
        given.put(311, "훈이");
        given.put(305, "맹구");
        given.put(509, "유리");

        //111키가 존재안하는지 확인
        assertFalse(given.contains(111));

        //202가 존재하는지 확인
        assertTrue(given.contains(202));
    }
}
