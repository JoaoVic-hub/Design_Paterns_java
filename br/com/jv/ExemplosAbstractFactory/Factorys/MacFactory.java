package br.com.jv.ExemplosAbstractFactory.Factorys;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;
import br.com.jv.ExemplosAbstractFactory.Buttons.ButtonMAC;
import br.com.jv.ExemplosAbstractFactory.Checkbox.Checkbox;
import br.com.jv.ExemplosAbstractFactory.Checkbox.CheckboxMAC;


public class MacFactory implements AbstractFactory{

    @Override
    public Button createButton() {
        return new ButtonMAC();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxMAC();
    }
}
