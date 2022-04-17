package wildCard;

import java.util.ArrayList;
import java.util.List;

public class 동물원 {

    private List<울타리> 개방된울타리 = new ArrayList<>();

    public void 울타리개방(울타리<?> 울타리){
        this.개방된울타리.add(울타리);
    }
    public void 육식동물울타리개방(울타리<? extends 육식동물>울타리){
        this.개방된울타리.add(울타리);
    }
    public void 초식동물울타리개방(울타리<? extends 초식동물>울타리){
        this.개방된울타리.add(울타리);
    }

    //사슴, 초식동물, 동물
    public void 사슴울타리개방(울타리<? super 사슴>울타리){
        this.개방된울타리.add(울타리);
    }

    public void 열린울타리공지(){
        for (울타리 울타리 : 개방된울타리) {
            System.out.println(울타리+"가 열렸습니다. 구경하러 오세요.");
        }
    }

    public static void main(String[] args) {
        울타리<육식동물> 육식1 = new 울타리<>("육식모음");
        울타리<사슴> 사슴1 = new 울타리<>("사슴만");
        육식1.addAnimal(new 호랑이("수컷"));

        육식1.intro();
    }
}
