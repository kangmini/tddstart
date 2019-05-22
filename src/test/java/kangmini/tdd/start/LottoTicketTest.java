package kangmini.tdd.start;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LottoTicketTest {

    @Test
    public void 로또한장_생성() {
        List<LottoNumber> lottoNumbers = new ArrayList<>();
        lottoNumbers.add(new LottoNumber(2));
        lottoNumbers.add(new LottoNumber(3));
        lottoNumbers.add(new LottoNumber(11));
        lottoNumbers.add(new LottoNumber(25));
        lottoNumbers.add(new LottoNumber(43));
        lottoNumbers.add(new LottoNumber(9));

        LottoTicket lottoTicket = new LottoTicket(lottoNumbers);
    }
}
