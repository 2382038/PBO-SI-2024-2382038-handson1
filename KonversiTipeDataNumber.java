public class KonversiTipeDataNumber {
    public static void main(String[] args) {
        //widening
        short tipeDataShort = 10;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;

        //narrowing
        int tipeDataInteger2 = 10;
        byte tipeDataByte = (byte) tipeDataInteger2; //narrowing manual makanya ada (byte) yg dinamakan casting mengubah ukuran tipe data yang lebih besar ke tipe data ukuran yang lebih kecil.

        //number overflow
        int tipeDataInteger = 128;
        short tipeDataByteConverted = (byte) tipeDataInteger;
        System.out.println(tipeDataByteConverted);
    }
}
