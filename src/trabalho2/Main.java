package trabalho2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		int num[] = new int[20]; //Array 
		int opcao;
		String ent;
		int menor = 0;
		int maior = 0;
		int posMaior = 0; //Antes do switch-case
		int primos = 0;
		
		
		for (int i = 0; i < 20; i++) {
			ent = JOptionPane.showInputDialog("Insira um número:");
			num[i] = Integer.parseInt(ent);
			
			if (i == 0) {
				menor = num[i];
				
			} else if (num[i] < menor) {
				menor = num[i];
			}
			
			if (num[i] != 0 && num[i] != 1) {
				for (int cont = num[i] - 1; cont > 1; cont--) {
					if (num[i] % cont != 0) {
						if (cont == 2) {
							primos ++;
						}
					}
				}
			}
			
			
		}
		
		do {
			ent = JOptionPane.showInputDialog("\n\t\tMenu\n\t1.Mostrar\n"
					+ "\t2.Inverter\n"
					+ "\t3.Ordenar Crescente\n"
					+ "\t4.Ordenar Decrescente\n"
					+ "\t5.Fatorial Menor\n"
					+ "\t6.Posição Maior\n"
					+ "\t7.Quantidade de Primos\n\n"
					+ "\t9.Vazar");
			opcao = Integer.parseInt(ent);
			
			switch (opcao) {
			case 1:
				for (int i = 0; i < 20; i++) {
					System.out.println(num[i]);
				}
				break;
			case 2:
				for (int i = 0; i < 10; i++) { //10 para inverter uma vez só
					int aux = num[i];
					num[i] = num[19 -i];
					num[19 - i] = aux;
				}
				break;
			case 3:
				for (int i =1; i <20; i++) {
					for (int j = 0; j < i; j++) {
						if (num[i] < num[j]) {
							int aux = num[i];
							num[i] = num[j];
							num[j] = aux;
						}
					}
				}
				break;
			case 4:
				for (int i =1; i <20; i++) {
					for (int j = 0; j < i; j++) {
						if (num[i] > num[j]) {
							int aux = num[i];
							num[i] = num[j];
							num[j] = aux;
						}
					}
				} 
				break;
			case 5:
				int fatorial = menor;
				for (int i = menor - 1; i > 1; i --) {
					fatorial *= i; //Igual fatorial = fatorial *i;
				} 
				if (menor == 0) {
					fatorial = 1;
				}
				System.out.println(fatorial);
				break;
			case 6: //Posição altera com mudança da ordem do array
				for (int i = 0; i < 20; i++) {
					if (i == 0) {
						maior = num[i];
						posMaior = i;
					} else if (num[i] > maior) {
						maior = num[i];
						posMaior = i;
					}
				}
				
				System.out.println(posMaior);
				break;
			case 7:
				System.out.println(primos);
				break;
			}
		} while (opcao != 9);

	}

}
