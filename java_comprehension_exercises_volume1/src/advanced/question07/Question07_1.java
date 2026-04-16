
//
//1. 5 つの商品名を入力し、String 型の配列[itemNames]に格納する。 
//2. 各商品に対応する単価を「1.」で入力した商品の順番で入力し、int 型の配列[prices]に格納する。 
//3. 入力後、次の通りコンソールに標準出力する。 
//登録商品一覧 
//[商品名]：[単価]円 
//[商品名]：[単価]円 
//[商品名]：[単価]円 
//… 
// コンソール入力例 
//商品 1 を入力してください: > ノート 
//商品 2 を入力してください: > ボールペン 
//商品 3 を入力してください: > 消しゴム 
//商品 4 を入力してください: > はさみ 
//商品 5 を入力してください: > のり 
//各商品の単価を順に入力してください: 
//ノートの単価: > 120 
//ボールペンの単価: > 80 
//消しゴムの単価: > 50 
//はさみの単価: > 250 
//のりの単価: > 100 
//
// 
//
// コンソール出力例 
//登録商品一覧 
//ノート：120 円 
//ボールペン：80 円 
//消しゴム：50 円 
//はさみ：250 円 
//のり：100 円 

package advanced.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question07_1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String[] itemName = new String[5];
		int[] prices = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.println("商品" + (i + 1) + "を入力してください。");
			itemName[i] = reader.readLine();
		}
		System.out.println("各商品の単価を順に入力してください:");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemName[i] + "の単価:");
			prices[i] = Integer.parseInt(reader.readLine());
		}

		System.out.println("登録商品一覧");

		for (int i = 0; i < 5; i++) {
			System.out.println(itemName[i] + "：" + prices[i] + "円");
		}

	}

}
