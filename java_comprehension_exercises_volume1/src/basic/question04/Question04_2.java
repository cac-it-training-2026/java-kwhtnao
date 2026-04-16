package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */
//1. int 型の配列変数[ageGroup]を初期化して作成する。 
//➢ 要素数：6 
//➢ 初期値：[23,33,26,21,25,22]の順番で定義 
//2. 「4 番目の人の年齢を入力してください。」とコンソールに標準出力する。 
//4 番目の人の年齢を入力してください。 
//3. 標準入力として値を入力し、int 型の変数[temporaryAge]に代入する。 
//➢ 入力値：39 
//➢ 入力値を数値に変換して代入する。 
//4. [ageGroup]の「4 番目の要素」に[temporaryAge]の値を代入する。 
//5. [ageGroup]の 4 番目の要素の値を以下のとおりコンソールに標準出力する。 
//4 番目の人の年齢は[ageGroup の 4 番目の要素の値]歳です。 
//6. [ageGroup]の配列の長さ（要素数）を以下のとおりコンソールに標準出力する。 
//人数は[ageGroup の要素数]人です。 

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		int[] ageGroup = new int[6];

		ageGroup[0] = 23;
		ageGroup[1] = 33;
		ageGroup[2] = 26;
		ageGroup[3] = 21;
		ageGroup[4] = 23;
		ageGroup[5] = 22;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("4番目の人の年齢を入力してください。");

		String temp = br.readLine();
		int temporaryAge = Integer.parseInt(temp);

		ageGroup[3] = temporaryAge;

		System.out.println("4番目の人の年齢は" + ageGroup[3] + "歳です。");
		System.out.println("人数は" + ageGroup.length + "です。");

	}

}
