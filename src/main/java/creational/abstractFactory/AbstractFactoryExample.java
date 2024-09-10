package creational.abstractFactory;

import creational.abstractFactory.factory.DaoFactory;
import creational.abstractFactory.factory.MySqlDaoFactory;
import creational.abstractFactory.factory.OracleDaoFactory;
import creational.abstractFactory.product.Product;
import creational.abstractFactory.product.dao.ProductDao;
import creational.abstractFactory.userInfo.UserInfo;
import creational.abstractFactory.userInfo.dao.UserInfoDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class AbstractFactoryExample {
  public static void main(String[] args) throws IOException {
    FileInputStream fis = new FileInputStream("src/db.properties");

    Properties properties = new Properties();
    properties.load(fis);

    String dbType = properties.getProperty("DBTYPE");

    UserInfo userInfo = new UserInfo();
    userInfo.setUserId("1");
    userInfo.setUserName("A");
    userInfo.setPassword("aaaa");

    Product product = new Product();
    product.setProductId("1");
    product.setProductName("apple");

    DaoFactory daoFactory = null;

    if (dbType.equals("MYSQL")){
      daoFactory = new MySqlDaoFactory();
    } else if (dbType.equals("ORACLE")){
      daoFactory = new OracleDaoFactory();
    }

    UserInfoDao userInfoDao = daoFactory.createUserInfoDao();
    ProductDao productDao = daoFactory.createProductDao();

    userInfoDao.insertUserInfo(userInfo);
    productDao.insertProduct(product);
  }
}
