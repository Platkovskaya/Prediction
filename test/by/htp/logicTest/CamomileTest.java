package by.htp.logicTest;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import by.htp.bean.Chamomile;
import by.htp.bean.Client;
import by.htp.bean.FortuneTeller;

public class CamomileTest {
	private FortuneTeller fortuneTeller;

	@Before
	public void initTest() {
		List<Client> clients = new LinkedList<>();
		fortuneTeller = new FortuneTeller("Anna", clients);
		
	}

	@Test
	public void fortuneTellerTest() {
		String name = "Anna";
		assertEquals(name, fortuneTeller.getName());
		
	}
	
	@Test
	public void initChamomilesTest(){
		List<Chamomile> chamomiles = fortuneTeller.getChamomiles();
		assertTrue("Test is not loading", chamomiles.size() >=1 && chamomiles.size() <=5);
	}

}
