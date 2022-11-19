package applicationTesting;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HabitTest {

	@Test
	public void test() {
		Habit test = new Habit(null, 0, 0);
		
		//set habit description
		test.setDescription("Play Guitar");
		//test if habit description has been set
		assertEquals("Here is the test for habit description", "Play Guitar", test.getDescription());
		
		//set habit timeHour
		test.setTimeMinute(10);
		//test if habit time Hour has been set
		assertEquals("Here is the test for habit time set hour", 10, test.getTimeMinute());
		
		//set habit timeMinute
		test.setTimeMinute(30);
		//test if habit time Minute has been set
		assertEquals("Here is the test for habit time set minute", 30, test.getTimeMinute());
	}

}
