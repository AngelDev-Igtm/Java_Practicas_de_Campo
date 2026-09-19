package producto;
import java.util.ArrayList;
import java.util.List;

public class ProductoController {
    List<Productos> productos = new ArrayList<>();
    
    public void agregarProducto(Productos p, Productos X, Productos f, Productos r) {
        productos.add(p);   
        productos.add(X);
        productos.add(f);   
        productos.add(r);   
    }
    
    public void listarProductos() {
        for (int i = 0; i < productos.size(); i++) {    
            System.out.println(productos.get(i));        
        }
    }
    
    public void BuscarProducto(){
        
    }
}