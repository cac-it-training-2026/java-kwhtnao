package basic.question01;

/**
 * 第4章 変数
 */
//

public class Question01_1 {

	public static void main(String[] args) {

		//1. int 型の変数[price]を初期化して作成する。 
		//➢ 初期値：120 
		int price = 120;

		//2. String 型の変数[item]を初期化して作成する。 
		//➢ 初期値：ノート 
		String item = "ノート";
		//3. [price]、[item]の順番で値を次のとおりコンソールに出力する。 
		//120 
		//ノート 
		System.out.println(price);
		System.out.println(item);
		//4. [price]に値を代入する。 
		//➢ 値：200 
		price = 200;
		//5. [item]に値を代入する。 
		//➢ 値：鉛筆 
		item = "鉛筆";
		//6. [price]、[item]の順番で値を次のとおりコンソールに出力する。 
		//200 
		//鉛筆 
		System.out.println(price);
		System.out.println(item);

	}

}
