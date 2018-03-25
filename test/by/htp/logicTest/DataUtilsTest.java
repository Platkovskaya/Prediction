package by.htp.logicTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import by.htp.bean.Divination;
import by.htp.utils.DataUtils;

public class DataUtilsTest {

	@Test
	public void initLoveTest() {
		//DataUtils.getDivination("Love");
		List <String> divinations = new ArrayList<>();
		divinations.add("You will found you love!");
		divinations.add("Your love is so close!");
		Divination divination = new Divination("Love", divinations);
		String name = "Love";
		assertEquals(name,divination.getTitle());
	}
	
	@Test
	public void initWorkTest(){
		List <String> divinations = new ArrayList<>();
		divinations.add("You will rise your salary");
		divinations.add("You will hardworking and got the prize!");
		Divination divination = new Divination("Work", divinations);
		String name = "Work";
		assertEquals(name, divination.getTitle());
	}
	
	
	@Test
	public void initSuccessTest(){
		List <String> divinations = new ArrayList<>();
		divinations.add("Success following you!");
		divinations.add("You will get a happy moment today!");
		Divination divination = new Divination("Success", divinations);
		String name = "Success";
		assertEquals(name, divination.getTitle());
	}
	

}
