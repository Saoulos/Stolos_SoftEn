package junitTests;

import Askisi.Eksoda;
import Askisi.Fortigo;
import Askisi.Ipallilos;
import Askisi.Odigos;

import junit.framework.TestCase;

public class Alltest extends TestCase {
	Eksoda eksoda = new Eksoda();
	Odigos odigos = new Odigos();
	Ipallilos ipallilos = new Ipallilos();
	Fortigo fortigo = new Fortigo();
	
	
	public void setUp() throws Exception {
		eksoda.setYphresia("Venzini");
		odigos.setHlikia(33);
		ipallilos.setUsername(1000);
		fortigo.setTID(12);
		eksoda.setArithmosApodeikshs(834334);
		odigos.setBardia(true);
		ipallilos.setUID(31);
		fortigo.setKivika(4000);
		odigos.setAFM(379183345);
		fortigo.setMontelo("Scania");
		ipallilos.setHlikia(27);
		eksoda.setPosoPlhrwmhs(650.00);
	}
	
	
	public void testEksoda(){
		assertEquals(eksoda.getYphresia(),"Venzini");
		assertEquals(eksoda.getArithmosApodeikshs(),834334);
		assertEquals(eksoda.getPosoPlhrwmhs(),650.00);
	}
	
	
	public void testOdigos(){
		assertEquals(odigos.getHlikia(),33);
		assertTrue(odigos.getBardia());
		assertEquals(odigos.getAFM(),379183345);
	}
	
	
	public void testIpallilos(){
		assertEquals(ipallilos.getUsername(),1000);
		assertEquals(ipallilos.getUID(),31);
		assertEquals(ipallilos.getHlikia(),27);
	}
	
	
	public void testFortigo(){
		assertEquals(fortigo.getMontelo(),"Scania");
		assertNotNull(fortigo.getKivika());
		assertEquals(fortigo.getTID(),12);
	}
}
	
	
	
	
	
	

