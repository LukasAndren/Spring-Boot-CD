package com.example.demo;

import com.example.demo.bean.Calculation;
import com.example.demo.controller.CalculationController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootWebAppApplicationTests {

	private CalculationController calculationController = new CalculationController();
	private Calculation calculation = new Calculation();


	@Test
	void contextLoads() {
	}

	@Test
	public void testCalculateSum(){

		calculation.setNumberOne("10");
		calculation.setNumberTwo("5");

		calculationController.calculateSum(calculation);

		assert "15".equals(calculation.getSum());

	}

}
