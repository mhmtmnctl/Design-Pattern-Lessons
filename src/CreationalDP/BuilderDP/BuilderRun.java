package CreationalDP.BuilderDP;

public class BuilderRun {
    public static void main(String[] args) {
        // bu uzun cözüm ve tavsiye edilmiyor,
        // 40 tane variable olsa yazmak zorlasir.
        Product product1 = new Product();
        product1.setId(12L);
        product1.setDescription("Descr");
        product1.setName("Name");
        product1.setPrice(100);
        System.out.println("***product1***");
        System.out.println(product1);

        //builder dp'de obje oluşturalım
        Product product2=new Product.ProductBuilder().id(12L).name("tv stand").description("sapphire oak").price(30).inStock(true).build();
        System.out.println("***product2***");
        System.out.println(product2);

        Product product3= new Product.ProductBuilder().id(13L).name("study desk").price(25).build();
        System.out.println("***product3***");
        System.out.println(product3);
    }
}
