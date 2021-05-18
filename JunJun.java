package afinalExcese;

import java.util.Scanner;

public class JunJun {

	
	public static void jun(String nameString,String name) {
		Scanner scanner = new Scanner(System.in);
		int select;
		boolean TF = true;
		
		System.out.println(nameString+"：　よっ");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　うおっびっくりした。先生かと思ったじゃんか！");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　なにしてんのー？");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　FIFAやってんねん");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　本当すきだよね。そーゆーの");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　いや面白いんだって、お前もやってみろよ");
		LoveGame.consoleStop();
		System.out.println("（じゅんぺいは近づいてきて、PSPを渡してくる））");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　このボタンがパスで、、このボタンがシュートで、、、、");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　づっきーなんて余裕やん。ボコボコにしてやる（笑）、");
		LoveGame.consoleStop();
		System.out.println("（ゲーム中））");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　まけたーこのやろー");
		LoveGame.consoleStop();
		System.out.println("(("+name+"がじゅんやの肩を押す))");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　次は俺と勝負だ！");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　いやいやいや、俺へのリベンジ果たしてへんもんな。");
		LoveGame.consoleStop();
		System.out.println("どっちと勝負しよう。。。");
		LoveGame.consoleStop();
		
		while(true) {
			System.out.println("１：じゅんぺい　２：じゅんや 3:どっちも");
			select = scanner.nextInt();
			if(select == 1) {
				junpe(nameString);
				break;
			}else if(select == 2) {
				junya(nameString,name);
				break;
			}else if(select == 3){
				flower(nameString);
				//break;
			}else {
				System.out.println("数字の１・２・３から選んでね。");
				LoveGame.consoleStop();
			}
		}	
		
	}
	
	static void junpe(String nameString){
		System.out.println("じゅんや　：　やべ、もう塾いかんとあかんわ。");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　ほなまた明日な。");
		LoveGame.consoleStop();
		System.out.println("一同　　　：　ばいばい！");
		LoveGame.consoleStop(4000);
		System.out.println("じゅんぺい：　やっぱづっきーと遊ぶのたのしいな。");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　もっと、ほかのゲームあるから、俺んちこいよ");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　いやでも彼女じゃないし、、一人でお邪魔するのもな。。");
		LoveGame.consoleStop(1000);
		System.out.println("じゅんぺい：　うるせーいこー！！！！！");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　今日から俺の彼女だ！");
		LoveGame.consoleStop();
		
		System.out.println("");
		System.out.println("ちゃんちゃん");
	}
	
	static void junya(String nameString,String name) {
		System.out.println("じゅんや　：　やっぱ俺とだよな。.");
		LoveGame.consoleStop(3000);
		System.out.println("じゅんぺい：　やべ、塾の時間だ！");
		LoveGame.consoleStop();
		System.out.println("じゅんぺい：　明日～！");
		LoveGame.consoleStop();
		System.out.println("一同　　　：　ばいばい！");
		LoveGame.consoleStop(4000);
		System.out.println(nameString+"：　じゅんや、ゲームする前にもう一回やり方教えて！");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　こうやるんだぜ。");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　。。。説明めんどくさいわ、ちょっとこっち来て！");
		LoveGame.consoleStop(3000);
		System.out.println("じゅんや　：　おまえ意外と手がちっちゃいな");
		LoveGame.consoleStop();
		System.out.println("(("+name+" ：　//))");
		LoveGame.consoleStop();
		System.out.println(nameString+"：　そんなことないよ！！手合わせてみよ！");
		LoveGame.consoleStop();
		System.out.println("（ぎゅっ））");
		LoveGame.consoleStop();
		System.out.println("じゅんや　：　なあ");
		LoveGame.consoleStop();
		System.out.print("じゅんや　：　おれと、");
		LoveGame.consoleStop(3000);
		System.out.println("付き合ってくれへん");
		LoveGame.consoleStop();
		
		System.out.println("");
		System.out.println("ちゃんちゃん");
	}

	static void flower(String nameString) {
System.out.println("作成中・・・");
	}

}
