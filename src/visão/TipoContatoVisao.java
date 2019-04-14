
package visão;

import controle.TipoContatoControle;


public class TipoContatoVisao extends FormPadrao{
    
    // Método construtor
    public TipoContatoVisao(){
        setTitle("Cadastro de Tipo de Contato");
    }

    @Override
    public void inicializarComponentes() {
    //Inserir componentes aqui    
    }
    
    //Instâcia de Controle
    TipoContatoControle tcc = new TipoContatoControle();

    @Override
    public void salvarVisao() {
         //Inserir Comandos
         tcc.salvarControle(jtfId.getText(), jtfDescricao.getText());
    }
    
}
