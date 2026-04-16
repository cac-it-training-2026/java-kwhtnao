//1. int 型の変数[amountBooks]を初期化して作成する。 
//➢ 初期値：0 
//➢ 本の冊数を意味する。 
//2. int 型の変数[sellFlag]を初期化して作成する。 
//➢ 初期値：0 
//➢ 本を売却するかどうかの判定を意味する 
//3. int 型の変数 [bookPrice]を初期化して作成する。 
//➢ 初期値：200 
//➢ 本の値段を意味する。 
//4. 「本を売却します。」とコンソールに標準出力する。 
//本を売却します。 
//5. do～while 文を使用し、[sellFlag] が 「0」 の場合、処理を繰り返す 
//➢ 繰り返し処理の内容 
//① [amountBooks]をインクリメントする。（+1） 
//② 次の通りコンソールに標準出力する。 
//売却する本の冊数を 1 つ増やしますか？ 
//はい：0、いいえ：1 > 
//③ 標準入力として値を入力し、[sellFlag]に代入する。 
//6. 繰り返し処理終了後、[amountBooks]の値を次の通りコンソールに標準出力する。 
//売却する本の冊数は [amountBooks の値] 冊です。 
//7. 次の通りコンソールに標準出力する。（売却の合計金額） 
//➢ [amountBooks]と[bookPrice]を乗算した値を出力する。 
//売却した本の合計金額は [amountBooks と bookPrice を乗算した値] 円です。 
//※変数に代入せず、計算は println()の 中で行って良い。 

package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_4 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amountBooks = 0;
		int sellFlag = 0;
		int bookPrice = 200;

		System.out.println("本を売却します。");

		do {
			amountBooks++;
			System.out.println("売却する本の冊数を 1 つ増やしますか？ ");
			System.out.println("はい：0、いいえ：1");

			sellFlag = Integer.parseInt(reader.readLine());

		} while (sellFlag == 0);

		System.out.println("売却する本の冊数は" + amountBooks + "冊です。");
		System.out.println("売却した本の合計金額は" + amountBooks * bookPrice + "円です");

	}

}
