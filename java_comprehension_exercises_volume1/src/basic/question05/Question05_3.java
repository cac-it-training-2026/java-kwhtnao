package basic.question05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第8章 条件分岐
 */
//1. 「曜日を日本語で入力してください。」とコンソールに標準出力する。 
// 曜日を日本語で入力してください。 
// 2. 標準入力として値を入力し、String 型の変数[userDayInput]に代入する。 
// ➢ 入力値：任意 
// 3. 条件分岐（switch 文）を使用し、以下の条件に応じて値をコンソールに標準出力する。 
// ※以下の入力に応じて英語表記を標準出力すること 
// ➢ [userDayInput] の 値が「月曜日」の場合 
// Monday 
// ➢ [userDayInput] の 値が「火曜日」の場合 
// Tuesday 
// ➢ [userDayInput] の 値が「水曜日」の場合 
// Wednesday 
// ➢ [userDayInput] の 値が「木曜日」の場合 
// Thursday 
// ➢ [userDayInput] の 値が「金曜日」の場合 
// Friday 
// ➢ [userDayInput] の 値が「土曜日」の場合 
// Saturday 
// ➢ [userDayInput] の 値が「日曜日」の場合 
// Sunday 

public class Question05_3 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("曜日を日本語で入力してください。");

		String userDayInput = br.readLine();

		switch (userDayInput) {

		case "月曜日":
			System.out.println("Monday");
			break;

		case "火曜日":
			System.out.println("Tuesday");
			break;

		case "水曜日":
			System.out.println("Wednesday");
			break;

		case "木曜日":
			System.out.println("Thursday");
			break;

		case "金曜日":
			System.out.println("Friday");
			break;

		case "土曜日":
			System.out.println("Saturday");
			break;

		case "日曜日":
			System.out.println("Sunday");
			break;
		}

	}
}
