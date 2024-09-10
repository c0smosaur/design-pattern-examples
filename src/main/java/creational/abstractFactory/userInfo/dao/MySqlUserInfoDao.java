package creational.abstractFactory.userInfo.dao;


import creational.abstractFactory.userInfo.UserInfo;

public class MySqlUserInfoDao implements UserInfoDao {
  @Override
  public void insertUserInfo(UserInfo userInfo) {
    System.out.println("insert into MYSQL "+ userInfo.getUserId());
  }

  @Override
  public void updateUserInfo(UserInfo userInfo) {
    System.out.println("update into MYSQL "+ userInfo.getUserId());
  }

  @Override
  public void deleteUserInfo(UserInfo userInfo) {
    System.out.println("delete from MYSQL "+ userInfo.getUserId());
  }
}
