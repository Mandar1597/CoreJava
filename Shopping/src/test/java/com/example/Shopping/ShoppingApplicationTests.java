package com.example.Shopping;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.Shopping.model.Mall;
import com.example.Shopping.model.MallAdmin;
import com.example.Shopping.repos.IMallRepository;

@SpringBootTest
class ShoppingApplicationTests {
	
	@Autowired
	IMallRepository mallRepo;

	@Test
	void test() {
		MallAdmin mallAdmin = new MallAdmin(1,"Adesh","password","8888761753");
		Mall mall = new Mall(1L,"Centro","Pune","Clothing",mallAdmin);
		mallRepo.save(mall);
	}

}
