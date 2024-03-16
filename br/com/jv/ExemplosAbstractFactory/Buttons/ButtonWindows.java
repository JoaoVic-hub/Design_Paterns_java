package br.com.jv.ExemplosAbstractFactory.Buttons;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;

public class ButtonWindows implements Button {
    @Override
    public void paint() {
        System.out.println("Botão do windows criado");
    }
}
