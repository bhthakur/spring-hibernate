package com.javarticles.spring.hibernate;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
@Transactional
public class SpringHibernateTest {
	
	@Autowired
	SpringHibernateTemplateExample template;

	@Test
	public void test() {
		List<?> employees = template.findAll();
        System.out.println("List of employees: " + employees);

	}

}
