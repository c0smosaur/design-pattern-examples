package structural.composite;

import java.util.ArrayList;

public class Category extends ProductCategory{

  ArrayList<ProductCategory> list;
  public Category(int id, String name, int price) {
    super(id, name, price);
    list = new ArrayList<>();
  }

  @Override
  public void addProduct(ProductCategory product) {
    list.add(product);
  }

  @Override
  public void removeProduct(ProductCategory product) {
    for (ProductCategory category:list){
      if (category.getId() == product.getId()){
        list.remove(category);
        return;
      }
    }
    System.out.println("Category does not exist.");
  }

  @Override
  public int getCount() {
    int count = 0;
    for (ProductCategory category:list){
      count += category.getCount();
    }
    return count;
  }

  @Override
  public String getName() {
    return list.toString();
  }

  @Override
  public int getPrice() {
    int price = 0;
    for (ProductCategory category:list){
      price += category.getPrice();
    }
    return price;
  }

  @Override
  public int getId() {
    return 0;
  }
}
