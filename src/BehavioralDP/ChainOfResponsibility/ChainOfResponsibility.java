package BehavioralDP.ChainOfResponsibility;

public class ChainOfResponsibility {
    public static void main(String[] args) {
        ChainOfResponsibility cor = new ChainOfResponsibility();
        cor.chainOfResponsibilityDemo();
    }

    void chainOfResponsibilityDemo() {
        Approver genelMudur = new GenelMudur();
        Approver mudur = new Mudur(genelMudur);
        Approver memur = new Memur(mudur);

        System.out.println("Kredi verme limitleri : ");
        System.out.println("Memur için maksimum :  <100");
        System.out.println("Müdür için maksimum :  <500");
        System.out.println("Genel Müdür için sınır yok");
        System.out.println("*************************");
        System.out.println("Müşterinin memurdan talebi : 50");
        memur.approveLoan(50);
        System.out.println("Müşterinin memurdan talebi : 450");
        memur.approveLoan(450);
        System.out.println("Müşterinin memurdan talebi : 1050");
        memur.approveLoan(1050);
    }
}