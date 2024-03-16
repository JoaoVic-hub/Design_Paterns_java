package br.com.jv.ExemplosAbstractFactory;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;
import br.com.jv.ExemplosAbstractFactory.Checkbox.Checkbox;
import br.com.jv.ExemplosAbstractFactory.Factorys.AbstractFactory;

public class Custom {
    private Button button;
    private Checkbox checkbox;
    public Custom(AbstractFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }
    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
