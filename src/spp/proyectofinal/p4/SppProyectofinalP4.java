/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyectofinal.p4;
import javax.swing.JOptionPane;
import java.util.Scanner;
/*Equipo:
*Lisdy Rohmann A00513659
*Alejandro García A0161137
*Kevin Hinojosa A01411383
*Mariela Ramones A01441449
*Catalina Domínguez A01411583
*/
public class SppProyectofinalP4 {

    /**
     * @param args the command line arguments
     */
        public static void main(String[] args) {
    int []inv=new int[222];  
        int []venta=new int [444];
        int x=0;                            
        for (int w=0;w<232;w++){    
        x=menu();  
        switch(x){
            case 0:
                JOptionPane.showMessageDialog(null,"Descripción del producto");
                String men= "Escribe el precio del producto";
                String nombre=nomInv();              
                inv[w]=inventario(men);
                int u=w+1;
                JOptionPane.showMessageDialog(null,"El nombre del producto es "+nombre+ "La clave del producto es "+u);
                break;
            case 1:
                int n;
                int y;               
                String clave="Escribe la clave del producto ";
                n=inventario(clave);
                
                y=inv[n-1];
                if(y>0){
                   venta[w]=n; 
                }else{
                    JOptionPane.showMessageDialog(null, "La clave ingresada no existe");
                } 
                sumTot(inv, venta);
                break;
            case 2:
                System.exit(0);
            } 
        } 
    }
    
    public static void sumTot(int[]inv,int[] ventas){
    int sum=0;
    int n=0;
    int g;
    for (int i=0;i<ventas.length;i++){
        if (ventas[i]>0){
            g=ventas[i]-1;
          n=inv[g];
            sum=sum+n;
        }else{
            sum=sum;
        }         
    }
    
    JOptionPane.showMessageDialog(null,"La suma total de la venta es  "+sum+ " ");       
    }
    
    public static int menu(){
    String[]opciones ={"Inventario","Vender","Salir"};
    int x=JOptionPane.showOptionDialog(null,"Selecciona una opción",null,JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,null);
    return x;
    }
    
    public static int inventario(String men){
    int n=0;    
    Scanner kb=new Scanner(System.in);
    boolean flag;
        do{
            try{
                   String x=JOptionPane.showInputDialog(null,men);
                   n=new Integer (x);
                    flag=false;
            }catch (Exception er){
                JOptionPane.showMessageDialog(null,"Inténtalo de nuevo");
                kb.nextLine();
                flag=true;
        }
            }while(flag);      
            return n;
    }
    
    public static String nomInv(){
    String x=JOptionPane.showInputDialog(null,"Escribe el nombre del producto");
    return x;
    } 
}
