package br.com.cursojsf;

import javax.persistence.Persistence;

public class TesteBanco {

	public static void main(String[] args) {
		
		Persistence.createEntityManagerFactory("cursojsf");

	}

}
