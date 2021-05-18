package afinalExcese;

import java.util.Scanner;

public class WadakenSyutaro {
	static void wadaken(String nameString) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;
		
		//一緒に帰るスタイル
		//一緒に帰ろう
		System.out.println("((野球部が部活をしている。。))");
		LoveGame.consoleStop();
		System.out.println("そろそろ部活に行かなくちゃ！");
		LoveGame.consoleStop(3000);
		System.out.println("((部活終了後グラウンド。。。))");
		LoveGame.consoleStop();
		System.out.println("((一人で片付けしているわだけん))");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　一緒に片付けするよ！");
		LoveGame.consoleStop();
		System.out.println("わだけん ： ありがと！");
		LoveGame.consoleStop();
		System.out.println("((一緒に片付け。。。。))");
		LoveGame.consoleStop();
		System.out.println("わだけん ： おれいになんかおごるよ！一緒に帰ろ");
		LoveGame.consoleStop();
		
		while(true) {
			System.out.println("１：一緒に帰る　２：断る");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println(nameString+"：　塾の時間あるから今日は無理だわ");
				LoveGame.consoleStop();
				System.out.println("わだけん　：　いいよ塾なんて。一回くらいさぼっちまえよ");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
			}
		
		
		System.out.println(nameString+"： ありがと！");
		LoveGame.consoleStop();
		System.out.println("((帰り道 コンビニ））");
		LoveGame.consoleStop();
		System.out.println("わだけん ： 好きなものなんでもいいよ");
		LoveGame.consoleStop();
		
		while(true) {
			System.out.println("何を選ぶ？");
			System.out.println("１：アイス　２：チョコレート");
			select = scanner.nextInt();
			if(select == 1 || select == 2) {
				break;
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
			}
		
		
		System.out.println(nameString+"： 今日はありがと！おいしかった！");
		LoveGame.consoleStop();
		System.out.println(nameString+"： じゃあ私こっちだから、またね");
		LoveGame.consoleStop();
		System.out.println("わだけん ： ちょっとまって。。！");
		LoveGame.consoleStop();
		System.out.println("わだけん ： 今日みたいな感じでこれからも帰りたいな");
		LoveGame.consoleStop(3000);
		System.out.print("わだけん : だから、、");
		LoveGame.consoleStop(4000);
		System.out.println("付き合ってください");
		LoveGame.consoleStop();
		
		System.out.println();
		System.out.println("ちゃんちゃん");
	}
	
	
	static void syutaro(String nameString) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;
		
		
		System.out.println(nameString+":　あ！エプロン忘れた！");
		LoveGame.consoleStop();
		System.out.println("((家庭科室に取りにいかなくちゃ))");
		LoveGame.consoleStop();
		System.out.println("~家庭科室~");
		LoveGame.consoleStop(1000);
		System.out.println(nameString+"：　あれ？なにしているの？");
		LoveGame.consoleStop();
		System.out.println("しゅうたろ：　サッカーの練習着がほつれちゃったから、なおしてるんだよ。");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　そうなんだ！自分でできるのすごい");
		LoveGame.consoleStop();
		System.out.println("しゅうたろ：　づっきーのワイシャツの第一ボタンほつれてるよ");
		LoveGame.consoleStop();
		System.out.println(nameString+":　あ、ほんとだ、、、どうしよう");
		LoveGame.consoleStop();
		System.out.println("しゅうたろ:　俺がつけてあげようか？");
		LoveGame.consoleStop();
		
		
		while(true) {
			System.out.println("１：なおしてもらう　２：通報する");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println(nameString+"：　やだよ変態");
				LoveGame.consoleStop();
				System.out.println("しゅうたろ：　そんなこと言うなよ");
				LoveGame.consoleStop();
				System.out.println("しゅうたろ：　自分じゃ治せないだろ。");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
		}
		
		System.out.println(nameString+":　えー、お願いしようかな");
		LoveGame.consoleStop();
		System.out.println("しゅうたろ:　どうせ自分じゃ直せないじゃん（笑）来いよ。");
		LoveGame.consoleStop();
		System.out.println(nameString+":　そうだけど、、、");
		LoveGame.consoleStop();
		System.out.println("（しゅうたろはそう言ってづっきーの手を引っ張り、第一ボタンを直し始めた）)");
		LoveGame.consoleStop(3000);
		System.out.println(nameString+":　（・・・・めちゃ顔近い、、）");
		LoveGame.consoleStop();
		System.out.println("しゅうたろ:　できたよ、制服のリボンつけるから後ろ向いて");
		LoveGame.consoleStop();
		System.out.println(nameString+":　え、うん、");
		LoveGame.consoleStop();
		System.out.println("((後ろから抱きしめられる))");
		LoveGame.consoleStop(4000);
		System.out.println("しゅうたろ:　もう俺と付き合えば良いじゃん");
		LoveGame.consoleStop();
		
		System.out.println();
		System.out.println("ちゃんちゃん");

		
	}
		
	
}
