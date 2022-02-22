package com.shazasoft.JPA_DemoProject;

//import jakarta.persistence.*;

import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManagerFactory;

import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence-unit");
       EntityManager em = emf.createEntityManager();
       
       Students std = em.find(Students.class, 2);
       
       System.out.println(std);
    }
}
