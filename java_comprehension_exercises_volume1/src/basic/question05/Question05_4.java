package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
// */
//1. 「数学の試験結果の点数を入力してください。」とコンソールに標準出力する。 
//数学の試験結果の点数を入力してください。 
//2. 標準入力として値を入力し、int 型の変数[math]に代入する。 
//➢ 入力値を数値に変換して代入する。 
//3. 「国語の試験結果の点数を入力してください。」とコンソールに標準出力する。 
//国語の試験結果の点数を入力してください。 
//4. 条件分岐（if 文）を使用し、以下の条件に応じてコンソールに標準出力する。 
//➢ [math] が 60 以上、かつ [japanese] が 60 以上の場合 
//数学と国語ともに合格です。 
//➢ [math] が 60 以上、または[japanese] が 60 以上の場合 
//数学、国語どちらかが合格です。 
//➢ それ以外の場合 
//どちらの教科も不合格です。 

public class Question05_4 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("数学の試験結果の点数を入力してください。");

		int math = Integer.parseInt(br.readLine());

		System.out.println("国語の試験結果の点数を入力してください。");
		int japanese = Integer.parseInt(br.readLine());

		if (math >= 60 && japanese >= 60) {
			System.out.println("数学と国語ともに合格です。");
		} else if (math >= 60 || japanese >= 60) {
			System.out.println("数学、国語どちらかが合格です。");
		} else {
			System.out.println("どちらの教科も不合格です.");
		}

	}

}
