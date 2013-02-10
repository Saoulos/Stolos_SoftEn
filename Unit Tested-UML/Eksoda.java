

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
class Eksoda {


private Date HmerEkdoshsApodeikshs;
 

public Date getHmerEkdoshsApodeikshs()
{
	return HmerEkdoshsApodeikshs;
}

/
public void setHmerEkdoshsApodeikshs(Date HmerEkdoshsApodeikshs ){
	this.HmerEkdoshsApodeikshs = HmerEkdoshsApodeikshs;
}


private String Yphresia;
 

public String getYphresia()
{
	return Yphresia;
}


public void setYphresia(String Yphresia ){
	this.Yphresia = Yphresia;
}


private int ArithmosApodeikshs;
 

public int getArithmosApodeikshs()
{
	return ArithmosApodeikshs;
}


public void setArithmosApodeikshs(int ArithmosApodeikshs ){
	this.ArithmosApodeikshs = ArithmosApodeikshs;
}


private float PosoPlhrwmhs;
 

public float getPosoPlhrwmhs()
{
	return PosoPlhrwmhs;
}


public void setPosoPlhrwmhs(float PosoPlhrwmhs ){
	this.PosoPlhrwmhs = PosoPlhrwmhs;
}


private String OnomaOdhgou;
 

public String getOnomaOdhgou()
{
	return OnomaOdhgou;
}


public void setOnomaOdhgou(String OnomaOdhgou ){
	this.OnomaOdhgou = OnomaOdhgou;
}


private float ApostolhEksodwn;
 

public float getApostolhEksodwn()
{
	return ApostolhEksodwn;
}


public void setApostolhEksodwn(float ApostolhEksodwn ){
	this.ApostolhEksodwn = ApostolhEksodwn;
}


private Collection<Ipallilos> ipallilos;


public Collection<Ipallilos> getIpallilos()
{
	return ipallilos;
}
 
/
public Iterator<Ipallilos> ipallilosIterator(){
	return ipallilos.iterator();
}

public boolean isIpallilosEmpty(){
	return ipallilos.isEmpty();
}


public boolean containsIpallilos(Ipallilos ipallilos){
	return this.ipallilos.contains(ipallilos);
}


public boolean containsAllIpallilos(Collection<Ipallilos> ipallilos){
	return this.ipallilos.containsAll(ipallilos);
}


public int ipallilosSize(){
	return ipallilos.size();
}


public Ipallilos[] ipallilosToArray(){
	return ipallilos.toArray(new Ipallilos[ipallilos.size()]);
}



public boolean addIpallilos(Ipallilos ipallilos){
	return this.ipallilos.add(ipallilos);
}


public void setIpallilos(Collection<Ipallilos> ipallilos){
	this.ipallilos = ipallilos;
}


public boolean removeIpallilos(Ipallilos ipallilos){
	return this.ipallilos.remove(ipallilos);
}


public void clearIpallilos(){
	this.ipallilos.clear();
}

}
