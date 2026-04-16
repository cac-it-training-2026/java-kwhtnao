package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
 */
//1. 「商品の名前と値段を入力してください。」とコンソールに標準出力する 
// 商品の名前と値段を入力してください。 
// 2. 標準入力として値を入力し、String 型の変数[itemName]に代入する。 
// ➢ 入力値：ノートパソコン 
// 3. 標準入力として値を入力し、int 型の変数[itemPrice]に代入する。 
// ➢ 入力値：29800 
// ➢ 入力値を数値に変換し、[itemPrice]に代入する。 
// 4. [itemName]、[itemPrice]の順番で値を次のとおりコンソールに標準出力する。 
// 商品の名前はノートパソコンです。 
// 商品の値段は 29800 円です。 

public class Question02_2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("商品の名前と値段を入力してください。");
		String itemName = br.readLine();

		String priceStr = br.readLine();
		int itemPrice = Integer.parseInt(priceStr);

		System.out.println("商品の名前は" + itemName + "です。");
		System.out.println("商品の値段は" + itemPrice + "です。");

	}
}
