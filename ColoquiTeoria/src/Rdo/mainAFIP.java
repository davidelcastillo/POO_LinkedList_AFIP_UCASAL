package Rdo;

public class mainAFIP {
	public static void main(String[] args) {
		
		String [] Lista1 = new String [3];
		clsLinkedListAFIP Lista2 = new clsLinkedListAFIP();
		
		Lista1[0] = "20221115556-08/1985-70.500,00’";
		Lista1[1] = "20221857556-08/2022-70.500,00’";
		Lista1[2] = "20226415556-08/2016-70.500,00’";
			
		Lista2.insertaFin(Lista1[0]);
		Lista2.insertaFin(Lista1[1]);
		Lista2.insertaFin(Lista1[2]);
	
		Lista2.muestra();

	}

}
