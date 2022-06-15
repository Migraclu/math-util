/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huylt.mathutil.core;

/**
 *
 * @author Thanh Huy
 */
public class MathUtil {
    // trong clas này cung cấp cho ai đó nhiều hàm xử lí toán học
   // clone class Math của JDK
    // hàm thư viện xài chung cho ai đó, ko cần lưu lại trạng thái> giá trị
    // chọn thiết kế là hàm static
    
    //hàm tính giai thừa!!
    // n! = 1*2*3*..n
    // ko có giai thừa cho số âm
    // 0!= 1 = 1 quy ước
    // giai thừa hàm đồ thị dốc đứng, tăng nhanh về giá trị
    // 20 giai thừa 18 con số 0, vừa kịp đủ cho kiểu long của Java
    // 21 giai thừa tràn kiểu long
    // bài này quy ước tính n! trong khoảng từ 0..20
    
//    public static long getFactorial(int n){
//        if (n <0 || n>20)
//            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
//        
//        if (n== 0 || n == 1){
//            return 1; // kết thúc cuộc chơi sớm nếu nhận nhngwx đầu vào đặc biệt
//            
//        }
//        
//        long product = 1; // tích nhân dồn,
//        for (int i = 1; i <= n; i++) {
//            product *=i;
//        }
//        return product;
//    }
//    
    
    // Học đệ quy trong vòng 30x -RECURSION
    // hiện tượng gọi lại chính mình với 1 quy mô khác
    // ví dụ: con búp bê Nga, giống nhau và lồng trong nhau
    // búp bê to, nhỏ hơn, nhỏ hơn mữa,.. đến điểm dừng
    
    // tính dùm tui 6!
    //n! = 1.2.3.4.5.6.....n
    // 6! =6*5!
    
    public static long getFactorial (int n){
        if (n <0 || n>20)
            throw new IllegalArgumentException("Invalid argument. N must be between 0 to 20");
        
        if (n== 0 || n == 1){
            return 1; // kết thúc cuộc chơi sớm nếu nhận nhngwx đầu vào đặc biệt
        }
        
        return n*getFactorial(n-1);
    }
}
