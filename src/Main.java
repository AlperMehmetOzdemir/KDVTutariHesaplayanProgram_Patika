import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vergisizFiyat;
        float vergiliFiyat, vergiTutarı;

        float kdvOranıBinLiraAltı = 0.18f;
        float kdvOranıBinLiraÜstü = 0.08f;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ürün fiyatını giriniz:");
        vergisizFiyat = scanner.nextInt();

        // Vergi oranın belirle ve miktarın hesapla
        vergiTutarı = vergisizFiyat > 1000 ? vergisizFiyat * kdvOranıBinLiraÜstü
                : vergisizFiyat * kdvOranıBinLiraAltı;
        vergiliFiyat = vergisizFiyat + vergiTutarı;

        System.out.println("KDV'siz Fiyat = " + vergisizFiyat);
        System.out.println("KDV'li Fiyat = " + vergiliFiyat);
        System.out.println("KDV tutarı = " + vergiTutarı);

    }
}
