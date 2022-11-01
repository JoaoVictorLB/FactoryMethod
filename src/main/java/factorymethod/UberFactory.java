package main.java.factorymethod;

public class UberFactory {
    public static IUber obterUber(String veiculo){
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("main.java.factorymethod.Uber" + veiculo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de Uber inexistente");
        }
        if (!(objeto instanceof IUber)) {
            throw new IllegalArgumentException("Serviço inválido");
        }
        return (IUber) objeto;
    }
}
