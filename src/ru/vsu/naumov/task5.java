/*
29.	h >= 5, h — нечетное (в примере ниже: h = 7)
*     *
|\   /|
| \ / |
|  *  |
| / \ |
|/   \|
*     *
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner size = new Scanner(System.in);
        int s = size.nextInt(); //размер
        int level = 0; //уровень(строка)
        krai(s);
        for (int f = 0; f < (s-3)/2; f++){
            firstMajorPart(s,level);
            level++; //поднимает уровень(увел пробелов)
        }
        middle(s);
        for (int f = 0; f < (s-3)/2; f++){
            secondMajorPart(s,level);
            level--; //опускается уровень(умен пробелов)
        }
        krai(s);
    }

    private static void krai(int s){
        System.out.print('*');
        for(int i = 0; i < s - 2; ++i){ // s-2 кол-во пробелов
            System.out.print(' ');
        }
        System.out.println('*');
    }

    private static void middle(int s){
        System.out.print('|');
        for(int i = 0; i < (s - 2); ++i){
            if(i == s/2-1){ // серединный i
                System.out.print('*');
            } else{
                System.out.print(' ');
            }
        }
        System.out.println('|');
    }
    private static void firstMajorPart(int s, int level) {
        System.out.print('|');
        for (int i = 0; i < level; ++i) { // для пробелов между "|" и "/ or \"
            System.out.print(' ');
        }
        System.out.print('\\');
        for (int i = 0; i < s - 4 - 2 * level ; ++i) { //4 чёрточки, level кол-во пробелов между | и / \
            System.out.print(' ');// пробелы
        }
        System.out.print('/');
        for (int i = 0; i < level; ++i) {
            System.out.print(' ');
        }
        System.out.println('|');
    }
    private static void secondMajorPart(int s, int level){
        System.out.print('|');
        for (int i = 0; i < level - 1; ++i) {
            System.out.print(' ');
        }
        System.out.print('/');
        for (int i = 0; i < s - 4 - 2 * (level - 1); ++i) {
            System.out.print(' ');
        }
        System.out.print('\\');
        for (int i = 0; i < level - 1; ++i) {
            System.out.print(' ');
        }
        System.out.println('|');
    }


}