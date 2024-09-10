package creational.abstractFactory.product.dao;


import creational.abstractFactory.product.Product;

public class OracleProductDao implements ProductDao {
  @Override
  public void insertProduct(Product product) {
    System.out.println("insert into ORACLE "+ product.getProductId());
  }

  @Override
  public void updateProduct(Product product) {
    System.out.println("update into ORACLE "+ product.getProductId());
  }

  @Override
  public void deleteProduct(Product product) {
    System.out.println("delete from ORACLE "+ product.getProductId());
  }
}
