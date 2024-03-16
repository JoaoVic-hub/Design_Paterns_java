package br.com.jv.ExemplosAbstractFactory.Factorys;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;

import br.com.jv.ExemplosAbstractFactory.Checkbox.Checkbox;

public interface AbstractFactory {
    Button createButton();
    Checkbox createCheckbox();
}
