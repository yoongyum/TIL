package wildCard;

public class 육식동물 implements 동물 {
    String 성별 = "";
    String 울음소리 = "";
    육식동물(String 성별, String 울음소리){
        this.성별 = 성별;
        this.울음소리 = 울음소리;
    }
    @Override
    public void 울음소리() {
        System.out.println(this.울음소리);
    }
    @Override
    public String toString(){
        return 성별+" "+울음소리;
    }
}
