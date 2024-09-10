package creational.abstractFactory.factory;


import creational.abstractFactory.product.dao.OracleProductDao;
import creational.abstractFactory.product.dao.ProductDao;
import creational.abstractFactory.userInfo.dao.OracleUserInfoDao;
import creational.abstractFactory.userInfo.dao.UserInfoDao;

public class OracleDaoFactory implements DaoFactory{
  @Override
  public UserInfoDao createUserInfoDao() {
    return new OracleUserInfoDao();
  }

  @Override
  public ProductDao createProductDao() {
    return new OracleProductDao();
  }
}
