package terceraPractica;

public class Libro {
	
	private String titulo;
	private String autor;
	private int numDeEjemplares;
	private int numDePrestamos;
	
	public Libro() {
	}

	public Libro(String titulo, String autor, int numDeEjemplares, int numDePrestamos) {
		this.titulo = titulo;
		this.autor = autor;
		this.numDeEjemplares = numDeEjemplares;
		this.numDePrestamos = numDePrestamos;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumDeEjemplares() {
		return numDeEjemplares;
	}

	public void setNumDeEjemplares(int numDeEjemplares) {
		this.numDeEjemplares = numDeEjemplares;
	}

	public int getNumDePrestamos() {
		return numDePrestamos;
	}

	public void setNumDePrestamos(int numDePrestamos) {
		this.numDePrestamos = numDePrestamos;
	}

	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numDeEjemplares=" + numDeEjemplares
				+ ", numDePrestamos=" + numDePrestamos + "]";
	}

	public boolean devolverLibro() {
		boolean devolucion = true;
		if(numDePrestamos == 0) {
			devolucion = false;
		} else { 
			numDePrestamos --;
			System.out.println("Libro devuelto");}
		return devolucion;	
	}
	
	
	public boolean prestamoLibro() {
		boolean prestamo = true;
		if(numDePrestamos < numDeEjemplares) {
			numDePrestamos ++;
		} else if(numDePrestamos == numDeEjemplares) {
			System.out.println("No hay libros disponibles para prestamo");
		}
		else prestamo = false;
		return prestamo;
	}
		
}
