
public class perulangan {
    public static void main(String[] args) {
        int bil = 2;
        int pangkat = 3;
        int hasil = 1;
        for(int i=1;i<=pangkat;i++){
            hasil = hasil * bil;
        }
        System.out.println(bil + "pangkat" + pangkat+","+hasil);
    }
}
