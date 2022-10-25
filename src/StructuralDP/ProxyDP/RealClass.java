package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator {
    private String fullPath;

    public RealClass(String fullPath) {
        this.fullPath = fullPath;
    }

    @Override
    public void showImage() {
        System.out.println("Resim gösteriliyor " + fullPath);
    }

    public void getName(){
        System.out.println("...");
    }
    public void getLName(){
        System.out.println("...");
    }



}
