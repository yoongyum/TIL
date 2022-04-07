package list;

import java.util.Arrays;

public class MyArrayList<T> implements IList<T> {

    private static final int DEFAULT_SIZE = 50;

    private int size;   //배열의 사이즈
    private T[] elements;

    public MyArrayList(){
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    private void resize(){ //배열사이즈가 넘어가면 크기를 두배로 불려준다.
        if(this.size == this.elements.length){
            this.elements = Arrays.copyOf(this.elements, this.size *2);
        }
    }

    @Override
    public void add(T t) {  //배열안에 새로운 요소 추가.
        resize();
        this.elements[this.size++] = t;
    }

    @Override
    public void insert(int index, T t) {    //정해준 인덱스에 데이터를 넣어버림
        resize();
        for(int i=index; i < this.size  ; i++){
            this.elements[i+1] = this.elements[i];
        }
        this.elements[index] = t;
        this.size++;
    }

    @Override
    public void clear() {
        this.size = 0;
        this.elements = (T[]) new Object[DEFAULT_SIZE];
    }

    @Override
    public boolean delete(T t) {    //특정 요소를 찾아서 삭제
        for(int i=0; i < this.size ;i++){
            if(this.elements[i].equals(t)){
                for(int j = i ; j < this.size; j++){
                    this.elements[j] = this.elements[j+1];
                }
                this.size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteByIndex(int index) {   //특정 인덱스의 요소를 삭제
        if ( index < 0 || index > this.size -1) return false;

        for (int i = index; i < this.size-1 ;i++){
            this.elements[i] = this.elements[i+1];
        }
        this.size--;
        return false;
    }

    @Override
    public T get(int index) {
        if ( index < 0 || index > this.size -1) throw new IndexOutOfBoundsException();
        return this.elements[index];
    }

    @Override
    public int indexOf(T t) {
        for (int i=0; i< this.size ;i++){
            if(this.elements[i].equals(t)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(T t) {  //요소와 같은것이 배열안에 포함되어있는지 확인.
        for (int i=0; i< this.size ;i++){
            if(this.elements[i].equals(t)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return this.size;
    }
}
