package ru.kpfu.itis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.client.service.GWTService;
import ru.kpfu.itis.model.Category;
import ru.kpfu.itis.repository.CategoryRepository;

import java.util.List;

@Service("gwtService")
public class GWTServiceImpl implements GWTService {

    @Autowired
    CategoryRepository categoryRepository;

    //
//    @Autowired
//    ProductRepository productRepository;
//
//    @Autowired
//    OrderRepository orderRepository;
//
    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }
//
//    @Override
//    public Product getProduct(Long id) {
//        return productRepository.findOne(id);
//    }
//
//    @Override
//    public List<Product> getProducts() {
//        return productRepository.findAll();
//    }
//
//    @Override
//    @Transactional
//    public List<OrderDTO> getOrders() {
//        List<Order> orders = orderRepository.findAllByOrderStatus(OrderStatus.ОБРАБАТЫВАЕТСЯ);
//        List<OrderDTO> orderDTOs = new ArrayList<>();
//        for (Order order : orders) {
//            OrderDTO orderDTO = new OrderDTO(order);
//            orderDTOs.add(orderDTO);
//        }
//        return orderDTOs;
//    }
//
//    @Override
//    public void sendOrder(Long id) {
//        Order order = orderRepository.findOne(id);
//        order.setOrderStatus(OrderStatus.ОТПРАВЛЕН);
//        orderRepository.save(order);
//    }
}
