/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pt.uma.ctest.arq.ficha2;

/**
 *
 * @author Turma A
 */
public class ArrayUtilities {
    public static String toString(int[] a){
        int i;
        String frase ="";
        for(i=0;i<a.length-1;i++){
            frase+=a[i]+",";
        }
        frase+=a[i];
        return frase;
    }
    public static int maximumOf(int[] a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
    public static int minimumOf(int[] a){
        int min=a[0];
        for(int i=1;i<a.length;i++){
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }
   public static int[] copyOf(int[] a){
        int[] array=new int[a.length];
        for(int i =0;i<a.length;i++){
            array[i]=a[i];
        }
        return array;
    }
    public static boolean contains(int n,int[] a){
        for(int i=0;i<a.length;i++){
            if(a[i]==n)
                return true;
        }
        return false;
    }
    public static boolean containsDuplicates( int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++)
            if(a[i]==a[j]);
                return true;
        }
        return false;
    }
    public static int indexOf(int a){
        int[] array={1,4,67,2,78,2,7,3,5};
        if(a>array.length){
            return -1;
        }
        return array[a];
    }
    public static int[] add(int n,int[] a){
        int[] array=new int[a.length+1];
        int i;
        for(i=0;i<a.length;i++){
            array[i]=a[i];
        }
        array[i]=n;
        return array;
    }
   public static int[] remove(int n,int[] a){
        if(contains(n,a)){
            int l=0;
            int[] res=new int[a.length-1];
            for(int i=0;i<a.length;i++){
                if(a[i]!=n){
                    res[l]=a[i];
                    l++;
                }
            }
            return res;
        }
        return a;
    }
}
