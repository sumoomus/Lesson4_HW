public class Hometask4_1 {
    public static void main(String[] args) {

        char[][] board = new char[8][8];

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                if ((row + col) % 2 == 0) {
                    board[row][col] = 'W';
                } else {
                    board[row][col] = 'B';
                }
            }
        }

        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {
                System.out.print(board[row][col] + " ");
            }
            System.out.println();
        }
    }
}

