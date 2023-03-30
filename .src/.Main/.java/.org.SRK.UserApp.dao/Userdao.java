package org.SRK.userApp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.SRK.userApp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class Userdao {
	@Autowired
	EntityManager m;
	public User saveUser(User user) {
		EntityTransaction t=m.getTransaction();
		m.persist(user);
		t.begin();
		t.commit();
		return user;
	}
	public User updateUser(User user) {
		EntityTransaction t=m.getTransaction();
		m.merge(user);
		t.begin();
		t.commit();
		return user;
	}
	public User fetchUser(int id) {
		User u=m.find(User.class, id);
		return u;
	}
	public boolean deleteUser(int id) {
		EntityTransaction t=m.getTransaction();
		User u=m.find(User.class, id);
		if(u!=null) {
		m.remove(u);
		t.begin();
		t.commit();
		return true;
		}
		else
		return false;
	}
	public User verifyUser(long phon,String pasw) {
		String qr="select u from User u where u.phone=?1 and u.password=?2";
		Query q=m.createQuery(qr);
		q.setParameter(1, phon);
		q.setParameter(2, pasw);
		List<User> us=q.getResultList();
		if(us.size()>0) {
			return us.get(0);
		}
		return null;
	}
}
