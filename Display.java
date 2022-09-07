//import java.io.*;

public class Display{
    static char[][] printString(String str, int row, int col, char x){
        int len = str.length();
        char[][] res = new char [row][col*len + len];
        
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col*len + len ; j++){
                res[i][j] = ' ';
            }
        }
        for(int i = 0 ; i < len ; i++){
            char c = str.charAt(i);
            int startCol = (col + 1)*i;
            if(c == 'a'){
                for(int j = 1 ; j < col - 1 ; j++){
                    res[0][startCol + j] = x;
                }
                for(int j = 1 ; j < row ; j++){
                    res[j][startCol] = x;
                    res[j][startCol + col - 1] = x;
                }
                int mid = (row - 1)/2;
                for(int j = 1 ; j < col - 1 ; j++){
                    res[mid][startCol + j] = x;
                }
            }
            else if(c == 'e'){
                for(int j = 0 ; j < col ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                }
                int mid = (row - 1)/2;
                for(int j = 1 ; j < col - 1 ; j++){
                    res[mid][startCol + j] = x;
                }
            }
            else if(c == 'i'){
                int offset = (col - 1) % 2;
                for(int j = 0 ; j < col - offset ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                int mid = (col - 1)/2;
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol + mid] = x;
                }
            }
            else if(c == 'o'){
                for(int j = 1 ; j < col - 1 ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                    res[j][startCol + col - 1] = x;
                }
            }
            else if(c == 'u'){
                for(int j = 0 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                    res[j][startCol + col - 1] = x;
                }
                for(int j = 1 ; j < col - 1 ; j++){
                    res[row - 1][startCol + j] = x;
                }
            }
            else if(c == 'b'){
                for(int j = 0 ; j < col - 1 ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                    res[j][startCol + col - 1] = x;
                }
                int mid = (row - 1)/2;
                for(int j = 1 ; j < col - 1 ; j++){
                    res[mid][startCol + j] = x;
                }
                res[mid][startCol + col - 1] = ' ';
            }
            else if(c == 'c'){
                for(int j = 1 ; j < col ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                }
            }
            else if(c == 'd'){
                for(int j = 0 ; j < col - 1 ; j++){
                    res[0][startCol + j] = x;
                    res[row - 1][startCol + j] = x;
                }
                for(int j = 1 ; j < row - 1 ; j++){
                    res[j][startCol] = x;
                    res[j][startCol + col - 1] = x;
                }
            }
            else if(c == 'f'){
                for(int j = 0 ; j < col ; j++){
                    res[0][startCol + j] = x;
                }
                for(int j = 1 ; j < row ; j++){
                    res[j][startCol] = x;
                }
                int mid = (row - 1)/2;
                for(int j = 1 ; j < col - 1 ; j++){
                    res[mid][startCol + j] = x;
                }
            }
            else{
                System.out.println("Invalid character: " + c);
            }
        }
        return res;
    }
    public static void main(String[] args){
        int row = 6, col = 6;
        char disp = '#';
        String str = "";
        for(int i = 0; i < args.length; i++){
            String cur = args[i];
            if(cur.equals("-m")){
                col = Integer.parseInt(args[i + 1]);
                i++;
            }
            else if(cur.equals("-n")){
                row = Integer.parseInt(args[i + 1]);
                i++;
            }
            else if(cur.equals("-c")){
                disp = args[i + 1].charAt(0);
                i++;
            }
            else{
                str = args[i];
            }
        }
        int len = str.length();
        char[][] ans = printString(str, row, col, disp);
        for (int i = 0 ; i < row ; i++) {
            for (int j = 0 ; j < col*len + len; j++) {
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

    }
}