package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */
//1. 「年齢を入力してください。」と コンソールに標準出力する。 
//年齢を入力してください。 
//2. 標準入力として値を入力し、int 型の変数[age]に代入する。 
//➢ 値：任意 
//➢ 入力値を数値に変換して代入する。 
//3. 条件分岐（if 文）を使用し、以下の条件に応じてコンソールに標準出力する。 
//➢ [age] が 20 未満の場合 
//20 歳未満なので、お酒の提供ができません。 
//➢ それ以外の場合 
//20 歳以上なので、お酒を提供することが可能です。 

public class Question05_1 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("年齢を入力してください。");

		String input = br.readLine();

		int age = Integer.parseInt(input);

		if (age < 20) {
			System.out.println("20歳未満なので、お酒の提供ができません。");
		} else {
			System.out.println("20 歳以上なので、お酒を提供することが可能です。");

		}

	}
}
