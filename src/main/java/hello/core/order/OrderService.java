package hello.core.order;

public interface OrderService {
//파일명과 인터페이스명이 맞아야 한다
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
