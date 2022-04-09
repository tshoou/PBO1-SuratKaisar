/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suratkaisar;

/**
 *
 * @author tuffa
 */
import java.util.Scanner;
public class SuratKaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String masukkan = scan.nextLine();
        int nilai = scan.nextInt();
        
        kata(masukkan,nilai);
    }
    public static void kata(String masukkan, int nilai){
        char kata;
        for ( int i = 0; i < masukkan.length(); i++ ) {
            kata = masukkan.charAt(i);
            if ( kata>='a'  && kata<='z') {
                kata += nilai;
                if ( kata > 'z') {
                    kata = (char)(kata+'a'-'z'-1);
                }
            } else if (kata>='A' && kata<='Z') {
                kata += nilai;
                if ( kata > 'Z') {
                    kata = (char)(kata+'A'-'Z'-1);
                    
                }
            }
            
            System.out.print(kata);
        }
        
    }
}