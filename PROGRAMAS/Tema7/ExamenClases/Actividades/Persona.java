

public class Persona implements Cloneable,Comparable<Persona>{

	private int identificador;
	private static int contador=0;
	private String apellidosNombre;
	private int tipoActividad;
	private double peso;
	private int categoria;
	//constructor por defecto
	public Persona()throws ExcepcionPersona{
		
		
			this("Default",1,0.0);
		
	}
	//constructor por parametros
	public Persona(String n,int t, double p)throws ExcepcionPersona{
		
		if(p<0.0){
			throw new ExcepcionPersona("El peso no puede ser menor que cero");
		}else{
			identificador+=contador;
			this.apellidosNombre=n;
			this.peso=p;
			this.tipoActividad=t;
			contador++;
		}
		
		
	}
	//constructor de copia
	public Persona(Persona p)throws ExcepcionPersona{
		//try{
			this(p.getApellidosNombre(),p.getTipoActividad(),p.getPeso());
			
		/*}catch(ExcepcionPersona ep){
			System.out.println(ep);
		}*/
	}
	
	//metodos consultores
	public int getIdentificador(){
		return this.identificador;
	}
	public String getApellidosNombre(){
		return this.apellidosNombre;
	}
	public int getTipoActividad(){
		return this.tipoActividad;
	}
	public double getPeso(){
		return this.peso;
	}
	public int getCategoria(){
		return this.categoria;
	}
	
	//metodos consultores
	public void setApellidosNombre(String n){
		this.apellidosNombre=n;
	}
	public void setTipoActividad(int a){
		this.tipoActividad=a;
	}
	public void setPeso(double p)throws ExcepcionPersona{
		if(p<0.0){
			throw new ExcepcionPersona("El peso no puede ser menor que cero");
		}else{
			this.peso=p;
			}
	}
	
	@Override
	public Persona clone(){
		Persona clon=null;
		try{
			clon=(Persona)super.clone();
		}catch(CloneNotSupportedException pExc){
			System.out.println("El objeto no se pudo clonar");
		}
		return clon;
	}
	@Override
	/*cabecera: int compareTo(Perona p)
	 * decripcion:funcion que compara dos personas segun su identificador
	 * entradas: una Persona
	 * salidas:un entero
	 * precondiciones: ninguna
	 * postcondiciones:se devolvera un entero asociado al nombre, con valor -1 de ser el objeto que llama menor, 0 de ser igual y 1 de ser mayor
	 * */
	public int compareTo(Persona p){
		int resultado=0;
		if(this.getIdentificador()<p.getIdentificador())
			resultado=-1;
		else if(this.getIdentificador()==p.getIdentificador())
			resultado=0;
		else resultado=1;
		return resultado;
	}
	@Override
	public String toString(){
		return this.getIdentificador()+","+this.getTipoActividad();
	}
	@Override
	public boolean equals(Object obj){
		return (obj!=null && obj instanceof Persona)?true:false;
	}
	@Override
	public int hashCode(){
		return (5/4)*this.identificador/(3/2)*(this.apellidosNombre.hashCode());
	}
}
