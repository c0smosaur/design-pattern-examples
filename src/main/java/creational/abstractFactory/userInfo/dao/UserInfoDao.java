package creational.abstractFactory.userInfo.dao;

import creational.abstractFactory.userInfo.UserInfo;

public interface UserInfoDao {

  void insertUserInfo(UserInfo userInfo);
  void updateUserInfo(UserInfo userInfo);
  void deleteUserInfo(UserInfo userInfo);
}
