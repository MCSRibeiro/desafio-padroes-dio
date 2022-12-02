public class App {
    public static void main(String[] args) {
        
        Comportamento sono = new ComportamentoSono();
        Comportamento fome = new ComportamentoFome();
        Comportamento brincalhao = new ComportamentoBrincalhao();
        Comportamento irritado = new ComportamentoIrritado();
        Comportamento amigavel = new ComportamentoAmigavel();

        Gato gato = new Gato();
        gato.setComportamento(brincalhao);
        gato.miar();
        gato.miar();

        gato.setComportamento(fome);
        gato.miar();
        gato.miar();
        gato.miar();

        gato.setComportamento(amigavel);
        gato.miar();

        gato.setComportamento(sono);
        gato.miar();
        gato.miar();

        gato.setComportamento(irritado);
        gato.miar();
    }
}
