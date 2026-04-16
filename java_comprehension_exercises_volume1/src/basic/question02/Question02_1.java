package basic.question02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第5章 入出力
// */
// 1. 「名前を入力してください。」とコンソールに標準出力する。 
// 名前を入力してください。 
// 2. 標準入力として値を入力し、入力値を String 型の変数[name]に代入する。 
// ➢ 入力値：システム太郎 
// 3. 「好きなスポーツを入力してください。」とコンソールに標準出力する。 
// 好きなスポーツを入力してください。 
// 4. 標準入力として値を入力し、入力値を String 型の変数[sport]に代入する。 
// ➢ 入力値：サッカー 
// 5. [name]、[hobby]を次のとおりコンソールに標準出力する。 
// 私の名前はシステム太郎です。 
// 好きなスポーツはサッカーです。 

public class Question02_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("名前を入力してください。");
		String name = br.readLine();

		System.out.println("好きなスポーツを入力してください。");
		String sport = br.readLine();

		System.out.println("私の名前は" + name + "です。");
		System.out.println("好きなスポーツは" + sport + "です。");

	}
}
