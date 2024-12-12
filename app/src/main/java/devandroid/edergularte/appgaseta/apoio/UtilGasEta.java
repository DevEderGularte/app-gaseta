package devandroid.edergularte.appgaseta.apoio;

public class UtilGasEta {
    public void metodoEstatico() {

    }
    public static void metotoNaoEstatico(){

    }

    public static String mensagem(){
        return "Qualquer Mensagem...";
    }
    public static String calcularMelhorOpcao(double gasolina, double etanol){
        double precoIdeal = gasolina * 0.70;
        String mensagemDeRetorno;
        if(etanol<=precoIdeal){
            mensagemDeRetorno = "Abasteça com Etanol";
        }else{
            mensagemDeRetorno = "Abasteça com Gasolina";
        }
        return mensagemDeRetorno;
    }
}
