package br.com.jv.ExemplosAbstractFactory.Checkbox;

import br.com.jv.ExemplosAbstractFactory.Checkbox.Checkbox;

public class CheckboxMAC implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Checkbox do MAC inserido");
    }
}
