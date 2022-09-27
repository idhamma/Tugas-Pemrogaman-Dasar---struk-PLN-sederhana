import java.util.Scanner;

public class Latihan22sep {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nama, kelurahan;
        int awal_kwh,akhir_kwh,biayabeban,ppj,tarif,pemakaian,persenppj,bayar,ppj1;

        System.out.println("\n\nProgam penghitung pemakaian listrik sederhana");
        System.out.printf("%-32s%c ", "Masukan nama",':');
        nama = scan.nextLine();
        System.out.printf("%-32s%c " ,"Kelurahan",':');
        kelurahan = scan.nextLine();
        System.out.printf("%-32s%c ","Masukan posisi awal Kwh Meter",':');
        awal_kwh = scan.nextInt();
        System.out.printf("%-32s%c ","Masukan posisi akhir Kwh Meter",':');
        akhir_kwh = scan.nextInt();
        System.out.printf("%-32s%c ","Masukan biaya beban saat ini",':');
        biayabeban = scan.nextInt();
        System.out.printf("%-32s%c ","Masukan PPj (dalam persen)",':');
        persenppj = scan.nextInt();

        tarif = (akhir_kwh - awal_kwh)*biayabeban ;
        ppj1 = tarif/10;
        pemakaian = akhir_kwh - awal_kwh;
        bayar = tarif + ppj1;

        System.out.println("============PLN Java============");
        System.out.printf("%-32s%c %s", "Nama",':',nama);
        System.out.printf("\n%-32s%c %s" ,"Kelurahan", ':',kelurahan);
        System.out.printf("\n%-32s%c %d %s","Pemakaian bulan ini",':',pemakaian,"Kwh Meter");
        System.out.printf("\n%-32s%c %s%d%s","Tarif listrik",':',"Rp",tarif, ",-");
        System.out.printf("\n%-32s%c %s%d%s" ,"ppj 10%",':',"Rp",ppj1,",-");
        System.out.printf("\n%-32s%c %s%d%s","Total bayar",':',"Rp",bayar,"-");
        System.out.println("\n================================");

    }
}
