//1. String 型 の配列変数[studentName]を初期化して作成する。 
//➢ 要素数：5 
//➢ 値：「かなこ」「ゆうた」「あい」「はるひ」「かずき」を順番に代入する。 
//2. 拡張 for 文を使用し、配列の全要素の値を次のとおりコンソールに標準出力する。 
//拡張 for 文の代入先の変数名は問わない。 
//かなこ 
//ゆうた 
//あい 
//はるひ 
//かずき 

package basic.question06;

import java.io.IOException;

public class Question06_2 {

	public static void main(String[] args) throws IOException {

		String[] studentName = new String[5];

		studentName[0] = "かなこ";
		studentName[1] = "ゆうた";
		studentName[2] = "あい";
		studentName[3] = "はるひ";
		studentName[4] = "かずき";

		for (String name : studentName) {
			System.out.println(name);
		}

	}
}
