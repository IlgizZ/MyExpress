package ru.kpfu.itis.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import ru.kpfu.itis.model.Category;


import java.util.List;


public interface GWTServiceAsync {

    void getAllCategories(AsyncCallback<List<Category>> asyncCallback);
//
//    void getProduct(Long id, AsyncCallback<Product> productAsyncCallback);
//
//    void getProducts(AsyncCallback<List<Product>> asyncCallback);
//
//    void getOrders(AsyncCallback<List<OrderDTO>> asyncCallback);
//
//    void sendOrder(Long id, AsyncCallback<Void> asyncCallback);
}
