package view;

import controller.Thread01;

public class Main {
	
	public static void main(String args[]){
		
		int [][] mat = new int [3][5];//matriz de 3x5 
		int [] vet = new int [15]; // vetor de 15 que vai receber os valores da matriz 
		int a=0;
		
		for(int l=0; l < 3; l++){
			for(int c=0; c < 5; c++){
				mat[l][c] = 1+(int)(Math.random()*10);//colocando valores aleatorios na matriz 
			}
		}
		
		for(int l=0; l < 3; l++){
			for(int c=0; c < 5; c++){
				vet[a] = mat[l][c];//passando os valores da matriz para o vetor 
				a++;
			}
		}
		
		//instanciando as Threads 
		Thread thread01 = new Thread01(vet);
		Thread thread02 = new Thread01(vet);
		Thread thread03 = new Thread01(vet);
		
		thread01.start();
		thread02.start();
		thread03.start();
		
	}
}
