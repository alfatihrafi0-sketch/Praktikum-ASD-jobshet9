import java.util.Scanner;

public class suratDemo18 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Karena StackSurat ada di dalam stackSurat18
        stackSurat18 outer = new stackSurat18();
        stackSurat18.StackSurat stack = outer.new StackSurat(5);

        int pilih;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Terima Surat Izin");
            System.out.println("2. Proses Surat Izin");
            System.out.println("3. Lihat Surat Terakhir");
            System.out.println("4. Cari Surat");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: ");
                    String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: ");
                    String nama = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): ");
                    char jenis = scan.next().charAt(0);
                    System.out.print("Durasi: ");
                    int durasi = scan.nextInt();
                    scan.nextLine();

                    surat18 srt = new surat18(id, nama, kelas, jenis, durasi);
                    stack.push(srt);
                    break;

                case 2:
                    surat18 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Memproses surat:");
                        System.out.println("Nama: " + proses.namaMahasiswa);
                        System.out.println("ID: " + proses.idSurat);
                    }
                    break;

                case 3:
                    surat18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat terakhir:");
                        System.out.println("Nama: " + lihat.namaMahasiswa);
                        System.out.println("ID: " + lihat.idSurat);
                    } else {
                        System.out.println("Tidak ada surat");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String cari = scan.nextLine();
                    stack.cariSurat(cari);
                    break;

                case 0:
                    System.out.println("Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilih != 0);

        scan.close();
    }
}