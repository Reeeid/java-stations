package com.example.coupon;

public class CouponC {
    public float calculate(int[] cartItems){
        float price = 0;
        for(int i=0; i < cartItems.length; ++i){
            if (cartItems[i]>=2000) {
                price += cartItems[i]*0.8f;
            }else{
            price += cartItems[i];
            }
        }
        if (price < 5000) {
            price += 800;
        }return price;
    }
}
