package kangmini.tdd.start;

import java.util.List;

public class LottoTicket {

    private List<LottoNumber> lottoNumbers;

    public LottoTicket(List<LottoNumber> lottoNumbers) {
        this.lottoNumbers = lottoNumbers;
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }

    private void validate(List<LottoNumber> lottoNumbers) {

    }

    private void numberSizeValidate() {
        if(lottoNumbers.size() != 6) throw new RuntimeException("1게임은 6개의 숫자를 선택해야 합니다.");
    }

    private void duplicateNumberValidate() {

    }
}
