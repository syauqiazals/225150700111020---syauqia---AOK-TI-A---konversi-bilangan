
class binhex {
    public static void main(String[] args) {
        
        String biner="110000";
        int desimal=Integer.parseInt(biner,2);
        String hex = Integer.toHexString(desimal);

        System.out.println("bilangan biner : " + biner);
        System.out.println("maka bilangan hexadesimal dari biner tersebut adalah " + hex);

        String biner2="1111111";
        int desimal2=Integer.parseInt(biner2,2);
        String hex2 = Integer.toHexString(desimal2);

        System.out.println("\nbilangan biner : " + biner2);
        System.out.println("maka bilangan hexadesimal dari biner tersebut adalah " + hex2);
        
    }
}