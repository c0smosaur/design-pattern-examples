package creational.abstractFactory.product.dao;

import creational.abstractFactory.product.Product;

public interface ProductDao {

  void insertProduct(Product product);
  void updateProduct(Product product);
  void deleteProduct(Product product);
}