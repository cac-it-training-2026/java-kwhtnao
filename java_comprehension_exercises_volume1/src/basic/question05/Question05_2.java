package basic.question05;

import java.io.IOException;

/**
 * 第8章 条件分岐
 */
//1. int 型の配列変数[numberGroup]を初期化して作成する。 
//➢ 要素数：4 
//➢ 3,5,7,9 の数値を順番に代入 
//2. 条件分岐（if 文）を使用し、以下の条件に応じてコンソールに標準出力する。 
//➢ [numberGroup] の 4 番目の要素が「3」の場合 
//4 番目の要素の値は 3 です。 
//➢ [numberGroup] の 4 番目の要素が「5」の場合 
//4 番目の要素の値は 5 です。 
//➢ [numberGroup] の 4 番目の要素が「7」の場合 
//4 番目の要素の値は 7 です。 
//➢  [numberGroup] の 4 番目の要素がそれ以外の場合 
//4 番目の要素の値は 3、5、7 以外の値です。 
//   
public class Question05_2 {

	public static void main(String[] args) throws IOException {

		int[] numberGroup = new int[4];

		numberGroup[0] = 3;
		numberGroup[1] = 5;
		numberGroup[2] = 7;
		numberGroup[3] = 9;

		if (numberGroup[3] == 3) {
			System.out.println("4 番目の要素の値は 3 です。");
		} else if (numberGroup[3] == 5) {
			System.out.println("4番目の要素の値は5です。");
		} else if (numberGroup[3] == 7) {
			System.out.println("4 番目の要素の値は 7 です。 ");
		} else {
			System.out.println("4 番目の要素の値は 3、5、7 以外の値です。");
		}
	}
}
