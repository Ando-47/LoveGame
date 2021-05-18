package afinalExcese;

import java.util.Scanner;

public class Teacher {
	public static void teacher(String nameString,String name) {
	Scanner scanner = new Scanner(System.in);
	int select;
	boolean TF = true;

	System.out.println("(空を眺めている奥村くん))");
	LoveGame.consoleStop();
	System.out.println(nameString+"： あ！奥村くん！");
	LoveGame.consoleStop();
	System.out.println("奥村くん　：　あ、びっくりした～");
	LoveGame.consoleStop();
	System.out.println(nameString+"：　どうしたの？");
	LoveGame.consoleStop();
	System.out.println("奥村くん　：　いやなんでもないんだ。");
	LoveGame.consoleStop();
	System.out.println("もう一回聞く？？");
	

	while(TF) {
		System.out.println("１：聞く　２：聞かない");
		select = scanner.nextInt();
		if(select == 1) {
			break;
		}else if(select == 2) {
			System.out.println("（（数年後・・））");
			LoveGame.consoleStop();
			System.out.println("（～新宿～）");
			LoveGame.consoleStop();
			System.out.println("知らない女の人と、腕を組んで楽しそうに歩いている奥村君とばったり会ってしまった。。。");
			LoveGame.consoleStop(3000);
			System.out.println("私があの時、奥村君を引き留めていればよかったのかな・・");
			LoveGame.consoleStop(3000);
			System.out.println("過去に戻る。");	
		}else {
			System.out.println("数字の１・２から選んでね。");
			LoveGame.consoleStop();
		}
	}
	
	System.out.println(nameString+"：　なにか悩みがあるなら聞くよ");
	LoveGame.consoleStop();
	System.out.println("奥村くん　：　づっきーは大学どうするんだよ。");
	LoveGame.consoleStop();
	System.out.println("奥村くん　：　俺さ東京の大学に行こうと思ってるんだよ・・・");
	LoveGame.consoleStop();
	System.out.println(nameString+"：　そ、そうなんだ・・・");
	LoveGame.consoleStop(6000);
	System.out.println("奥村くん　：　"+name+"も、東京の大学に行こうよ");
	LoveGame.consoleStop();
	System.out.println(nameString+"：　え？");
	LoveGame.consoleStop(3000);
	System.out.println("奥村くん　：　毎日一緒に学校に行ってさ、");
	LoveGame.consoleStop(3000);
	System.out.println("奥村くん　:　そのあともずっと一緒にいれたら楽しいよね。");
	LoveGame.consoleStop();
	
	System.out.println();
	System.out.println("ちゃんちゃん");
}
}
