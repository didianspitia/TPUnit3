package org.example.ejercicios;

import java.util.Arrays;
import java.util.List;

public class Facturaciom4 {
	public static void main(String[] args) {
		// Creación de instancias de Factura representando diferentes facturas
		Factura factura1 = new Factura("Maria Sanabria", "Junio 1, 1999", List.of(4500D, 5000D, 2500D));
		Factura factura2 = new Factura("Juan Perez", "Agosto 15, 2000", List.of(3500D, 6000D, 2800D));
		Factura factura3 = new Factura("Juan camilo", "Febrero 25, 2002", List.of(2700D, 3000D, 5500D));

		// Almacenamiento de las instancias de Factura en una lista
		List<Factura> facturas = Arrays.asList(factura1, factura2, factura3);

		// Impresión del encabezado del listado de facturas
		System.out.println("\nListado de Facturas");

		// Recorrido de la lista de facturas y llamada al método imprimirFactura
		for (int i = 0; i < facturas.size(); i++) {
			Factura factura = facturas.get(i);
			imprimirFactura(factura, i + 1);
		}
	}
	// Método para imprimir la información de una factura
	public static void imprimirFactura(Factura factura, int numeroFactura) {
		System.out.println("\nFactura " + numeroFactura);
		System.out.println("Cliente: " + factura.cliente());
		System.out.println("Total: " + factura.total());
	}
	// Definición del registro Factura
	record Factura(String cliente, String fechafactura, List<Double> precioProducto) {
		// Método para calcular el total de la factura
		public double total() {
			return precioProducto.stream().mapToDouble(Double::doubleValue).sum();
		}
	}
}