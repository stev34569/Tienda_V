
package Tienda_V.Service;

import Tienda_V.domian.Categoria;


import java.util.List;


public interface CategoriaService {
    public List<Categoria> getCategorias(boolean activo);

    public Categoria getCategoria(Categoria categoria);

    public void save(Categoria categoria);

    public void delete(Categoria categoria);
}
