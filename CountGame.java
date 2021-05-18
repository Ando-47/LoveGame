package afinalExcese;
import java.util.Random;
import java.util.Scanner;
public class CountGame {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		int numberOfDigit= 10;//桁数
		int rightAnswer;//答え

		System.out.println("数当てゲーム");
		//System.out.println("何桁で遊ぶ？（１から3の中から選んでね）");

		//桁数の入力
		/*boolean numberBool=true;
		while(numberBool) {
			System.out.println("何桁で遊ぶ？");
			numberOfDigit = scanner.nextInt();
			if(0<numberOfDigit && numberOfDigit < 4) {
				numberBool = false;
			}else {
				System.out.println("１から3までで選んでね");
			}
		}*/


		System.out.println(numberOfDigit+"桁でゲームを始めるよ");

		//正解を生成
		rightAnswer = random.nextInt(numberOfDigit) * 100;
		rightAnswer += random.nextInt(numberOfDigit) * 10;
		rightAnswer += random.nextInt(numberOfDigit);

		System.out.println("正解は"+rightAnswer);
		problem(rightAnswer);

	}

	static void problem(int rightAnswer) {
		Scanner scanner = new Scanner(System.in);
		boolean TF = true;
		int userAnswer;//答えの入力
		int count=0;

		while(TF) {
			System.out.println("正解だと思う数を入力してね");
			userAnswer = scanner.nextInt();
			count ++;
			if(userAnswer == rightAnswer) {
				TF = false;
				System.out.println("正解！！！！");
			}else if(userAnswer < rightAnswer) {
				System.out.println("答えはもっと大きい数だよ！");
			}else {
				System.out.println("答えはもっと小さい数だよ！");
			}
		}
		System.out.println("さすが！！！");
		System.out.println(count+"回で正解したね");

	}




}
