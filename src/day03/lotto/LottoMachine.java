//package day03.lotto;
//
//public class LottoMachine {
//    private LottoBall ball;
//    private User user;
//
//    public void compare(){
//        ball.start();
//        ball.print();
//        user.start();
//        user.print();
//        int count = 0;
//        for (int j = 0; j < ball.lotto.length; j++) { // 로또 정답 배열
//            for (int h = 0; h < user.number.length; h++) { // 사용자 로또 번호 배열
//                if (ball.lotto[j] == user.number[h]) {
//                    count++; // 사용자 로또 배열 값이 로또 정답 배열 값이랑 같은게 있을 경우 count 증가
//                }
//            }
//        }
//
//        System.out.println("맞힌 개수 : " + count);
//
//        if (count == 6) {
//            System.out.println("등수 : " + "1등 입니다");
//        } else if (count == 5) {
//            System.out.println("등수 : " + "2등 입니다");
//        } else if (count == 4) {
//            System.out.println("등수 : " + "3등 입니다");
//        } else {
//            System.out.println("등수 : " + "꽝 ... 입니다");
//        }
//        System.out.println("dddddsssss");
//    }
//
//}