
class hexbin {
    public static void main(String[] args) {
        String hex = "ABC";

        int des = Integer.parseInt(hex, 16); // konversi heksadesiml ke desimal integer 
        String biner = Integer.toBinaryString(des); // konversi desimal integer ke biner
       
        System.out.println("bilangan heksadesimal: " + hex);
        System.out.println("makan biner dari heksadesimal tersbeut adalah " + biner);
    }
}