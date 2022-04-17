package wildCard;

import java.util.ArrayList;
import java.util.List;

public class 울타리 <T>{
    private String name="";
    private List<T> 울타리동물들 = new ArrayList<>();

    public 울타리(String name){
        this.name = name;
    }

    public void addAnimal(T animal){
        울타리동물들.add(animal);
    }

    public void intro(){
        for (T 동물 : 울타리동물들) {
            System.out.println(동물);
        }
    }
    public String toString(){
        return this.name;
    }
}
