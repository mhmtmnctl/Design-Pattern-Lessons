package StructuralDP.FacadeDP;

public class SHAEncryptor {

    public void encrypt(String text,String key, boolean type){
        if (type){
            System.out.println("<SHA> "+text+ key+ "</SHA>");//şifrelenmiş gibi düşünelim.
        }
        else {
            System.out.println("<SHA> " +key+ text+ "</SHA>");
        }

    }
}
