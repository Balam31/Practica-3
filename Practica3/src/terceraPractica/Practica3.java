package terceraPractica;

import java.util.Scanner;

public class Practica3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Scanner buscar = new Scanner(System.in);
		
		String titulo, autor, tituloBuscado;
		
		int numLibros,numDeEjemplares, numDePrestamos, opciones, confirmacionWhile = 0;
		
		System.out.println("Ingresa el numero de libros: ");
		numLibros = sc.nextInt();
		
		Libro libro[] = new Libro[numLibros];
		
		
		for(int i=0; i<libro.length; i++) {
			sc.nextLine();
			System.out.println("Ingresa el titulo del libro: " + (i+1));
			titulo = sc.nextLine();
			
			System.out.println("Ingresa el autor del libro: ");
			autor = sc.nextLine();
			
			System.out.println("Ingresa el numero de ejemplares: ");
			numDeEjemplares = sc.nextInt();
			
			System.out.println("Numero de libros prestados: ");
			numDePrestamos = sc.nextInt();
		
			libro[i] = new Libro(titulo, autor, numDeEjemplares, numDePrestamos);
			libro[i].setTitulo(titulo);
			libro[i].setAutor(autor);
			libro[i].setNumDeEjemplares(numDeEjemplares);
			libro[i].setNumDePrestamos(numDePrestamos);
			}	
		

		
		do {
			System.out.println("Menu de Biblioteca");
			System.out.println("Ingresa la consulta que quieres hacer");
			System.out.println("1 - Informacion de libros");
			System.out.println("2 - Prestamo");
			System.out.println("3 - Devolucion");
			opciones = sc.nextInt();
			
			if (opciones == 1) {
				System.out.println("Informacion de libros");
				for(int i=0; i<libro.length; i++) {
					System.out.println("Libro: " + libro[i].getTitulo() + " Autor: " 
							+ libro[i].getAutor() + " Ejemplares: " + libro[i].getNumDeEjemplares()
							+ " Prestado: " + libro[i].getNumDePrestamos());}
				
			} else if (opciones == 2){
				System.out.println("Prestamo");
				System.out.println("Ingresa el titulo del libro a prestar: ");
				tituloBuscado = buscar.nextLine();	
				for(int i=0; i<libro.length; i++) {
					if(libro[i].getTitulo().equals(tituloBuscado)) {
						System.out.println("Libro prestado ");
						libro[i].prestamoLibro();
						
					}
				}
				
			} else if(opciones ==3) {
				System.out.println("Devolucion");
				System.out.println("Ingresa el titulo del libro a devolver");
				tituloBuscado = buscar.nextLine();
				for(int i=0; i<libro.length; i++) {
					if(libro[i].getTitulo().equals(tituloBuscado)) {
						System.out.println("Libro devuelto ");
						libro[i].devolverLibro();
					}
				}
				
				
			} else {
				System.out.println("No se selecciono ninguna opcion valida.");
			}
			
			System.out.println("Desea realizar otra consulta: "); 
			System.out.println("1 - Si");
			System.out.println("2 - No");
			confirmacionWhile = sc.nextInt();
			
		}while(confirmacionWhile == 1);
	
		sc.close();
		buscar.close();
	}
	
}
