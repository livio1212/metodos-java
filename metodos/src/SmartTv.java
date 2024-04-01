public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void diminuirCanal(){
        canal--;
    }



    public void aumentarCanal(){
        canal++;
    }


    public void aumentarVolume(){
        System.out.println("Aumentando volume para: " + volume);
       volume = volume + 1;
    volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo volume para: " + volume);
        volume--;
    }

    public void ligar(){
        ligada=true;

      }

      public void desligada(){
        ligada=false; 
      }

      
}
