package com.kodilla.good.patterns.challenges;
public class ProductOrderService {
    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public ProductOrderDto processOrder(final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getProduct(), orderRequest.getUser());
        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct());
            return new ProductOrderDto(orderRequest.getUser(), true);
        } else {
            return new ProductOrderDto(orderRequest.getUser(), false);
        }
    }
}
