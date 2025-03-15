package com.giaolang.mathutil.main;

import com.giaolang.mathutil.core.MathUtil;

public class Main {
	public static void main(String[] args) {
		// thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay không
		// ta phải đưa ra các tình huống sử dụng hàm trong thực tế
		// ví dụ -5 coi tính được không
		// 		0 coi tính mấy
		//		20 coi tính mấy
		// 		21 coi tính ra mấy!!!
		// TEST CASE: Một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
		// giả lập hành vi xài của ai đó !!!

		// TEST CASE: LÀ MỘT TÌNH HUỐNG SỬ DỤNG, XÀI APP (HÀM) MÀ NÓ BAO HÀM
		// DATA ĐẦU VÀO CỤ THỂ NÀO ĐÓ
		// OUTPUT ĐẦU RA ỨNG VỚI XỬ LÍ CỦA HÀM/CHỨC NĂNG CỦA APP, DĨ NHIÊN 
		// DÙNG ĐẦU VÀO ĐỂ XỬ LÝ
		// KÌ VỌNG: MONG HÀM SẼ TRẢ VỀ VALUE NÀO ĐÓ ỨNG VỚI INPUT Ở TRÊN
		// SO SÁNH ĐỂ XEM KẾT QUẢ CÓ NHƯ KÌ VỌNG HAY KHÔNG
		long expected = 120; // tao kì vọng hàm ói về 120 nếu tính 5!
		int n = 5;			// input
		long actual = MathUtil.getFactorial(n);
		System.out.println("5! = " + expected + " expected");
		System.out.println("5! = " + actual + " actual");
	}
}
