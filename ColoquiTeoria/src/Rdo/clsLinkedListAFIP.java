package Rdo;

public class clsLinkedListAFIP {
	private clsNodoAFIP tope, lista;
	
	public clsLinkedListAFIP(){
		limpiaLista();
	}
	
	boolean estaVacia(){
		return (lista==null);
	}
	

	void limpiaLista(){
		this.tope=this.lista=null;;
	}
	
	
	// inserta elemento a la derecha
	public void insertaFin(String Contri){
		if (!estaVacia()){
			this.lista.setNextNode(new clsNodoAFIP(Contri));
			this.lista=this.lista.getNextNode();
		}else{
			this.tope = this.lista=new clsNodoAFIP (Contri);			
		}
	}	

	// elimina elemento ubicado m�s a la derecha
	void eliminaFin(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				clsNodoAFIP temp;
				for (temp=this.tope;temp.getNextNode()!=lista;temp=temp.getNextNode());
				this.lista=temp;
				this.lista.setNextNode(null);			
			}
		}else{
			System.out.println("Error eliminaFin. Lista vacia");			
		}
	}		

	
	// inserta elemento a la izq
	void insertaTope(String Contri){
		if (!estaVacia()){
			this.tope = new clsNodoAFIP(Contri, this.tope);		
		}else{
			this.tope = this.lista=new clsNodoAFIP(Contri);			
		}
	}	

	
	// elimina elemento ubicado m�s a la izq
	void eliminaTope(){
		if (!estaVacia()){
			if (this.lista==this.tope){
				// un solo elemento
				limpiaLista();
			}else{
				this.tope=this.tope.getNextNode();			
			}
		}else{
			System.out.println("Error eliminaTope. Lista vacia");			
		}
	}	
	
	
	public void muestra(){
		clsNodoAFIP temp;		
		if (!estaVacia()){
			temp=this.tope;
			while (temp!=null){
				System.out.println("Cuit : " + temp.GetCuit() + ", Categoria : " + temp.GetCat() + ", Monto : " + temp.GetMonto());
				temp=temp.getNextNode();
			}			
		}else{
			System.out.println("Error muestra. Lista vacia");
		}		
	}
	
	clsNodoAFIP getTope(){return tope;}


}