import java.util.Scanner;
public class RataNilai25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        float rataNilai, totalNilai = 0;
        int i=1, j=1, nilai;

    while (i <= 5) {
        totalNilai=0;
        System.out.println("Input Nilai Mahasiswa ke 1");
        for (j=1;j<=5;j++) {
            System.out.print("Nilai ke-" +j + " = ");
            nilai=sc.nextInt();
            totalNilai+=nilai;
        }
        rataNilai = totalNilai/5;
        System.out.println("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
        i++;
    }

    }
}
