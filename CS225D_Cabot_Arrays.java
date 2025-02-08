//Michael Andres S, Cabot
//CS2D - OOP
//Second Array

class Main {
    public static void main(String[] args) {
        
        int x = 2;
        int y = 4;
        
        int[][] arr = new int[x][y];
        
        int it = 0;
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                arr[i][j] = it;
                it++;
            }
        }
        
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) 
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}