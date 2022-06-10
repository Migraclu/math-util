/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.huylt.mathutil.main;

import com.huylt.mathutil.core.MathUtil;

/**
 *
 * @author Thanh Huy
 */
public class Main {
    public static void main(String[] args) {

    // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế hay ko
    // ta phải đưa ra các tình huống sử dụng trong thực tế
    // -5 coi tính đc ko
    // 0 coi tính đc ko
    // 20 coi tính đc ko
    // 21 coi tính đc ko
    // Test case: một tình huống hàm /app/ màn hình/ tính năng đc đừa vào sử dụng
    // giả lập hành vi xài của ai đó
    
    //test case: là 1 tình huống sử dụng, xài app hay hàm mà nó bao gồm
    // data đầu vào cụ thể nào đó
    // output đầu ra ứng với xử lí của hàm/chức năng của app, dĩ nhiên dùng đàu vào đẻ xử lí
    // kì vọng: mong hàm sẽ trả về value nào đó ứng với input ở trên
    // so sánh để xem kết quả có như kì vọng hay ko
   
    
    long expected =120; // 5! expected value
    int n = 5; // input test case
    long actual = MathUtil.getFactorial(n);
        System.out.println("5! =  "+ expected + " ; acutal: " + actual);
    
    }
}
