/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoeleve;

/**
 *
 * @author SR LANDRINE
 */
public class Eleve {
    
    private String nom;
    private String postnom;
    private String prenom;
    private String promotion;
    private int age;
    private int matricule;
    
    
    public Eleve(String nom,String prenom,String postnom,String promotion,int age,int mat){
        this.nom = nom;
        this.prenom = prenom;
        this.postnom = postnom;
        this.promotion = promotion;
        this.age = age;
        this.matricule = mat;
    }
    public void direNom(){
        System.out.println(" nom de l eleve c est: " + this.nom + "\n postnom: " + this.postnom +"\n prenom: "+ this.prenom +" \n promotion: "+ this.promotion + "\n age: "+ this.age +"\n Mon matricul est  " + this.matricule );
    }
    
    
}
