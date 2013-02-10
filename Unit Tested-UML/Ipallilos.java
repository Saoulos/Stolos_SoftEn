

import java.util.Collection;
import java.util.Iterator;
public class Ipallilos {


private String Onoma;
 

public String getOnoma()
{
	return Onoma;
}



public void setOnoma(String Onoma ){
	this.Onoma = Onoma;
}


private String Epitheto;
 

public String getEpitheto()
{
	return Epitheto;
}


public void setEpitheto(String Epitheto ){
	this.Epitheto = Epitheto;
}


private String Patrwnumo;
 

public String getPatrwnumo()
{
	return Patrwnumo;
}


public void setPatrwnumo(String Patrwnumo ){
	this.Patrwnumo = Patrwnumo;
}


private int Hlikia;
 

public int getHlikia()
{
	return Hlikia;
}


public void setHlikia(int Hlikia ){
	this.Hlikia = Hlikia;
}

private int Thlefono;
 

public int getThlefono()
{
	return Thlefono;
}


public void setThlefono(int Thlefono ){
	this.Thlefono = Thlefono;
}


private String Email;
 

public String getEmail()
{
	return Email;
}


public void setEmail(String Email ){
	this.Email = Email;
}


private int AFM;
 

public int getAFM()
{
	return AFM;
}


public void setAFM(int AFM ){
	this.AFM = AFM;
}


private String Prouphresia;
 

public String getProuphresia()
{
	return Prouphresia;
}


public void setProuphresia(String Prouphresia ){
	this.Prouphresia = Prouphresia;
}

private int UID;
 

public int getUID()
{
	return UID;
}


public void setUID(int UID ){
	this.UID = UID;
}


private int Username;
 

public int getUsername()
{
	return Username;
}


public void setUsername(int Username ){
	this.Username = Username;
}

private String Password;
 

public String getPassword()
{
	return Password;
}


public void setPassword(String Password ){
	this.Password = Password;
}


private String Dikaiwmata;
 

public String getDikaiwmata()
{
	return Dikaiwmata;
}


public void setDikaiwmata(String Dikaiwmata ){
	this.Dikaiwmata = Dikaiwmata;
}


private String ParousiashStatistikwn;
 

public String getParousiashStatistikwn()
{
	return ParousiashStatistikwn;
}


public void setParousiashStatistikwn(String ParousiashStatistikwn ){
	this.ParousiashStatistikwn = ParousiashStatistikwn;
}

private float KatagrafhEksodwn;
 

public float getKatagrafhEksodwn()
{
	return KatagrafhEksodwn;
}


public void setKatagrafhEksodwn(float KatagrafhEksodwn ){
	this.KatagrafhEksodwn = KatagrafhEksodwn;
}


private float LhpshDedomenwnForthgou;
 

public float getLhpshDedomenwnForthgou()
{
	return LhpshDedomenwnForthgou;
}


public void setLhpshDedomenwnForthgou(float LhpshDedomenwnForthgou ){
	this.LhpshDedomenwnForthgou = LhpshDedomenwnForthgou;
}


private String LhpshTheshsForthgou;
 

public String getLhpshTheshsForthgou()
{
	return LhpshTheshsForthgou;
}

public void setLhpshTheshsForthgou(String LhpshTheshsForthgou ){
	this.LhpshTheshsForthgou = LhpshTheshsForthgou;
}


private Collection<Eksoda> eksoda;


public Collection<Eksoda> getEksoda()
{
	return eksoda;
}
 

public Iterator<Eksoda> eksodaIterator(){
	return eksoda.iterator();
}


public boolean isEksodaEmpty(){
	return eksoda.isEmpty();
}


public boolean containsEksoda(Eksoda eksoda){
	return this.eksoda.contains(eksoda);
}


public boolean containsAllEksoda(Collection<Eksoda> eksoda){
	return this.eksoda.containsAll(eksoda);
}


public int eksodaSize(){
	return eksoda.size();
}


public Eksoda[] eksodaToArray(){
	return eksoda.toArray(new Eksoda[eksoda.size()]);
}


public boolean addEksoda(Eksoda eksoda){
	return this.eksoda.add(eksoda);
}


public void setEksoda(Collection<Eksoda> eksoda){
	this.eksoda = eksoda;
}


public boolean removeEksoda(Eksoda eksoda){
	return this.eksoda.remove(eksoda);
}


public void clearEksoda(){
	this.eksoda.clear();
}

}

//public Fortigo getFortigo()
//{
//	return fortigo;
//}

//public void setFortigo(Fortigo fortigo ){
//	this.fortigo = fortigo;
//}