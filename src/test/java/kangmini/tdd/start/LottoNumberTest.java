package kangmini.tdd.start;

import static org.junit.Assert.*;
import org.junit.Test;

public class LottoNumberTest {

    @Test
    public void 로또번호입력() {
        LottoNumber lottoNumber = new LottoNumber(3);
        assertEquals(lottoNumber.getNum(), 3);
    }

    @Test(expected = RuntimeException.class)
    public void 로또번호잘못입력() {
        new LottoNumber(49);
    }
}
