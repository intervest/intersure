package com.intervest.dao.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@ContextConfiguration(classes = AppConfiguration.class)
public class UserRepositoryTests {

	@Autowired
	UserRepository userRepository;

	User user;

	@Before
	public void initializeUser() {
		user = new User("system", "Intervest", "Technologies");
	}

	@Test
	public void findSavedUserById() {
		userRepository.save(user);
		assertEquals(user, userRepository.findOne(user.getId()));
	}

	@Test
	public void findSavedUserByUserName() {
		userRepository.save(user);
		List<User> users = userRepository.findByUserName(user.getUserName());
		assertNotNull(users);
		assertTrue(users.contains(user));
	}
}