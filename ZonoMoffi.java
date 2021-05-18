package afinalExcese;

import java.util.Scanner;

public class ZonoMoffi {

	static void moffi(String nameString){
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;

		System.out.println("もっふぃ　：　こんなところにいるなんて珍しいじゃん。");
		LoveGame.consoleStop();
		System.out.println(nameString+"： 部活まで暇だったからさ、来てみた（笑）");
		LoveGame.consoleStop();
		System.out.println("もっふぃ　：　暇なら、お花に水あげるの手伝ってよ");
		LoveGame.consoleStop();
		

		while(TF) {
			System.out.println("１：手伝う　２：手伝わない");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println(nameString+"：　え～～～めんどくさいじゃん");
				LoveGame.consoleStop();
				System.out.println("もっふぃ　：　そっか～でもさ、この花壇１kmもあって、大変なんだよ～");
				LoveGame.consoleStop();
				System.out.println("もっふぃ　：　暇でしょ！手伝ってよー！");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
		}
		
		System.out.println("((花壇に水あげ中。。))");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　あともう少しで終わりそうだね");
		LoveGame.consoleStop();
		System.out.println("もっふぃ　：　なんか終わっちゃうの寂しいな。。");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　え？それってどういうこと？");
		LoveGame.consoleStop();
		System.out.println("もっふぃ　：　それは、、、");
		LoveGame.consoleStop(4000);
		System.out.println("もっふぃ　:　お前とずっと一緒にいたいってことだよ！");
		LoveGame.consoleStop();
		
		System.out.println();
		System.out.println("ちゃんちゃん");

	}
	
	
	public static void zono(String nameString,String name) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;

		System.out.println("（ぞのが眼鏡が少しずれた状態で寝ている。。））");
		LoveGame.consoleStop();
		System.out.println(nameString+"（（眼鏡とっちゃえ））");
		LoveGame.consoleStop();
		System.out.println(nameString+"（（あれかっこいい。。//））");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　うーーーん、あれ眼鏡どこだ。。？");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　なにとってんねん（笑）");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　返せよ～！");
		LoveGame.consoleStop();
		
		

		while(TF) {
			System.out.println("１：返す　２：逃げる");
			select = scanner.nextInt();
			if(select == 1) {
				break;
			}else if(select == 2) {
				System.out.println("（ぞのが追いかけてこない。。）");
				LoveGame.consoleStop();
			}else {
				System.out.println("数字の１・２から選んでね。");
				LoveGame.consoleStop();
			}
		}
		
		System.out.println(nameString+"：　ごめんって");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　ありがと。");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　眼鏡とった姿ってあんまり、彼女以外に見せたくないんだよね");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　あ、それはごめん。。");
		LoveGame.consoleStop();
		System.out.println("ぞの　　　：　いや、");
		LoveGame.consoleStop(3000);
		System.out.println("ぞの　　　：　"+name+"だけには見せたいと思ってたよ。");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　え。それって。。。");
		LoveGame.consoleStop(5000);
		System.out.println("ぞの　　　：　好きだよ");
		LoveGame.consoleStop();
		
		System.out.println("");
		System.out.println("ちゃんちゃん");
		
	}
}
