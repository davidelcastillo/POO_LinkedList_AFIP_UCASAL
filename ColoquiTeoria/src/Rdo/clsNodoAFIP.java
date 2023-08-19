package Rdo;

import java.time.LocalDate;
import java.time.Period;

public class clsNodoAFIP {
	private String Cuit;
	private char Categoria;
	private int Monto;
	private clsNodoAFIP nextNode;

	//Sobrecarga----------
	clsNodoAFIP (String Dato){
		this.setinfo(Dato);
		this.nextNode = null;
	}

	clsNodoAFIP (String Dato, clsNodoAFIP nextNode){
		this.setinfo(Dato);
		this.nextNode = nextNode;
	}
	
	//  --------------
	
	void setNodeInfo(String Dato){
		this.setinfo(Dato);
	}
	
	protected void SetCuit (String Cuit) {
		this.Cuit = Cuit;
	}
	
	protected void SetCat (char Cat) {
		this.Categoria = Cat;
	}
	
	protected void SetMonto (int Monto) {
		this.Monto = Monto;
	}
	
	void setNextNode(clsNodoAFIP nextNode){
		this.nextNode=nextNode;
	}
	
	void getNodeInfo(){
		GetCuit();
		GetCat();
		GetMonto();
	}
	
	protected String GetCuit () {
		return this.Cuit;	
	}
	
	protected char GetCat () {
		return this.Categoria;		
	}
	
	protected int GetMonto () {
		return this.Monto;
	}
	
	clsNodoAFIP getNextNode(){
		return this.nextNode;
	}

	//-----------
	
	private int CalqAns (String mes, String año) {
		int ms, anio;
		ms = Integer.parseInt(mes);
		anio = Integer.parseInt(año);
		LocalDate fechaNacimiento = LocalDate.of(anio, ms, 1);
		LocalDate fechaActual = LocalDate.now();
		Period periodo = Period.between(fechaNacimiento, fechaActual);
		int anos = periodo.getYears();
		return anos;
	}
	
	protected void autoCatMont (String Fecha) {
		String mes = Fecha.substring(0, 1);
		String año = Fecha.substring(2, 6);
		int Ans = CalqAns (mes,año);
		if (Ans <= 5) {
			this.Categoria = 'A';
			this.Monto = 350;
		}
		else if (Ans > 5 && Ans <= 10) {
			this.Categoria = 'B';
			this.Monto = 750;
		}
		else {
			this.Categoria = 'C';
			this.Monto = 1250;
		}
	}
	
	protected void setinfo (String Dato) {
		String Cuit = Dato.substring(0, 11);
		String Fecha = Dato.substring(13, 20);
		this.autoCatMont(Fecha);
		this.SetCuit(Cuit);
	}
}
