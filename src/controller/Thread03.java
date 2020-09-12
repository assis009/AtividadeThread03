package controller;

public class Thread03 extends Thread{
	
	int [] vet = new int [15];
			
	public Thread03(int [] vet) {
		
		this.vet = vet;
		
	}
	
	public void run() {
		
		int soma =0;
		
		for(int i: vet){
			
			soma+=vet[i];//somando os valores do vetor 
		}
		
		System.out.println("#"+getId()+" a soma da matriz é: " + soma);
	}
}