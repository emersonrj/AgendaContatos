
package visão;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class CidadeVisao extends FormPadrao{
    // Método Construtor.
    JLabel jluf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    JTextField jtfCep;
    
    public CidadeVisao(){
        setTitle("Cadastro de Cidade");
    }

    @Override
    public void inicializarComponentes() {
        jluf = new JLabel("UF");
        jluf.setBounds(15, 60, 50, 25);
        jpnFormulario.add(jluf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(15, 80, 50, 25);
        jpnFormulario.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(90, 60, 100, 25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(90, 80, 150, 25);
        jpnFormulario.add(jtfCep);
    }

    @Override
    public void salvarVisao() {

    }
       
    }
    

