//package util;
//
//import com.thoughtworks.xstream.XStream;
//import com.thoughtworks.xstream.io.xml.StaxDriver;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//
//public class DataXML {
//    public static bacaData(){
//        Universitas univ = new Universitas();
//        XStream xstream = new XStream(new StaxDriver());
//
//        FileInputStream f = null;
//
//        try {
//            f = new FileInputStream("universitas6.xml");
//            int isi; // untuk menyimpan kode angka ASCII yang dibaca
//            // dari file
//            char c;
//            String sxml = "";
//            // membaca file per karakter
//            while ((isi = f.read()) != -1) {
//                c = (char) isi;
//                sxml = sxml + c;
////                System.out.print(c);
////                System.out.println(sxml);
//
//            }
////            System.out.println(sxml);
//            univ = (Universitas) xstream.fromXML(sxml);
//
//        } catch (Exception e) {
//            System.out.println("Perhatianc: " + e.getMessage());
//        } finally {
//            if (f != null) {
//                try {
//                    f.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//
//        }
//        System.out.println(univ);
//    }
//}
//    }
//}
