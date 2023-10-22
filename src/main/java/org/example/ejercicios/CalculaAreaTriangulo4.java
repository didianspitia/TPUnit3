package org.example.ejercicios;

public class CalculaAreaTriangulo4 {
	public static void main(String[] args) {
		// Creación de una instancia de Triangulo con base y altura
		Triangulo triangulo = new Triangulo(5D, 6.0);

		// Cálculo del área del triángulo
		double valorAreaTriangulo = calcularArea(triangulo);

		// Impresión datos
		System.out.println("Altura del triángulo: " + triangulo.h());
		System.out.println("Base del triángulo: " + triangulo.b());
		System.out.println("Área del triángulo: " + valorAreaTriangulo);
	}
	// Método para calcular el área de un triángulo
	public static double calcularArea(Triangulo triangulo) {
		double base = triangulo.b();
		double altura = triangulo.h();
		return 0.5 * base * altura;
	}
	// Definición del registro Triangulo
	record Triangulo(double base, double altura) {
		// Método para obtener la altura del triángulo
		public double h() {
			return altura;
		}
		// Método para obtener la base del triángulo
		public double b() {
			return base;
		}
	}
}