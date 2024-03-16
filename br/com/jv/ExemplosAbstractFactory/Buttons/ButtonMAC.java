package br.com.jv.ExemplosAbstractFactory.Buttons;

import br.com.jv.ExemplosAbstractFactory.Buttons.Button;

public class ButtonMAC implements Button {

    @Override
    public void paint() {
        System.out.println("Botão do MAC criado");
    }
}
