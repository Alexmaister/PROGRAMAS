
/*INTERFAZ:
  
 * double getVoltaje()
 * void setVoltaje( double v)
 * double getCapacidad()
 * double getAislamiento()
 * void setAislamiento(double a) 
 * double getPeso()
 * void setPeso(double p)
 * double getCET()
 * void setCET(double cet)
 * int getTiempo()
 * void setTiempo(int t)
 */


public class Calorimetro {
	
	private double voltaje;
	private double capacidad;
	private double aislamiento;
	private double peso;
	private double cet;
	private int tiempo;
	private double calorias;
	
	public Calorimetro(){
		
		this.voltaje=5;
		this.capacidad=50;
		this.aislamiento=0.10;
		peso=0;
		tiempo=0;
		cet=0;
	}
	
	public Calorimetro(double voltaje,double capacidad, double aislamiento, double peso, double cet, int tiempo){
		
		this.voltaje=voltaje;
		this.capacidad=capacidad;
		this.aislamiento=aislamiento;
		this.peso=peso;
		this.tiempo=tiempo;
		this.cet=cet;
		
	}
	
	public Calorimetro(Calorimetro c){
		
		this.voltaje=c.getVoltaje();
		this.capacidad=c.getCapacidad();
		this.aislamiento=c.getAislamiento();
		this.peso=c.getPeso();
		this.tiempo=c.getTiempo();
		this.cet=c.getCET();
	}
	
	public double getVoltaje(){
		return this.voltaje;
	}
	public double getCapacidad(){
		return this.capacidad;
	}
	public double getAislamiento(){
		return this.aislamiento;
	}
	public double getPeso(){
		return this.peso;
	}
	public double getCET(){
		return this.cet;
	}
	public int getTiempo(){
		return this.tiempo;
	}
	public double getCalorias(){
		return this.cet*this.tiempo*this.peso;
	}
	
	
	public void setVoltaje(double voltaje){
		this.voltaje=voltaje;
	}
	public void setAislamiento(double aislamiento){
		this.aislamiento=aislamiento;
	}
	public void setTiempo(int t){
		this.tiempo=t;
	}
	public void setPeso(double p){
		this.peso=p;
	}
	public void setCET(double cet){
		this.cet=cet;
	}

	
}
