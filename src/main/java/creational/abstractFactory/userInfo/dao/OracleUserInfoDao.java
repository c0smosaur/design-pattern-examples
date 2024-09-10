package creational.abstractFactory.userInfo.dao;


import creational.abstractFactory.userInfo.UserInfo;

public class OracleUserInfoDao implements UserInfoDao {
  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("insert into ORACLE "+ userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("update into ORACLE "+ userInfo.getUserId());

  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("delete from ORACLE "+ userInfo.getUserId());
  }
}
