package com.example.coupon;

public class CouponA {

    public float calculate(int[] cartItems){
        float price = 0;
        for(int i=0; i < cartItems.length; ++i){
            price += cartItems[i];
        }return price;
    }
}
