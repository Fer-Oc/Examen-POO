import java.util.Scanner;

public class mainRefacciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre_refaccion;
		String ubicacion;
		String tipo_refaccion;
		float precio_refaccion;
		int cantidad;
		
		Refaccionaria refaccion; //variable 
		Scanner lectura = null; //SCANNER 
		implementacion imp = new implementacion(); // instancia de clase
		 int menuP,subMenu,indice;
		 do {
			 System.out.println("Bienvenido al menu principal");
				System.out.println("1.- Ingresar un producto"); // check
				System.out.println("2.- Mostrar los productos"); // chek
				System.out.println("3.- Buscar un producto por nombre"); // chek
				System.out.println("4.- Buscar un producto por tipo de");
				System.out.println("5.- Editar un producto ");
				System.out.println("6.- Eliminar un producto");
				System.out.println("7.- Ganancias");
				lectura = new Scanner(System.in);
				menuP = lectura.nextInt();
				switch (menuP) {
				case 1:
					
					System.out.println("Ingrese el nombre de la refaccion");
					lectura = new Scanner(System.in);
					nombre_refaccion = lectura.nextLine();

					System.out.println("Ingrese la ubicacion");
					lectura = new Scanner(System.in);
					ubicacion = lectura.nextLine();

					System.out.println("Ingrese el tipo de refaccion");
					lectura = new Scanner(System.in);
					tipo_refaccion = lectura.nextLine();

					System.out.println("Ingrese el precio de la refaccion");
					lectura = new Scanner(System.in);
					precio_refaccion = lectura.nextFloat();
					
					System.out.println("Ingrese la cantidad comprada");
					lectura = new Scanner(System.in);
					cantidad = lectura.nextInt();
					System.out.println("se guardo con exito");
//------------------------ GUARDAR REGISTROS------------------------//
					//variable = new NOMBRE CLASE CON ATRIBUTPS 
					refaccion = new Refaccionaria(nombre_refaccion, ubicacion, tipo_refaccion, precio_refaccion, cantidad);
					imp.guardar(refaccion);
					System.out.println("se guardo correctamente la pieza " + refaccion.getNombre_refaccion());
					break;
//------------------------ MOSTRAR------------------------//
				case 2:
					imp.mostrar();
					break;
//------------------------BUSQUEDA POR NOMBRE------------------------//
				case 3:
					boolean bandera = false;
					
					System.out.println("Ingrese el nombre que desea buscar");
					lectura = new Scanner (System.in);
					nombre_refaccion = lectura.nextLine();
					bandera = true;
					imp.buscaNombre(nombre_refaccion);
					if(bandera)
					System.out.println("Ingrese el tipo de refaccion");
					lectura = new Scanner (System.in);
					tipo_refaccion = lectura.nextLine();
					imp.buscaTipo(tipo_refaccion);
					break;
//------------------------BUSQUEDA TIPO DE REFACCION ------------------------//
				case 4  :
					System.out.println("Ingrese el tipo de refaccion");
					lectura = new Scanner (System.in);
					tipo_refaccion = lectura.nextLine();
					imp.buscaTipo(tipo_refaccion);
					break;
					
//------------------------EDITAR POR INDICE  ------------------------//
				case 5:
					imp.MostrarIndiceNombre();
					System.out.println("ingrese el indice a editar");
					lectura = new Scanner (System.in);
					indice= lectura.nextInt();
					refaccion=imp.buscar(indice);
					System.out.println("se encontro lo que buscaba: "+ refaccion);
//-----------------------SUBMENU PARA EDITAR---------------------------------------------//
					do {
						System.out.println("Submenu para eidtar datos xD");
						System.out.println("1.-precio");
						System.out.println("2.- nombre");
						System.out.println("3.- ubicacion");
						System.out.println("4.-regresar al menu");
						lectura = new Scanner(System.in);
						subMenu = lectura.nextInt();

						switch (subMenu) {
						case 1:
							System.out.println("Ingrese el nuevo precio");
							lectura = new Scanner(System.in);
							precio_refaccion = lectura.nextInt();
							// actualización
							refaccion.setPrecio_refaccion(precio_refaccion);
							System.out.println("Se edito correctamente");
							break;
						case 2:
							System.out.println("ingerese el nuevo nombre");
							lectura = new Scanner(System.in);
							nombre_refaccion = lectura.nextLine();
							// actualizacion
							refaccion.setNombre_refaccion(nombre_refaccion);
							System.out.println("Se edito correctamente");
							break;
						case 3:
							System.out.println("ingerese la nueva ubicacion");
							lectura = new Scanner(System.in);
							ubicacion = lectura.nextLine();
							// actualizacion
							refaccion.setUbicacion(ubicacion);
							System.out.println("Se edito correctamente");
							break;
						case 4:
							break;

						}
					} while (subMenu < 3);
					
					break;
//------------------------ELIMINAR POR TIPO DE REFACCION ------------------------//
				case 6:
					System.out.println("Ingrese el tipo de producto a eliminar");
					lectura = new Scanner(System.in);
					tipo_refaccion = lectura.nextLine();
					imp.borraTipo(tipo_refaccion);
					break;
//-------------------GANANCIAS--------------------------------------------//				
					
				case 7:
					
					break;
					
				}
		 }while(menuP <7); //FIN LLAVE DO 
		
		
	}

}
