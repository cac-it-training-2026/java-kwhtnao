// 問題 
//1. String 型の配列変数[messages]を初期化して作成する。 
//➢ 値：[こんにちは] [Java 学習中] [繰り返しの演習] [頑張ります]の 4 つの値を順番に代入 
//2. for 文を使用し、[messages]の要素の値を次の通りコンソールに標準出力する。 
//➢ 初期化の式：変数[i]で宣言、初期値：0 
//➢ 条件式：i が「4 未満」の間、繰り返す 
//➢ 加算式：インクリメント演算子を使用（i++） 
//こんにちは 
//Java の学習中 
//繰り返しの演習 
//頑張ります 
//3. 繰り返し終了後、次のとおりコンソールに標準出力する。 
//繰り返し処理が終了しました。 

package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		String[] messages = new String[4];

		messages[0] = "こんにちは";
		messages[1] = "Java学習中";
		messages[2] = "繰り返しの演習";
		messages[3] = "頑張ります";

		for (int i = 0; i < 4; i++) {
			System.out.println(messages[i]);

		}

		System.out.println("繰り返し処理が終了しました。");

	}
}
