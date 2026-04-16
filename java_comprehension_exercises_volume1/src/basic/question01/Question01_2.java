package basic.question01;

/**
 * 第4章 変数
 */

public class Question01_2 {

	public static void main(String[] args) {

		// TODO:ここに実装
		//		問題 
		//		1. int 型の変数 [applePrice] を初期化して作成する 
		//		➢ 初期値： 100  
		int applePrice = 100;

		//		2. String 型の変数[ stationery] を初期化して作成する 
		//		➢ 初期値：鉛筆  
		String stationery = "鉛筆";

		//		3. int 型の変数[bananaPrice]を初期化して作成する 
		//		➢ 初期値：[applePrice] 
		int bananaPrice = applePrice;

		//		4. String 型の変数[writingUtensils]を初期化して作成する 
		//		➢ 初期値：[stationery] 
		String writingUtensils = stationery;

		//		5. [applePrice]、[bananaPrice]、[writingUtensils]の順番で値を次のとおりコンソールに出力する 
		//		りんごの値段は 100 円です。 
		//		バナナの値段は 100 円です。 
		//		この筆記用具は鉛筆です。 

		System.out.println("リンゴの値段は" + applePrice + "円です。");
		System.out.println("バナナの値段は" + bananaPrice + "円です。");
		System.out.println("この筆記用具は" + writingUtensils + "です。");
		//		   

	}

}
