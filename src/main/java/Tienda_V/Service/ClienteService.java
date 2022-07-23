
package Tienda_V.Service;

import Tienda_V.domian.Cliente;

import java.util.List;




public interface ClienteService {
    public List<Cliente> getClientes();
    
    public Cliente getCliente(Cliente cliente);
    
    public void save (Cliente cliente);
    
    public void delete (Cliente cliente);
}
