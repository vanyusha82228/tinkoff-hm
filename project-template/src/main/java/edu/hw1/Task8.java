package edu.hw1;

public class Task8 {
    private static final int KNIGHT_MOVEMENTS = 8; // Количество возможных ходов коня
    private static final int[] KNIGHT_DX = {-2, -1, 1, 2, 2, 1, -1, -2}; // Смещения по X для ходов коня
    private static final int[] KNIGHT_DY = {1, 2, 2, 1, -1, -2, -2, -1}; // Смещения по Y для ходов коня

    @SuppressWarnings("unused")
    private Task8() {
    }

    public static boolean knightBoardCapture(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Перебираем каждую клетку на доске
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Если встречаем коня, проверяем клетки, на которые он может пойти
                if (board[i][j] == 1) {
                    for (int k = 0; k < KNIGHT_MOVEMENTS; k++) {
                        int x = i + KNIGHT_DX[k];
                        int y = j + KNIGHT_DY[k];

                        // Проверяем, что клетка в пределах доски и не содержит другого коня
                        if (x >= 0 && x < rows && y >= 0 && y < cols && board[x][y] == 1) {
                            return false;
                        }
                    }
                }
            }
        }

        // Если не найдено пар коней, которые могли бы захватить друг друга, возвращаем true
        return true;
    }
}


