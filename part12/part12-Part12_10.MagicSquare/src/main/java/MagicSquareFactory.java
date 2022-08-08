
public class MagicSquareFactory {

    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        
        int row = 0;
        int column = square.getWidth() / 2;
        int previousRow = 0;
        int previousColumn = 0;
        for(int i = 1; i<=size*size; i++){

            square.placeValue(column, row, i);
            previousRow = row;
            previousColumn = column;
            row--;
            column++;
            
            if(row < 0){
                row = size -1;
            }
            if(column >= size){
                column = 0;
            }
            if(square.readValue(column, row) > 0){
                row = previousRow;
                column = previousColumn;
                if(row >= size) row = 0;
                else row++;
            }
        }
        
        return square;
    }
    

}
