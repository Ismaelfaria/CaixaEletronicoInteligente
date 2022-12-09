package exercicios1617;

import java.util.Scanner;

public class Lojadeartigos {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int r1=1;
		do {
		System.out.println("---CAIXA ELETRONICO---");
		System.out.println("---LOJA TABAJARA---\n");
		
		int cont= 0;
		double r=0;
		double tot=0;
		double tr=0;
		do {
			cont++;
			System.out.print("- Produto " + cont + ": R$ ");
			double val = scan.nextDouble();
			tot = tot + val;
			r = val;
		}while(r > 0);
		
		System.out.println("-Total: R$ "+tot);
		
		System.out.print("-Dinheiro: R$ ");
		double ent = scan.nextDouble();
		tr= ent - tot;
		if(tr < 0.02)
		tr=0;
		System.out.println("-Troco: R$ "+ tr);
		
		System.out.println("NOVA COMPRA...\n");
		
		}while(r1>0);
	}

}
