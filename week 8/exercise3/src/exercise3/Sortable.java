/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise3;

/**
 *
 * @author lenovo
 */
abstract class Sortable {
    public abstract int compare(Sortable b);
    public static void shell_sort(Sortable[] a){
        int n = a.length;
        for(int gap=n/2;0<gap;gap/=2){
            for(int i=gap;i<n;i+=1){
                Sortable temp = a[i];
                
                int j;
                for(j=i;j>=gap&&a[j-gap].compare(temp)<0;j-=gap){
                    a[j]=a[j-gap];
                }
                a[j]=temp;
            }
        }
    }
}
