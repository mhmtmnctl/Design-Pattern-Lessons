package StructuralDP.FacadeDP;

public class CustomEncryptor {

    public static void main(String[] args) {

        String text= "Content";

        //kötü yol
        AESEncryptor aesEncryptor = new AESEncryptor();
        aesEncryptor.encrypt(text);

        MD5Encryptor md5Encryptor = new MD5Encryptor();
        md5Encryptor.encrypt(text,"KEY");

        SHAEncryptor shaEncryptor = new SHAEncryptor();
        shaEncryptor.encrypt(text,"KEY",true);

        //kötü yol bitti...

        //yeni yöntem
        System.out.println("******************************");
        EncryptorFacade encryptorFacade = new EncryptorFacade();
        encryptorFacade.encrypt(text,EncryptorFacade.EncType.AES);



    }
}
