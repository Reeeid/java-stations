package com.example.coupon;


public class CouponB {
    public float calculate(int[] cartItems){
        float price = 0;
        for(int i=0; i < cartItems.length; ++i){
            price += cartItems[i]*0.9f;
        }
        if (price < 5000) {
            price += 800;
        }
        return price;
    }
}
