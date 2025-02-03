package com.example.station9;

public class Main {
    public static void main(String[] args) {
        int[] itemPrices1 = {1000, 1100, 1200, 1300};
        int[] itemPrices2 = {1000, 1100, 1200, 1300, 1600, 1800};
        int[] itemPrices3 = {1000, 2100, 3200, 2300};
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円。期待されるクーポン: A。結果: ");
        test(itemPrices1);
        System.out.print("カート内: 1000円, 1100円, 1200円, 1300円, 1600円, 1800円。期待されるクーポン: B。結果: ");
        test(itemPrices2);
        System.out.print("カート内: 1000円, 2100円, 3200円, 2300円。期待されるクーポン: C。結果: ");
        test(itemPrices3);
    }

    public static void test(int[] itemPrices) {
        // ここから
        double priceA = 0;
        double priceB = 0;
        double priceC = 0;

        for(int i = 0;i < itemPrices.length;++i){
        priceA += itemPrices[i];
        priceB += itemPrices[i]*0.9;  
        }

        if (priceB <= 5000) {
            priceB += 800;
        }

        for(int i = 0;i < itemPrices.length;++i){
            if (itemPrices[i] >= 2000) {
            priceC += itemPrices[i]*0.8;
            }else{
            priceC += itemPrices[i];
            }
            }
            
        if (priceC <= 5000) {
            priceC += 800;
        }

        double minPrice = Math.min(priceA, Math.min(priceB,priceC));
        if (minPrice == priceA) {
        System.out.println("A");
        }else if (minPrice == priceB) {
        System.out.println("B");    
        }else if (minPrice == priceC) {
        System.out.println("C");      
        }
        // ここまで
    }
}
