package br.com.jv.ExemplosAbstractFactory.Factorys;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;
import br.com.jv.ExemplosAbstractFactory.Buttons.ButtonWindows;
import br.com.jv.ExemplosAbstractFactory.Checkbox.Checkbox;
import br.com.jv.ExemplosAbstractFactory.Checkbox.CheckboxWindows;

public class WindowsFactory implements AbstractFactory{
    @Override
    public Button createButton() {

        return new ButtonWindows();
    }

    @Override
    public Checkbox createCheckbox() {
        return new CheckboxWindows();
    }
}
