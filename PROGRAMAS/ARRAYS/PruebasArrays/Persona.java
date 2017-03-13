
public class Persona implements Comparable<Persona>{
	
	private String nombre;
	private String apellidos;
	private int edad;
	private int DNI;
	
	Persona(String n,String a,int e, int dni){
		this.nombre=n;
		this.apellidos=a;
		this.edad=e;
		this.DNI=dni;
		}
	public String getNombre(){
		return nombre;}
	public String getApellidos(){
		return apellidos;}
	public int getEdad(){
		return edad;}
	public int getDNI(){
		return DNI;}
	public  void setNombre(String n ){
		this.nombre=n;}
	public void setApellidos(String a){
		this.apellidos=a;}
	public void setEdad(int e){
		this.edad=e;}
	public void setDNI(int d){
		this.DNI=d;}
		
	public int compareTo(Persona p){
		int resultado=0;
		if(this.edad>p.getEdad())
		resultado=1;
		else if(this.edad<p.getEdad())
		resultado=-1;
		return resultado;
		}
	public String toString(){
		return nombre+","+apellidos+","+edad+","+DNI;}
}
