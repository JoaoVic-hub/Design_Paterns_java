package br.com.jv.ExemplosAbstractFactory;

import br.com.jv.ExemplosAbstractFactory.Factorys.AbstractFactory;
import br.com.jv.ExemplosAbstractFactory.Factorys.MacFactory;
import br.com.jv.ExemplosAbstractFactory.Factorys.WindowsFactory;

public class Main {
    public static Custom configuracao(){
        Custom custom;
        AbstractFactory factory;
        String SOname = System.getProperty("os.name").toLowerCase();
        if(SOname.contains("mac")){
            factory = new MacFactory();
        }else{
            factory = new WindowsFactory();
        }
        custom = new Custom(factory);
        return custom;
    }
    public static void main(String [] args){
        Custom custom = configuracao();
        custom.paint();
    }
}
