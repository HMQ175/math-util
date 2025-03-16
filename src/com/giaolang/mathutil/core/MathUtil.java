package com.giaolang.mathutil.core;

public class MathUtil {
	// trong class này cung cấp nhiều hàm toán học của jdk 
	// clone class Math của jdk
	// hàm thư viện xài chung cho ai đó, không cần lưu lại trạng thái/giá trị
	// chọn thiết kế là hàm static

	// hàm tính giai thừa!!!
	// n! = 1.2.3.4.5...n
	// không có giai thừa cho số âm
	// 0! - 1! = 1 quy ước
	// giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
	// 20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của java
	// 21 giai thừa tràn kiểu long		
	
//	public static long getFactorial(int n) {
//		if (n < 0 || n > 20)
//			throw new IllegalArgumentException("Invallid argument. N must be between 0..20");
//		if (n == 0 || n == 1)
//			return 1; // kết thúc cuộc chơi sớm nếu nhận những đầu vào đặc biệt
//		long product = 1; // tích nhân dồn, thuật toán con heo đất, ốc bu nhồi thịt
//		for (int i = 2; i <= n; i++) 
//			product *= i;
//		return product;	
//	}
	
	// học về đệ quy trong vòng 30s - RECURSION
	// Hiện tượng gọi lại chính mình với 1 quy mô khác
	// Ví dụ: con búp bê nga, giống nhau và lồng trong nhau
	// búp bê to, nhỏ hơn, nhỏ hơn nữa, nhỏ hơn nữa... đến điểm dừng

	// tính giùm tôi 6!
	// n! = 1.2.3.4.5.6..... n
	// 6! = 6 x 5!
	// 5! = 5 x 4!
	// 4! = 4 x 3!
	// 3! = 3 x 2!
	// 2! = 2 x 1! // điểm dừng
	// 1! = 1

	// quy ước 1! = 0! = 1;

	// chốt hạ: n! = n * (n - 1)!
	public static long getFactorial(int n) {
	if (n < 0 || n > 20)
		throw new IllegalArgumentException("Invallid argument. N must be between 0..20");
	if (n == 0 || n == 1)
		return 1; 
	return n * getFactorial(n - 1); // công thức đệ quy 

	}
}
