package ru.kpfu.itis.client.service;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import ru.kpfu.itis.model.Category;

import java.util.List;


@RemoteServiceRelativePath("springGwtServices/gwtService")
public interface GWTService extends RemoteService {

    List<Category> getAllCategories();
//
//    Product getProduct(Long id);
//
//    List<Product> getProducts();
//
//    List<OrderDTO> getOrders();
//
//    void sendOrder(Long id);

}
