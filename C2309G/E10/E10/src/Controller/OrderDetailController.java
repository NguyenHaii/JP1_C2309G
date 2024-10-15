package Controller;

import Entity.EStatus;
import Entity.Order;
import Entity.OrderDetail;
import Entity.Product;
import ExceptionValidation.ProDuctNotEnoughException;

import java.util.List;

public class OrderDetailController {
    List<OrderDetail> orderDetails;

    public OrderDetailController() {
    }

    public OrderDetailController(List<OrderDetail> orderDetails) {
        this.orderDetails = orderDetails;
    }

    public void  checkEnoughQuantity(Order order ) {
        orderDetails.stream()
                .filter(od -> od.getOrder().getCode().equals(order.getCode()))
                .map(od->{
                    if (od.getProduct().getQuantity() > od.getQuantity()){
                        od.seteStatus(EStatus.COMPLETED);
                    }
                    return od;
                })
                .forEach(od -> {
                    if (od.getProduct().getQuantity() < od.getQuantity()) {
                        od.seteStatus(EStatus.PENDING);
                        throw new ProDuctNotEnoughException("Not enough quantity");
                    }
                    });

}}