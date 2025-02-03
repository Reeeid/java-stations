package com.example.coupon;

public class CouponCalculator {
    public String findBestCoupon(int[] cartItems){
        // インスタンス作成
        CouponA couponA = new CouponA();
        CouponB couponB = new CouponB();
        CouponC couponC = new CouponC();
        // クーポンの計算
        float priceA = couponA.calculate(cartItems);
        float priceB = couponB.calculate(cartItems);
        float priceC = couponC.calculate(cartItems);
        //最適の計算
        String Best = "";
        float Minprice = Math.min(priceA, Math.min(priceB, priceC));
        if (Minprice == priceA) {
            Best = "A";
        }else if (Minprice == priceB) {
            Best = "B";
        }else if (Minprice == priceC) {
            Best = "C";
        }
        return Best;
    }
}
