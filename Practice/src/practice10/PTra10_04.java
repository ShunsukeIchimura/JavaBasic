package practice10;
/*
 * PTra10_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_04 {

	/*
	 * PTra10_01で作成したUserクラスを使用します
	 */

	public static void main(String[] args) {

		// ★ User型の変数が3つ入る配列usersを宣言・確保してください
			User[] users = new User[3];

		// ★ java.util.Scannerクラスをインスタンス化し、変数scannerに代入してください
			java.util.Scanner scanner = new java.util.Scanner(System.in);

		// ★ usersのサイズ分繰り返す制御構文を記述してください
		//----------- ループ start
			for(int i = 1; i < users.length; i++) {
				System.out.println(i + "人目の情報を入力します");		/* ##には、カウントを入れてください */
				System.out.println("ユーザID（数字）、 ユーザ名、メールアドレス、パスワードをカンマ区切りで入力してください");

			// ★ コマンドプロンプトに入力された値を、String型の変数lineに格納してください
				String line = scanner.nextLine();

			// ★ 変数lineに格納されている値を','で区切り、配列にしてください（Stringクラスのメソッドを使用します）
				String[] X = line.split(",");

			// ★ 配列にした値を、users[カウント]の各フィールドに代入してください
			// ★ ユーザIDに該当する値が数値でなかった場合は、エラーでプログラムが止まっても良いです
				int input = Integer.parseInt(X[0]);
				User us = new User();
				us.userId = input;
				us.userNm = X[1];
				us.mail = X[2];
				us.password = X[3];
			}
		//----------- ループ end

		// ★ usersに格納されている全てのインスタンスの、フィールドuserId, userNm, mail, passwordを出力してください
			System.out.println(users[0].userId);
			System.out.println(users[0].userNm);
			System.out.println(users[0].mail);
			System.out.println(users[0].password);

			System.out.println(users[1].userId);
			System.out.println(users[1].userNm);
			System.out.println(users[1].mail);
			System.out.println(users[1].password);

			System.out.println(users[2].userId);
			System.out.println(users[2].userNm);
			System.out.println(users[2].mail);
			System.out.println(users[2].password);
	}
}
