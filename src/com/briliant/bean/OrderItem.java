package com.briliant.bean;

import java.io.Serializable;

public class OrderItem implements Serializable {
    public OrderItem() {
    }

    public OrderItem(int itemId, Clothes clothes, int shoppingNum, float sum) {
        this.itemId = itemId;
        this.clothes = clothes;
        this.shoppingNum = shoppingNum;
        this.sum = sum;
    }

    private int itemId; //订单id
    private Clothes clothes;    //订单衣服
    private int shoppingNum;//订单数量
    private float sum;//总金额

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public int getShoppingNum() {
        return shoppingNum;
    }

    public void setShoppingNum(int shoppingNum) {
        this.shoppingNum = shoppingNum;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }
}
