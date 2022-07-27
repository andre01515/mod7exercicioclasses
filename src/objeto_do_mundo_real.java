public class objeto_do_mundo_real {

    public static void main(String args[]) {
        Objeto objeto = new Objeto();
        objeto.setCodigo(1);;
        objeto.setNome("Fone de ouvido");
        objeto.setLocaldefabricacao("Zona franca de manaus");



        System.out.println(objeto.getCodigo());
        System.out.println(objeto.getNome());
        System.out.println(objeto.getLocaldefabricacao());
    }
}
