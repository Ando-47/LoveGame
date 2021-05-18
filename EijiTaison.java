package afinalExcese;

import java.util.Scanner;

public class EijiTaison {
	static void eiji(String nameString,String name) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;

		System.out.println("えーじ　　：　あれどうしたの。。？");
		LoveGame.consoleStop();
		System.out.println(nameString+"： 部活まで暇だから。。課題やろうと思って");
		LoveGame.consoleStop();
		System.out.println("えーじ　　：　そうなんだ。えらいね。いっしょにやる？");
		LoveGame.consoleStop();
		System.out.println("えーじ　　：　教えてあげるよ");
		LoveGame.consoleStop();

		while(true) {
			System.out.println("１：一緒にやる　２：やらない");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println(nameString+"：　うーーん今回はやめておくよ～");
				LoveGame.consoleStop();
				System.out.println("えーじ　　：　え～～～～一緒にやろうよ～");
				LoveGame.consoleStop();
				System.out.println("えーじ　　：　どうせ、いつかはやらなきゃいけないんだから！ね！");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
		}

		//一緒に課題をやる
		System.out.println(nameString+"： えーじ、ここわからないんだけど、教えて？");
		LoveGame.consoleStop();
		System.out.println("えーじ　　：　そんなこともわかんないのか。俺がいないとだめだな");
		LoveGame.consoleStop();
		System.out.println(nameString+"： そ、そんなことないもんっ");
		LoveGame.consoleStop();
		System.out.println("えーじ　　：　そうか？俺は一緒にやれてたのしいよ");
		LoveGame.consoleStop();
		System.out.println("(（えーじが"+name+"の頭をポンポン））");
		LoveGame.consoleStop();
		System.out.println(nameString+"： //");
		LoveGame.consoleStop();
		System.out.println(nameString+"： じゃじゃあそろそろ部活だから//");
		LoveGame.consoleStop();
		//もっといっしょにいない？で時間を空ける
		System.out.print("えーじ　　：　そっかーさみしいな。もっと一緒にいない？");
		LoveGame.consoleStop();
		System.out.println("”彼女として”。");
		LoveGame.consoleStop();

		System.out.println();
		System.out.println("ちゃんちゃん");


	}

	//怖いキャラ。サイコパス
	static void taison(String nameString,String name) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;

		//バスケ勝負、負けたら片づけ
		System.out.println("((バスケをしているタイソン))");
		LoveGame.consoleStop();
		System.out.println(nameString+"： あいかわらず下手だね～");
		LoveGame.consoleStop();
		System.out.println("タイソン　：　うっせーなー。じゃあ勝負してみるか？");
		LoveGame.consoleStop();

		while(TF) {
			System.out.println("１：勝負する　２：しない");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println(nameString+"： うーーん今は気分じゃないな～");
				LoveGame.consoleStop();
				System.out.println("タイソン　：　そーいって俺に負けるのが怖いんだろ（笑）");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
		}

		//体育館の倉庫の中でカギ閉めて告白
		System.out.println(nameString+"： よっしゃやってやる！！");
		LoveGame.consoleStop();
		System.out.println("タイソン　：　1on1、負けたほうが片付けな！");
		LoveGame.consoleStop();
		System.out.println(nameString+"： のぞむところだ！");
		LoveGame.consoleStop();
		System.out.println("（ダムダムダム）バスケ勝負中・・・））");
		LoveGame.consoleStop();
		System.out.println(nameString+"： まけたーーー");
		LoveGame.consoleStop();
		System.out.println("タイソン　：　よっしゃ！");
		LoveGame.consoleStop();
		System.out.println("タイソン　：　じゃあかたずけ頼んだ！");
		LoveGame.consoleStop();
		System.out.println("(("+name+"、倉庫にボールを片付け中。。。))");
		LoveGame.consoleStop();
		System.out.println("（（タイソン：倉庫のカギをしめる）)");
		LoveGame.consoleStop(3000);//ここ時間を長くする。一文字筒表示する。
		System.out.print("タイソン　：　。。実は、");
		LoveGame.consoleStop(4000);
		System.out.println("ずっとまえから好きでした。");
		LoveGame.consoleStop();

		System.out.println();
		System.out.println("ちゃんちゃん");
	}

}
