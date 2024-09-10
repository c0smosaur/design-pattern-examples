package creational.abstractFactory.factory;


import creational.abstractFactory.product.dao.ProductDao;
import creational.abstractFactory.userInfo.dao.UserInfoDao;

public interface DaoFactory {

  UserInfoDao createUserInfoDao();
  ProductDao createProductDao();
}
