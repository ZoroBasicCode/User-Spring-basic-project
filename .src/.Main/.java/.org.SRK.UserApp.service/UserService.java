package org.SRK.userApp.service;

import org.SRK.userApp.dao.Userdao;
import org.SRK.userApp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	private Userdao dao;
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	public User updateUser(User user) {
		return dao.updateUser(user);
	}
	public User fetchUser(int id) {
		return dao.fetchUser(id);
	}
	public boolean deleteUser(int id) {
		return dao.deleteUser(id);
	}
	public User verifyUser(long phon,String pasw) {
		return dao.verifyUser(phon, pasw);
	}
}
