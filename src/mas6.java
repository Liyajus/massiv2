public class mas6 {
    public static void main(String[] args) {
        int [][] twoDimArray = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};//объ€вили массив и заполнили его элементами
        for (int i = 0; i < 3; i++) {  //идЄм по строкам
            for (int j = 0; j < 4; j++) {//идЄм по столбцам
                System.out.print(" " + twoDimArray[i][j] + " "); //вывод элемента
            }
            System.out.println();//перенос строки ради визуального сохранени€ табличной формы
        }
    }
}
