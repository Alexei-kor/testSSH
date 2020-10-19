package ru.package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloWorldTest {

	@Test
	public void test() {
		assertEquals("olleH !dlrow", HelloWorld.reverse("Hello world!"));
	}

}
