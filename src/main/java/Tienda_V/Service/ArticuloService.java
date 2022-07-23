
package Tienda_V.Service;


import Tienda_V.domian.Articulo;

import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulos(boolean activo);
    
    public Articulo getArticulo(Articulo articulo);
    
    public void save (Articulo articulo);
    
    public void delete (Articulo articulo);
}
