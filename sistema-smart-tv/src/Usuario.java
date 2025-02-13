public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println("Canal atual : " + smartTv.canal);
        smartTv.mudarCanal(23);
        System.out.println("Canal atual : " + smartTv.canal);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual : " + smartTv.volume);

        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.canal);
        System.out.println("Volume atual : " + smartTv.volume);

        smartTv.ligarTv();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligarTv();
        System.out.println("Novo status -> TV ligada ? " + smartTv.ligada);
    }
}
