package day03.lotto;

import java.util.Arrays;
import java.util.Random;

public class LottoBall {
    // 로또 당첨 정답 번호 배열입니다 (총 6개 정답번호가 저장되어있습니다)
    Random random2 = new Random();

    int lotto[] = new int[6];
    public int[] getLotto(){
        return lotto;
    }

    public void start(){
        Arrays.fill(lotto, 0); // 배열에 초기 전체 데이터 0을 모두 대입시켜줍니다

        int idx = 0; // 배열 번지 번호를 지정하기 위한 인덱스 변수값 생성
            while (true) {
            int zero = 0; // 0이 아닌값이 정상적으로 모두 저장된것인지 확인 위해 변수 선언
            for (int i = 0; i < lotto.length; i++) {
                if (lotto[i] == 0) { // 배열 각 번지를 전체 확인 하면서 0 값이 있을 경우 zero 값을 증가시킴니다
                    zero++;
                }
            }
            // zero 변수값이 카운트된게 없을 경우 정상적으로 값이 모두 대입된 것을 확인
            if (zero <= 0) {
                break; // while 무한 루프를 탈출합니다
            } else { // 배열에 랜덤 정수값을 다 저장하지 않은 경우 수행합니다
                // 랜덤 정수값 1부터 45범위까지 임의 정수를 저장합니다
                int random_lotto = random2.nextInt(45) + 1;

                // 배열에 랜덤으로 생성된 값이 이미 저장되어 있으면 중복저장하지 않기위해 검사를 실시합니다
                int check = 0;
                for (int k = 0; k < lotto.length; k++) {
                    if (lotto[k] == random_lotto) {
                        check++; // 배열 각 번지를 전체 확인 하면서 일치하는 정수값이 있을 경우 check 값을 증가시킴니다
                    }
                }

                // 이미 저장된 값이 없을 경우 배열에 데이터를 저장시킵니다
                if (check <= 0) {
                    lotto[idx] = random_lotto;
                    idx++; // 저장을 수행하기 위한 배열 번지값을 증가시킨 후 다시 while문을 반복합니다
                }
            }

        }
    } // while 문 종료
    public void print(){
        System.out.println("로또 당첨 번호 : " + Arrays.toString(lotto));
}
}