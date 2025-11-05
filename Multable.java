class Multable{
    public static void main(String args []){
        final int row = 10;
        final int column = 5;
        
        int product[][] = new int [row] [column];

        System.out.println("Multiplication of table = ");
        System.out.println();

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                product[i -1][j-1] = i * j;
                System.out.print("" + product[i-1][j-1] +"\t");
            }

            System.out.println();
        }
    }
}