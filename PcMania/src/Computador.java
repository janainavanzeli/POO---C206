package PcMania;
public class Computador {
    //atributos
    public String marca;
    public float preco;
    public SistemaOperacional so;
    public HarwareBasico[] hb;
    public MemoriaUSB usb;

    public Computador() {
        // Declaração dos objetos
        so = new SistemaOperacional();
        hb = new HarwareBasico[3];
        for (int i = 0; i < hb.length; i++) { // for para declarar cada um dos campos do array hb []
            hb[i] = new HardwareBasico();
        }
    }
    public void mostraPCConfigs() {
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Hardware: ");

        for (int i = 0; i < hb.length; i++) {
            System.out.prinln(" \n -> " + hb[i].nome + " " + hb[i].capacidade);
        }
        System.out.prinln(" ");
        System.out.prinln("Sistema Operacional " + so.nome + " (" + so.tipo + " bits)");
        System.out.prinln("Acompanha " usb.nome + " " + usb.capacidade + "Gb");
    }
    public void addMemoriaUSB(MemoriaUSB musb) {

        usb = musb;
    }
}
