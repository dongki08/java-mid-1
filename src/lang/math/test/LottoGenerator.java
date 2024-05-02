package lang.math.test;

import java.util.Arrays;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count;

    public int[] generate() {
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            int number = random.nextInt(45) + 1;
            if(isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }
        Arrays.sort(lottoNumbers);
        return lottoNumbers;
    }
    private boolean isUnique(int number) {
        for(int i = 0; i < count; i++) {
            if(number == lottoNumbers[i]) {
                return false;
            }
        }
        return true;
    }

    public void printLottoNumber() {
        System.out.print("로또 번호 : ");
        for(int i = 0; i < lottoNumbers.length; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }
}
