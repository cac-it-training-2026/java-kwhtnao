
//
//1. int 型の変数 [amount]を初期化して作成する。 
//➢ 初期値：0 
//➢ 鉛筆の個数を意味する。 
//2. int 型の変数[price]を初期化して作成する。 
//➢ 初期値：100 
//➢ 鉛筆の値段を意味する。 
//3. 次の通りコンソールに標準出力する。 
//鉛筆を購入しますか? 
//はい：0、いいえ：1 > 
//4. 標準入力として値を入力し、int 型の変数[buyFlag] に代入する。 
//➢ 入力値：0 または 1 
//➢ 入力値を数値に変換する。 
//5. while 文を使用し、[buyFlag]の値が「0」の場合、処理を繰り返す 
//➢ 繰り返し処理の内容 
//① [amount]をインクリメントする。(+1) 
//② 次の通りコンソールに標準出力する。 
//購入する鉛筆の本数を 1 つ増やしますか？ 
//はい：0、いいえ：1 > 
//③ 標準入力として値を入力し、[buyFlag]に代入する。 
//6. 繰り返し処理終了後、次の通りコンソールに標準出力する。 
//購入した鉛筆の本数は[amount の値]本です。 
//
// 
//
//7. 次の通りコンソールに標準出力する。（購入の合計金額） 
//➢ [amount]と[price]を乗算した値を出力する。 
//購入した鉛筆の合計金額は [amount と price を乗算した値] 円です。 
//※変数に代入せず、計算は println()の 中で行って良い package basic.question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int amount = 0;
		int price = 100;

		System.out.println("鉛筆を購入しますか?");
		System.out.println("はい：0、いいえ：1 > ");

		int buyFlag = Integer.parseInt(reader.readLine());

		while (buyFlag == 0) {
			amount++;
			System.out.println("購入する鉛筆の本数を 1 つ増やしますか？ ");
			System.out.println("はい：0、いいえ：1 >");

			buyFlag = Integer.parseInt(reader.readLine());

		}

		System.out.println("購入した鉛筆の本数は" + amount + "本です。");
		System.out.println("購入した鉛筆の合計金額は" + (amount * price) + "円です。");

	}

}
