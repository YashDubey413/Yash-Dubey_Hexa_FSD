package test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class classTestC {
	
	@Test
	@Tag("development")
	public void testC() {
		
		System.out.println("test C called");
	}

}
