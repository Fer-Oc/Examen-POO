import java.util.ArrayList;
import java.util.List;

public class implementacion implements Metodos {
	List<Refaccionaria> listaRef = new ArrayList<Refaccionaria>();

	@Override
	public void guardar(Refaccionaria obj) {
		// TODO Auto-generated method stub
		
		listaRef.add(obj);
		boolean nombre=false;
		for(Refaccionaria ref : listaRef) {
			if (ref.getNombre_refaccion().equals(obj.getNombre_refaccion())) {
				nombre = true;
			}
			
		}
		if(nombre==true) {
			System.out.println("ese nombre ya existe");
		}else {
			listaRef.add(obj);
			
		}
		

	}

	@Override
	public void mostrar() {
		// TODO Auto-generated method stub
		System.out.println(listaRef);
	}

	@Override
	public void editar(int indice, Refaccionaria obj) {
		// TODO Auto-generated method stub
		listaRef.set(indice, obj);
	}

	@Override
	public void eliminar(int indice) {
		// TODO Auto-generated method stub
		listaRef.remove(indice);

	}

	@Override
	public Refaccionaria buscar(int indice) {
		// TODO Auto-generated method stub
		return listaRef.get(indice);
	}

	public void MostrarIndiceNombre() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < listaRef.size(); i++) {
			System.out.println("[" + i + "]" + listaRef.get(i).getNombre_refaccion());
		}
	}

	public void MostrarIndiceTipoRef() {
		System.out.println("Registros en la lista");
		for (int i = 0; i < listaRef.size(); i++) {
			System.out.println("[" + i + "]" + listaRef.get(i).getTipo_refaccion());
		}
	}

	// -------------------Busqueda Por Nombre-------------------------------//

	public void buscaNombre(String nombrePieza) {
		// ------------------------------FOR NORMAL----------------------//
		for (int i = 0; i < listaRef.size(); i++) {
			if (listaRef.get(i).getNombre_refaccion().equals(nombrePieza)) {
				System.out.println("\n La refaccion buscada es: " + listaRef.get(i).getNombre_refaccion());
			}
		}

	}

	public void buscaTipo(String tipo_ref) {
//------------------------------FOR NORMAL----------------------//
		for (int i = 0; i < listaRef.size(); i++) {
			if (listaRef.get(i).getTipo_refaccion().equals(tipo_ref)) {
				System.out.println("\n La refaccion buscada es: " + listaRef.get(i).getTipo_refaccion());
			}
		}

	}

//------------------------BORRAR POR TIPO DE REFACCION ------------------------//
	public void borraTipo(String tipo_ref) {
//------------------------------FOR NORMAL----------------------//
		for (int i = 0; i < listaRef.size(); i++) {
			if (listaRef.get(i).getTipo_refaccion().equals(tipo_ref)) {
				System.out.println("\n La refaccion buscada es: " + listaRef.remove(i).getTipo_refaccion());
			}
		}

	}
	

}
