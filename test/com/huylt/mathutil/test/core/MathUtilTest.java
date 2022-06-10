/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huylt.mathutil.test.core;

import com.huylt.mathutil.core.MathUtil;
//import junit.framework.Assert;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author Thanh Huy
 */
public class MathUtilTest {
    
    //đây là class sẽ sd các hàm của thư viện/ framework JUnit 
    // để kthu/ ktra code chihnsh - hàm tínhgiai thừa() bên class core.MathUtil
    // viết code để tét code chính bên kia 
    
    
    // có nhiều quy tắc đặt tên hàm kiểm thử
    // nhưng thường sẽ là nói lên mục đích của các case/ tình huống kiểm thử 
    // tình huóng xài hàm theo kiểu thành công và thất bại
    
    //hàm dưới đây là tình huống tẽt hàm chạy thành công, trả về ngon
    //ta sẽ xài hàm kiểu well - 
    
    //@Test JUnit sẽ phối hợp với JVM để chạy hàm này
    //@Test phía hậu trường chính là public static void main()
    // có nhiều @Test để kthu hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n =1; // test thử tình huông tử tế vào
        long expected = 1; // hy vọng 0! =1
        long actual = MathUtil.getFactorial(n); // gọi hàm cần test bên core/app chính
        
        //so sánh expected vs actual dùng framework
        
        Assert.assertEquals(expected, actual);
        
        //gộp thêm vài cáe thành công/ đưa đầu vào ngon 
         Assert.assertEquals(1, MathUtil.getFactorial(1));
         Assert.assertEquals(2, MathUtil.getFactorial(2));
         Assert.assertEquals(6, MathUtil.getFactorial(3));
         Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        //hàm giúp so sánh 2 g trị nào đó có gióng nhau hay ko
        // nếu giống nhau -> thảy màu xanh -code ngon
        // nếu ko giống nhau -> màu đỏ 
    }
    
    
    // hàm getF() ta thiết kế có 2 tình huống xử lí 
    //1. đưa data tử tế trong [0..20] -> tính đúng dc n! - done
    // 2. đưa data vào âm, > 20 ; Thiết kế của hàm là ném ra ngoại lệ
    // kì vọng ngoại lệ xh khi n < 0 || n > 20
    // rất mong ngoại lệ xuất hiện với n cà chớn này
    
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ném ra ngoại lệ
    // hàm chạy đúng như thiết kế -> xanh phải xuất hiện
   
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm ko ném ra ngoại lệ
    // sure, hàm chạy sai thiết kế, sai kì vọng, màu đỏ
    
    
    //Test case:
    // input: -5
    // expected: illegalArgumentException x hiện
    
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu 
    // là những thứ ko thể đo lường so sánh theo kiểu value
    // mà chỉ có thể đo lường = cách chúng có xuấy hiện hay không
    // asertEquals() ko dùng để so sánh 2 ngoại lệ
    // equals() là bằng nhau hay ko trên value|||
    
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongtArgumentThrowsException(){
        MathUtil.getFactorial(-5); // hàm @Test chạy, hay hàm getF() chạy, sẽ ném về ngoại lệ IllegalArgumentException....
        
    }
    
    
    // cách khác để bắt ngoại lệ xuất hiện, viết tự nhiên hơn
    // xài Lambda
    
    //Test case: hàm sẽ ném về ngoại lệ nếu vào 21
   // t cần thấy màu xanh khi chơi với 21!
    
    
    //bắt ngoại lệ, xem hàm có ném về ngoại lệ hay ko khi n cà chớn
    // có ném, tức là hàm chạy dúng thiết kế ->
    @Test
    public void testGetFactorialGivenWrongtArgumentThrowsException_TryCatch(){
//        Assert.assertThrows(tham so 1: loại ngoại lệ mún so sánh,
//                            tham số 2: đoạn code chạy văng ra ngoại lệ runnable);

    // chủ động kiểm soát ngoại lệ!!
        try {
            MathUtil.getFactorial(-5); 
            
        } catch (Exception e) {
            // bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            // nhưng ko chắc ngoại lẹ càn có xuất hiện hay ko
            // có đoạn code kiểm soát đúng ngoại lệ IllegalArgurmentException xh
            Assert.assertEquals("Invalid argument. N must be between 0 to 20", e.getMessage());
        }

        
    }
}
