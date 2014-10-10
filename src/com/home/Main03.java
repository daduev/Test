package com.home;

import java.math.BigDecimal;

public class Main03 {

	public static void main(String[] args) {
		System.out.println("Main03");
	    BigDecimal bdTest = new BigDecimal(0.7455);
        BigDecimal bdTest1 = new BigDecimal("0.7457");
        bdTest = bdTest.setScale(3, BigDecimal.ROUND_HALF_UP);
        bdTest1 = bdTest1.setScale(3, BigDecimal.ROUND_HALF_UP);
        System.out.println("bdTest:" + bdTest);
        System.out.println("bdTest1:" + bdTest1); 
	}

}
