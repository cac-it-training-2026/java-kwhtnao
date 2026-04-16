package review;

/* プログラムの作り方
 * 
 *  1 データの準備
 *  2 入力
 *  3 処理（if,for）
 *  4 出力
 *  で組み立てると良いです。
 *  今回はFIzzBuzzという有名な処理で紹介します
 *  
 *  ルール
 *  1から順に数を数え上げていき、3の倍数なら「Fizz」、
 *  5の倍数なら「Buzz」、両方の倍数（15の倍数）なら「Fizz Buzz」、
 *  いずれでもなければその数を言う。
 *  
 *  */
public class FizzBuzz_q {

	/*
	 * 追加①
	 * 文字列配列を準備し、for文の中で文字列、および数値を文字列に変更したものを配列に格納する。
	 * 出力は配列に格納したものを取りだしつつ「,」で区切る
	 * 
	 * 1,2,Fizz,4,Buzz,..
	 * 
	 * hint
	 * String numString =String.valueOf(i);//int -> String
	 * 
	 * 追加②
	 * 3,5ではなく標準入力した値の倍数の時にFizz、Buzz、2つの最小公倍数ではFizzBuzzと出力する
	 * 
	 * 一つ目の倍数>>4
	 * 二つ目の倍数>>7
	 * 
	 * ..,3,Fizz,5,6,Buzz,..
	 * 
	 * */
	public static void main(String[] args) {

		//1 データの準備
		String fizzString = "Fizz";
		String buzzString = "Buzz";
		String fizzbuzzString = fizzString + buzzString;

		// 2 処理&出力
		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(fizzbuzzString);
			} else if (i % 3 == 0) {
				System.out.println(fizzString);

			} else if (i % 5 == 0) {
				System.out.println(buzzString);

			} else {
				System.out.println(i);

			}

		}

	}

}