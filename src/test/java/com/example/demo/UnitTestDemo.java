package com.example.demo;

import org.junit.Assert;
import org.junit.Test;

public class UnitTestDemo {
	@Test
	public void test() {
		Assert.assertEquals("Hello", HelloController.hello);
	}
}
