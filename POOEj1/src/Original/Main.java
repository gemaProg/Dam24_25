package Original;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Mono mono1 = new Mono("Copito",18,100,false,"Gorila",20,"Luna");
        Mono mono2 = new Mono("Amedio",3,8,false,"Chimpancé",3,"Marco");
        Mono mono3 = new Mono();
        Jirafa jirafa = new Jirafa();

        System.out.println(mono1.getCuidador());
        System.out.println(mono2.getCuidador());
        System.out.println(mono3.getCuidador());
        System.out.println(mono3);
        mono1.setCuidador("Javi");
        //System.out.println(mono1);
        Mono mono = EntradaSalida.dameMono();
        System.out.println(mono);
        Mono []lista = new Mono[10];
        for (int i = 0; i < lista.length; i++) {
            lista[i]= new Mono();
            //lista[i] = new Original.Mono(Original.Nombres.nombres[(int)(Math.random()*Original.Nombres.cuidadores.length)],(int)(Math.random()*50),100,false,"Gorila",20,"Luna");
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]);
        }
    }
}