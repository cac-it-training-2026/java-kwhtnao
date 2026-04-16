package basic.question03;

/**
 * 第6章 演算子
 */
//1. int 型 の変数[price] を初期化して作成する。 
//➢ 初期値：30 
//2. int 型 の変数[totalBudget]を初期化して作成する。  
//➢ 初期値：300 
//➢ 購入予算を意味する。 
//3. int 型の変数[quantity]を初期化して作成 する。 
//➢ 初期値：totalBudget を price で除算した値 
//➢ 購入個数を意味する。 
//4. [quantity]の値を次のとおりコンソールに標準出力する。 
//商品の購入数は[quantity の値]個です。 

public class Question03_1 {

	public static void main(String[] args) {

		int price = 30;
		int totalBudget = 300;

		int quantity = (totalBudget / price);

		System.out.println("商品の購入数は" + quantity + "個です。");

	}
}
