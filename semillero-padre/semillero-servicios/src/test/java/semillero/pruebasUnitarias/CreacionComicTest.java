/**
 * CreacionComicTest.java
 */
package semillero.pruebasUnitarias;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.BeforeTest;

import com.hbt.semillero.dto.ComicDTO;
import com.hbt.semillero.enums.EstadoEnum;
import com.hbt.semillero.enums.TematicaEnum;

/**
 * <b>Descripción:<b> Clase que determina las pruebas unitarias para gestionar la creacion de comics
 * <b>Caso de Uso:<b> 
 * @author TAD
 * @version 
 */
public class CreacionComicTest {


	//Lista que almacena 10 comics para las pruebas
	private ArrayList<ComicDTO> ListaComicDTO= new ArrayList<ComicDTO>();
	
	
	/* 
	 * Metodo que crea 10 comics atraves de constructores y son agregados a la lista ListaComicDTO e inicializa el logger 
	 */
	
	@BeforeTest
	public void inicializar() {
		
		BigDecimal Precio = new BigDecimal("5000");		//Crea una variable BigDecimal para 
		LocalDate hoy = LocalDate.now();
		
		BasicConfigurator.configure(); //inicializa el logger con una configuracion basica
		
		ComicDTO CDTO1 = new ComicDTO(1L,"WatchMen","DC",TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL",144,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.ACTIVO,20);
		ComicDTO CDTO2 = new ComicDTO(2L,"Sandman","DC",TematicaEnum.BELICO,"Manga Shonen",200,Precio,"Dragon Garow Lee",true,hoy,EstadoEnum.INACTIVO,30);
		ComicDTO CDTO3= new ComicDTO(3L,"Maus","Reservoir books",TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL",144,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.ACTIVO,20);
		ComicDTO CDTO4= new ComicDTO(4L,"All-Start Superman","ecc",TematicaEnum.BELICO,"Manga Shonen",200,Precio,"Dragon Garow Lee",true,hoy,EstadoEnum.INACTIVO,30);
		ComicDTO CDTO5= new ComicDTO(5L,"V de Vendetta","ecc",TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL",144,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.ACTIVO,20);
		ComicDTO CDTO6= new ComicDTO(6L,"Contrato con Dios","Norma",TematicaEnum.BELICO,"Manga Shonen",200,Precio,"Dragon Garow Lee",true,hoy,EstadoEnum.ACTIVO,30);
		ComicDTO CDTO7= new ComicDTO(7L,"Akira","katsuhiro",TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL",144,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.INACTIVO,20);
		ComicDTO CDTO8= new ComicDTO(8L,"Dare_Devil","Marvel",TematicaEnum.BELICO,"Manga Shonen",200,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.ACTIVO,30);
		ComicDTO CDTO9= new ComicDTO(9L,"Desde el infierno","planeta deagostini",TematicaEnum.FANTASTICO,"BIBLIOTECA MARVEL",144,Precio,"Dragon Garow Lee",true,hoy,EstadoEnum.ACTIVO,20);
		ComicDTO CDTO10= new ComicDTO(10L,"Los surcos del Azar","pacor",TematicaEnum.BELICO,"Manga Shonen",200,Precio,"Dragon Garow Lee",false,hoy,EstadoEnum.INACTIVO,30);
		
		
		
		//se agrega los 10 comicDTO a la lista de ComicDTO 
		
		ListaComicDTO.add(CDTO1);
		ListaComicDTO.add(CDTO2);
		ListaComicDTO.add(CDTO3);
		ListaComicDTO.add(CDTO4);
		ListaComicDTO.add(CDTO5);
		ListaComicDTO.add(CDTO6);
		ListaComicDTO.add(CDTO7);
		ListaComicDTO.add(CDTO8);
		ListaComicDTO.add(CDTO9);
		ListaComicDTO.add(CDTO10);
		
		
	}

	/**
	 * Metodo encargado de retornar el valor del atributo ListaComicDTO
	 * @return El listaComicDTO asociado a la clase comicDTO
	 */
	public ArrayList<ComicDTO> getListaComicDTO() {
		return ListaComicDTO;
	}

	/**
	 * Metodo encargado de modificar el valor del atributo ListaComicDTO
	 * @param listaComicDTO El nuevo listaComicDTO a modificar.
	 */
	public void setListaComicDTO(ArrayList<ComicDTO> listaComicDTO) {
		ListaComicDTO = listaComicDTO;
	}
	
	/**
	 * Metodo que retorna los comics  Activos en una lista e imprime en consola todos los atributos de los comics activos
	 * */
	
	@SuppressWarnings("unused")
	private ArrayList<ComicDTO> ListaComicsActivos()
	{
		//Lista que almacena los ComicsActivos
		ArrayList<ComicDTO> ListaComicDTOActivos= new ArrayList<ComicDTO>();
		
		for(int i=0;i<ListaComicDTO.size();i++)
		{
			if(ListaComicDTO.get(i).getEstado().equals(EstadoEnum.ACTIVO))
				ListaComicDTOActivos.add(ListaComicDTO.get(i));
			System.out.println(ListaComicDTO.get(i).getAutores());
			System.out.println(ListaComicDTO.get(i).getColeccion());
			System.out.println(ListaComicDTO.get(i).getEditorial());
			System.out.println(ListaComicDTO.get(i).getEstado());
			System.out.println(ListaComicDTO.get(i).getNombre());
			System.out.println(ListaComicDTO.get(i).getTematica());
			System.out.println(ListaComicDTO.get(i).getCantidad());
			System.out.println(ListaComicDTO.get(i).getColor());
			System.out.println(ListaComicDTO.get(i).getFechaVenta());
			System.out.println(ListaComicDTO.get(i).getId());
			System.out.println(ListaComicDTO.get(i).getNumeroPagina());
			System.out.println(ListaComicDTO.get(i).getPrecio());
		
		}
		
		return ListaComicDTOActivos;
	}
	
	
	/**
	 * Metodo que retorna los comics  Inactivos en una lista
	 * */
	@SuppressWarnings("unused")
	private ArrayList<ComicDTO> ListaComicsInactivos() 
	{
		//Lista que almacena los Comics Inactivos
		ArrayList<ComicDTO> ListaComicDTOInactivos= new ArrayList<ComicDTO>();
		
		for(int i=0;i<ListaComicDTO.size();i++)
		{
			    if(ListaComicDTO.get(i).getEstado().equals(EstadoEnum.INACTIVO)) {}
				ListaComicDTOInactivos.add(ListaComicDTO.get(i));
			  
		}
		
		return ListaComicDTOInactivos;
	}
	
	/**
	 * Metodo para mostrar en pantalla el numero de comics activos e inactivos
	 * */
	
	@SuppressWarnings("unused")
	private void ImprimirConteo() throws Exception
	{
		try {
			
			for(int i =0; i<ListaComicDTO.size();i++)
			{
				ValidarComicActivo(ListaComicDTO.get(i));
		}
		
	}catch(Exception e)
		{
		System.out.println("Se ha detectado que de "+ ListaComicDTO.size()+" comics se encontraron que "+ListaComicsActivos().size()+"se encuentran activos y "+ListaComicsInactivos().size()
				
		+"inactivos. los comics inactivos son "		);
		for (int j=0;j<ListaComicsInactivos().size();j++)
		{  ListaComicsInactivos().get(j).getNombre();}
		}
	}
	
	
	/**
	 * Metodo que retorna TRUE si un comic esta ACTIVO de lo contrario retorna FALSE
	 * */
	public boolean ValidarComicActivo(ComicDTO Comic)
	{
		if(Comic.getEstado().equals(EstadoEnum.ACTIVO))
			return true;
		else return false;
		
	}
	
	
}
