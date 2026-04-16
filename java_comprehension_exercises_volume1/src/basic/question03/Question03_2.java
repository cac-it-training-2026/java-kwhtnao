package basic.question03;

/**
 * 第6章 演算子
 */
//1. int 型 の変数[basePrice] を初期化して作成する。 
//➢ 初期値：1200 
//➢ 通常料金を意味する。 
//2. int 型の変数[tickets]を初期化して作成する。 
//➢ 初期値：3 
//➢ チケットの購入枚数を意味する。 
//3. int 型の変数[reducedPrice]を初期化して作成する。 
//➢ 初期値：[basePrice]の値から 200 を引いた値 
//➢ 最終的な価格を意味する。 
//4. int 型の変数「reducedTickets」を初期化して作成する。 
//➢ 初期値：[tickets]をデクリメント（-1）した値 
//5. int 型の変数[totalPrice]を初期化して作成する。 
//➢ 初期値：[reducedPrice]と[reducedTickets]を乗算した値 
//6. double 型の変数[taxRate]を初期化して作成する。 
//➢ 初期値：1.1 
//➢ 税率を意味する。 
//7. int 型 の変数[totalWithTax]を初期化して作成する。 
//➢ 初期値：[totalPrice]と[taxRate]を乗算し、計算結果を int 型にキャストした値 
//8. [reducedTickets]、[reducedPrice]、[totalPrice]、[totalWithTax]の順番で、次のとおり値をコンソールに標準出力す
//る。 
//購入可能枚数は[reducedTickets の値]枚です。 
//値下げ後の 1 枚あたりの料金は[reducedPrice の値]円です。 
//合計金額（税抜）は[totalPrice の値]です。 
//合計金額（税込）は[totalWithTax]です。 

public class Question03_2 {

	public static void main(String[] args) {

		int basePrice = 1200;
		int tickets = 3;

		int reducedPrice = basePrice - 200;
		int reducedTickets = tickets - 1;

		int totalPrice = reducedPrice * reducedTickets;

		double taxRate = 1.1;

		int totalwithTax = (int) (totalPrice * taxRate);

		System.out.println("購入可能枚数は" + reducedTickets + "です。");
		System.out.println("値下げ後の1枚あたりの料金は" + reducedPrice + "です。");
		System.out.println("合計金額（税抜）" + totalPrice + "です。");
		System.out.println("合計金額（税込）" + totalwithTax + "です。");

	}
}
