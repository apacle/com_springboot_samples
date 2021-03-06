package com.springboot.test.mapper;

import java.util.ArrayList;
import java.util.List;

import com.seatel.entity.User;
import com.seatel.enums.UserSex;
import com.seatelgroup.mpay.demo.entity.User;
import com.seatelgroup.mpay.demo.enums.UserSex;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Component
public class UserDao {
	public List<User> queryUserList(){
		List<User> users = new ArrayList<User>();

		for(int i=0;i<10;i++) {
			User user = new User(i,"name_" + i,"pd_" + i,"nickName_"+ i ,i%2 == 0 ? UserSex.MAN : UserSex.WOMAN);
			users.add(user);
		}

		return users;
	}
}
