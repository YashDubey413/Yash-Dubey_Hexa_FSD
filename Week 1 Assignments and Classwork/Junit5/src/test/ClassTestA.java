package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class ClassTestA {
	
	@Test
	@Tag("production")
	@Tag("development")
	public void testA() {
		
		System.out.println("test A called");
	}

}
