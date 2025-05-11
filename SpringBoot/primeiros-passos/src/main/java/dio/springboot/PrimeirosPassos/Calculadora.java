package dio.springboot.PrimeirosPassos;

import org.springframework.stereotype.Component;

@Component // avisando ao Spring que Calculadora é um componente
public class Calculadora {

  public int somar(int numero1,int numero2){
    return numero1 + numero2;
  }

}