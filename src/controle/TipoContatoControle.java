
package controle;

import deo.TipoContatoDao;
import interfaces.InterfaceControle;
import modelo.TipoContatoModelo;


public class TipoContatoControle implements InterfaceControle{
    
    TipoContatoModelo tcm = new TipoContatoModelo();
    TipoContatoDao tcd = new TipoContatoDao();
    
    @Override
    public void salvarControle(Object... valor) {
        if ("".equals(valor[0])){ 
            tcm.setId(0);
        } else {
            tcm.setId((int)valor[0]);
        }    
        tcm.setDescricao( (String)valor[1]);
        
        
        //Enviar as informações para DAO
        tcd.salvarDao(tcm);
    
    }

    @Override
    public void excluirControle(int id) {
    
    }

    @Override
    public void carregarComboBox() {
    
    }
    
}
