import java.util.ArrayList;
import java.util.Scanner;

public class H01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> calculationHistory = new ArrayList<>();
        boolean continueCalculating = true;

        while (continueCalculating) {
            System.out.print("첫 번째 정수를 입력하세요: ");
            int num1 = scanner.nextInt();

            System.out.print("연산자를 입력하세요 (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            System.out.print("두 번째 정수를 입력하세요: ");
            int num2 = scanner.nextInt();

            
            double result = (0) ;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    System.out.println("계산 결과: " + result);
                    break;
                case '-':
                    result = num1 - num2;
                    System.out.println("계산 결과: " + result);
                    break;
                case '*':
                    result = num1 * num2;
                    System.out.println("계산 결과: " + result);
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    } else {
                        result = (double) num1 / num2;
                        System.out.println("계산 결과: " + result);
                    }
                    break;
                default:
                    System.out.println("잘못된 연산자입니다.");
                    break;
            }

            // 계산 결과를 ArrayList에 저장
            calculationHistory.add(result);

            // 계산 결과 9개 이상이면 가장 오래된 결과 삭제
            if (calculationHistory.size() > 9) {
                calculationHistory.remove(0);
            }

            System.out.print("계속 계산하시겠습니까? (y/n/l): ");
            String continueInput = scanner.next();
            if (continueInput.equalsIgnoreCase("n")) {
                continueCalculating = false;
                System.out.println("계산을 종료합니다.");
            } else if (continueInput.equalsIgnoreCase("l")) {
                System.out.println("계산 결과 목록:");
                for (double result1 : calculationHistory) {
                    System.out.println(result1);
                }
            }
        }
    }
}