package uniandes.edu.co.proyecto;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import uniandes.edu.co.proyecto.modelo.Hotel;
import uniandes.edu.co.proyecto.modelo.PlanConsumo;
import uniandes.edu.co.proyecto.modelo.TipoUsuario;
import uniandes.edu.co.proyecto.modelo.Usuario;
import uniandes.edu.co.proyecto.modelo.Habitacion;
import uniandes.edu.co.proyecto.modelo.CuentaConsumo;
import uniandes.edu.co.proyecto.modelo.Producto;
import uniandes.edu.co.proyecto.modelo.ProductoConsumido;

import uniandes.edu.co.proyecto.repositorio.HotelRepository;
import uniandes.edu.co.proyecto.repositorio.PlanConsumoRepository;
import uniandes.edu.co.proyecto.repositorio.UsuarioRepository;
import uniandes.edu.co.proyecto.repositorio.HabitacionRepository;
import uniandes.edu.co.proyecto.repositorio.CuentaConsumoRepository;
import uniandes.edu.co.proyecto.repositorio.ProductoRepository;
import uniandes.edu.co.proyecto.repositorio.ProductoConsumidoRepository;




import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
public class ProyectoApplication implements CommandLineRunner{

    @Autowired
    private PlanConsumoRepository planConsumoRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProyectoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Collection<PlanConsumo> planes_c = planConsumoRepository.darPlanConsumos();
        for (PlanConsumo h: planes_c) 
        {
            System.out.println(h);
        }
    }
}

/*
 * 
    @Autowired
	private UsuarioRepository usuarioRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<Usuario> items = usuarioRepository.darUsuarios();
		for (Usuario i: items) 
		{
			System.out.println(i);
		}
	}
 */

 /*
  * 
    @Autowired
	private HotelRepository hotelRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<Hotel> items = hotelRepository.darHoteles();
		for (Hotel i: items) 
		{
			System.out.println(i);
		}
	}
*/

/*
 * 
    @Autowired
	private HabitacionRepository habitacionRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<Habitacion> items = habitacionRepository.darHabitaciones();
		for (Habitacion i: items) 
		{
			System.out.println(i);
		}
	}
 */

 /*
  * 
    @Autowired
	private CuentaConsumoRepository cuentaConsumoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<CuentaConsumo> items = cuentaConsumoRepository.darCuentasConsumo();
		for (CuentaConsumo i: items) 
		{
			System.out.println(i);
		}
	}
  */

  /*
   * 
    @Autowired
	private ProductoRepository productoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<Producto> items = productoRepository.darProductos();
		for (Producto i: items) 
		{
			System.out.println(i);
		}
	}
   */

   /*
	* 
	@Autowired
	private ProductoConsumidoRepository productoConsumidoRepository;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Collection<ProductoConsumido> items = productoConsumidoRepository.darProductosConsumidos();
		for (ProductoConsumido i: items) 
		{
			System.out.println(i);
		}
	}
    */