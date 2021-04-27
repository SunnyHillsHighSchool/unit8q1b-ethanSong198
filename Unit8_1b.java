public class Unit8_1a
{
  public int [] [] modifyRows (int [] [] array)
 { 
   for(int r = 0; r < array.length; r++){
     for(int c = 0; c < array[0].length; c++){
          if(r == 1 ||r % 2 == 1){
               array[r][c] = array [r-1][c];
          }
     }
}
return array;
      }
    }
 