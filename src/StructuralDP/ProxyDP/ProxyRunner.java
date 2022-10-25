package StructuralDP.ProxyDP;

public class ProxyRunner {
    public static void main(String[] args) {
        ProxyClass proxyClass1 = new ProxyClass("C:\\resim1.jpg");
        ProxyClass proxyClass2 = new ProxyClass("C:\\resim2.jpg");
        proxyClass1.showImage();
        proxyClass2.showImage();
    }
}
