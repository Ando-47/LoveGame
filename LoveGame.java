package afinalExcese;

import java.util.Scanner;

public class LoveGame {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		boolean awakeEiji = false;
		boolean awakeZono = false;
		boolean nameTF = true;
		boolean TF = true;
		int numberSelect;
		String nameString = "づっきー";
		String name;//空白なしの名前
		
		

		System.out.println("名前を日本語で入力してね。（最大５文字）");
		while(true) {			
			System.out.println("（Enterキーでデフォルト）");
			nameString = scanner.nextLine();
			if(nameString.equals("")) {
				nameString = "づっきー";
			}
			if(nameString.length() <= 5 ) {
				break;
			}
			System.out.println("５文字以内で入力してね。");
		}
		
		//名前をそろえる。
		name = nameString;
		nameString = nameAlign(nameString);


		//目覚ましは３回鳴る設定
		for(int i=0; i<3; i++) {
			System.out.println("リンリンリン（目覚まし時計の音）");
			consoleStop();
			System.out.println("1:起きる 2:二度寝する");

			int awake = scanner.nextInt();
			if(awake == 1) {
				if(i==0) {
					awakeEiji = true;
					awakeZono = true;
				}
				break;
			}
		}



		System.out.println("～～～～～～～");
		System.out.println("～～～～～～～");
		System.out.println("～～～～～～～");
		consoleStop();
		System.out.println("～～放課後～～");
		consoleStop();
		System.out.println(nameString+" : 放課後。。。部活まで暇だな。。");
		consoleStop();
		System.out.println(nameString+" : どこいこう");
		consoleStop();



		//質問ループ　最後まで
		while(TF) {
			System.out.println("１：体育館の裏　２：パソコン室　３：グラウンド 4:家庭科室 5:教室 6:花壇 7:屋上");
			numberSelect = scanner.nextInt();

			//目覚ましに一回で起きる　かつ　パソコン室にいくと　えーじ
			if(awakeEiji && numberSelect==2) {
				TF=false;
				EijiTaison.eiji(nameString,name);
				break;
			}
			//目覚ましに一回で起きる　かつ　屋上にいくと　ぞの
			if(awakeZono && numberSelect==7) {
				TF=false;
				ZonoMoffi.zono(nameString,name);
				break;
			}


			switch(numberSelect) {
			case 1:
				TF=false;
				EijiTaison.taison(nameString,name);
				break;

			case 2:
				System.out.println("（カギが開いてない。。違うところに行こう））");
				consoleStop();
				break;

			case 3:
				TF=false;
				WadakenSyutaro.wadaken(nameString);
				break;

			case 4:
				TF=false;
				WadakenSyutaro.syutaro(nameString);
				break;
				
			case 5:
				TF = false;
				JunJun.jun(nameString,name);
				break;
			
			case 6:
				TF = false;
				ZonoMoffi.moffi(nameString);
				break;
				
			case 7:
				TF = false;
				Teacher.teacher(nameString,name);
				break;

			default:
				System.out.println("数字の１から５の間で選んでね。");
				consoleStop();
				break;
			}
		}

	}

	
	//文字数の調整
	static String nameAlign(String nameString) {
		switch(nameString.length()) {
		case 1:
			nameString = nameString+"　　　　";
			break;

		case 2:
			nameString = nameString+"　　　";
			break;

		case 3:
			nameString = nameString+"　　";
			break;

		case 4:
			nameString = nameString+"　";
			break;

		default:
			break;
		}
		return nameString;
	}
	
	
	
	
	
	//一時停止するメソッド
	
	
	static void consoleStop() {
		try {
			Thread.sleep(2000); // 2秒(1000ミリ秒)間だけ処理を止める
		} catch (InterruptedException e) {
		}
	}
	
	static void consoleStop(int times) {
		try {
			Thread.sleep(times); 
		} catch (InterruptedException e) {
		}
	}





}
