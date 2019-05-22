package kangmini.tdd.start;

public class LottoNumber {
    private int num;

    public LottoNumber(int num) {
        validate(num);
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }

    private void validate(int num) {
        if(num < 1 || num > 45) throw new RuntimeException("로또번호는 1 ~ 45 사이 숫자야 합니다.");
    }
}
