package creational.abstractFactory.product.dao;

import creational.abstractFactory.product.Product;

public class MySqlProductDao implements ProductDao {
  @Override
  public void insertProduct(Product product) {
    System.out.println("insert into MYSQL "+ product.getProductId());
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println("update into MYSQL "+ product.getProductId());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println("delete from MYSQL "+ product.getProductId());
  }
}
