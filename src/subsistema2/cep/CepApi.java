package subsistema2.cep;

import design.pattern.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Natal";
    }
    public String recuperarEstado(String cep){
        return "RN";
    }
}
