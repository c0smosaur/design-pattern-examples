package creational.abstractFactory.factory;

import creational.abstractFactory.product.dao.MySqlProductDao;
import creational.abstractFactory.product.dao.ProductDao;
import creational.abstractFactory.userInfo.dao.MySqlUserInfoDao;
import creational.abstractFactory.userInfo.dao.UserInfoDao;

public class MySqlDaoFactory implements DaoFactory{
  @Override
  public UserInfoDao createUserInfoDao() {
    return new MySqlUserInfoDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new MySqlProductDao();
  }
}
