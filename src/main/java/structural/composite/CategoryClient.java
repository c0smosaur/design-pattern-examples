package structural.composite;

public class CategoryClient {
  public static void main(String[] args) {
    ProductCategory womanCategory = new Category(1234, "Torso", 0);

    ProductCategory clothesCategoryW = new Category(2345, "Clothes", 0);
    ProductCategory shoesCategoryW = new Category(3456, "Shoes", 0);
    ProductCategory bagCategoryW = new Category(4567, "Bag", 0);

    womanCategory.addProduct(clothesCategoryW);
    womanCategory.addProduct(shoesCategoryW);
    womanCategory.addProduct(bagCategoryW);

    ProductCategory shoes1 = new Product(1, "SKETCHERS",100000);
    ProductCategory shoes2 = new Product(2, "ADIDAS", 90000);
    ProductCategory shoes3 = new Product(3, "VANS", 70000);

    shoesCategoryW.addProduct(shoes1);
    shoesCategoryW.addProduct(shoes2);
    shoesCategoryW.addProduct(shoes3);

    System.out.println(womanCategory.getCount());
    System.out.println(womanCategory.getPrice());
  }
}
