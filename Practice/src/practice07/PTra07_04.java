package practice07;
/*
 * PTra07_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra07_04 {
	public static void main(String[] args) {

		// ★ int型の配列trumpを宣言し、52個の領域を確保してください
		int[] trunp = new int[52];

		// ★ 配列trumpに、[1,2,3,4,5,・・・・,52] を代入してください
		trunp [0] = 1;
		trunp [1] = 2;
		trunp [2] = 3;
		trunp [3] = 4;
		trunp [4] = 5;
		trunp [5] = 6;
		trunp [6] = 7;
		trunp [7] = 8;
		trunp [8] = 9;
		trunp [9] = 10;
		trunp [10] = 11;
		trunp [11] = 12;
		trunp [12] = 13;
		trunp [13] = 14;
		trunp [14] = 15;
		trunp [15] = 16;
		trunp [16] = 17;
		trunp [17] = 18;
		trunp [18] = 19;
		trunp [19] = 20;
		trunp [20] = 21;
		trunp [21] = 22;
		trunp [22] = 23;
		trunp [23] = 24;
		trunp [24] = 25;
		trunp [25] = 26;
		trunp [26] = 27;
		trunp [27] = 28;
		trunp [28] = 29;
		trunp [29] = 30;
		trunp [30] = 31;
		trunp [31] = 32;
		trunp [32] = 33;
		trunp [33] = 34;
		trunp [34] = 35;
		trunp [35] = 36;
		trunp [36] = 37;
		trunp [37] = 38;
		trunp [38] = 39;
		trunp [39] = 40;
		trunp [40] = 41;
		trunp [41] = 42;
		trunp [42] = 43;
		trunp [43] = 44;
		trunp [44] = 45;
		trunp [45] = 46;
		trunp [46] = 47;
		trunp [47] = 48;
		trunp [48] = 49;
		trunp [49] = 50;
		trunp [50] = 51;
		trunp [51] = 52;

		// ★ 0～51の中からランダムで値を取得して、変数indexに代入してください
		int limitNumber = 51;
		int random = 0;
		random = new java.util.Random().nextInt(limitNumber);

		// ★ 配列trumpのindex番目の中に入っている数字を出力してください
			System.out.println(trunp[random]);
	}
}
