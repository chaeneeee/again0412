//package java20240412;
//
//import java.util.Scanner;
//
//public class example3 {
//    public static void main(String[] args) {
//
//        /**
//         * 사용자로부터 이름과 나이를 입력 받아
//         * 그 정보를 화면에 출력하는 간단한 프로그램 작성하세요
//         * 이름은 숫자가 들어오면 안됩니다
//         * 나이는 숫자만 들어와야합니다
//         */
//        // 이름과 나이를 입력받음
//        //콘솔로 입력 받아야함 총 2개의 변수 필요
//        // 이름과 나이 나이는 숫자 ?
//        //일단 숫자 검증은 미루고 데이터를 올바르게 받고 출력하는 것부터 구현
//        // 콘솔 입력을 위한 scanner 객체 형ㅇ성
//
//
//
//        Scanner sc = new Scanner(System.in);
//
//        String name =sc.nextLine();
//        String digit = "0123456789";
//        for(int i =0; i < name.length(); i++){
//
//            //숫자가 걸린다면
//            if(digit.indexOf(name.charAt(i)) !=-1){
//                System.out.println("이름에 숫자가 포함되어 있습니다.");
//                return; //그냥 리턴하면 아무것도 반환 x
//            }
//        }
//
//
//        //이름 검증 필요 단하나라도 숫자가 있으면 오류 메시지 출력
//        String age = sc.nextLine();
//        for(int i=0; i<age.length(); i++){
//            if (digit.indexof(age.charAt(i)) == -1){
//                System.out.println("나이는 숫자만 입력해야 합니다.");
//            }
//
//
//
//
//
//        }
//
//
//
//
//
//        //아까는 숫자를 만나면 멈췄지만 지금은 숫자가 아닐때 멈춰야한다
//
//
//
//        //숫자만 입력받게 되어있어 숫자가 아닌 것이 오면 아예 꺼져버린다
////        nextInt 를 쓰면 그래서 숫자만 들어오게 제한하는 코드를 짤 수 없다.
////        아예 문자열이 들어오면 오류 뜨고 종료되니까
//        //그래서 타입을 String 으로 바꿔준다
//        /** 숫자가 아닐 때 오류를 만나지 않고 메시지를 출력하고 멈춰야함
//         *
//         */
//
//
//
//
//
//        //스캐너 객체를 사용하여 이름을 입력받음
//        //이름은 문자열  > nextLine()
//        //스캐너 객체를 사용하여 나이를 입력받음
////    나이는 숫자 (정수 ) >nextInt()
//
//
//
//
//        System.out.printf("사용자 이름은 %s 나이는 %s",name ,age);
//
//    }
//
//public static boolean isDigit (String str) {
//        String digit = "0123456789";
//        for (int i=0; i<str.length(); i++) {
//            if (digit.indexOf(str.charAt(i)) != -1) {
//                return false;
//            }
//        }
//}
//
//}
