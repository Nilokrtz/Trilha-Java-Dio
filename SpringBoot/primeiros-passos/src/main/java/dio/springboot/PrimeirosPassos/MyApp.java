package dio.springboot.PrimeirosPassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component // cria um componente, uma entidade que não necessita instanciar
public class MyApp implements CommandLineRunner{
    @Autowired // fazer com que a classe MyApp entenda que Calculadora abaixo é um componente e não precisa ser instanciado
    private Calculadora calculadora;
    @Override
    public void run(String... args) throws Exception {
        System.out.println("O resultado é " + calculadora.somar(2, 8));
    }
}
