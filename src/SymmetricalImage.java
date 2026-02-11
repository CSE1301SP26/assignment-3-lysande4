import java.util.Scanner;
public class SymmetricalImage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter rows:");
        int n = in.nextInt();
        System.out.println("enter collumn:");
        int m = in.nextInt();
        char[][] star = new char[n][m];

        int StarNum = ((n * m)/4);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                star[i][j] = ' ';
            }
        }

        for (int i = 0; i < ((n * m)/4); i++){
            int row = (int)(Math.random() * n);
            int col = (int)(Math.random() * m);
            int mirrorCol = m - 1 - col;

            star[row][col] = '*';
            star[row][mirrorCol] = '*';
        }

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();

        
    }

}
}

