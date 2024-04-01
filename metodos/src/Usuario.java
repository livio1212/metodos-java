public class Usuario {
    public static void main(String[] args) throws Exception {
    

      SmartTv smartTv = new SmartTv();

      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.diminuirVolume();
      smartTv.aumentarVolume();

      smartTv.mudarCanal(13);
      System.out.println("Canal atual" + smartTv.canal);
    
      System.out.println("Volume atual: " + smartTv.volume);
      

      System.out.println("Tv ligada? " + smartTv.ligada);
      System.out.println("Canal atual: " + smartTv.canal);
      System.out.println("volume atual: " + smartTv.volume);

      smartTv.ligar ();

      System.out.println("novo status --> Tv ligada? " + smartTv.ligada);


      smartTv.desligada(); 

      System.out.println("novo status --> Tv ligada? " + smartTv.ligada);

    

    }
}
