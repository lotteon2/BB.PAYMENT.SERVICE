package kr.bb.payment.entity;

import lombok.Getter;

@Getter
public enum OrderType {
  ORDER_DELIVERY("주문 배송"),
  ORDER_PICKUP("주문 픽업"),
  ORDER_SUBSCRIPTION("주문 구독");

  private final String message;

  OrderType(String message) {
    this.message = message;
  }
}
