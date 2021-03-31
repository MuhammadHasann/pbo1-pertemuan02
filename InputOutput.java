import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner inputan = new Scanner(System.in);
  String nama;
  int jumlahSks;
  double IPK;

  System.out.print("Masukkan nama anda: ");
  nama = inputan.nextLine();

  System.out.print("Masukkan jumlah SKS yang sudah ditempuh: ");
  jumlahSks = inputan.nextInt();

  System.out.print("Masukkan IPK sementara: ");
  IPK = inputan.nextDouble();
  
  System.out.println("Hai, "+nama);
  System.out.println("sks yang sudah anda tempuh : "+jumlahSks);
  System.out.println("Nilai : "+IPK);

  double jumlah = IPK * jumlahSks;
  System.out.println("Total Nilai = "+jumlah);
  
 }
}