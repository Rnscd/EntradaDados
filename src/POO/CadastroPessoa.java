package POO;

import javax.swing.JOptionPane;

public class CadastroPessoa {
	
	public static void main (String args[])
	{
		int opr;
		
		Pessoa p1 = new Pessoa();
		PessoaFisica pf1 = new PessoaFisica();
		PessoaJuridica pj1 = new PessoaJuridica();
		Funcionario f1 = new Funcionario();
		
		//Seleção das opções de entrada
		
		opr = Integer.parseInt(JOptionPane.showInputDialog
				("Digite 1 - para cadastrar Pessoa Fisica"
		         +"\nDigite 2 - para cadastrar Pessoa Juridica"+
						"\nDigite 3 - para cadastrar Funcionario"+
		         "\nDigite qualquer outro numero para finalizar"
				 ));
		
		if (opr==1)
		{//Define entrada de dados pessoa Física
			
			p1.setNome(JOptionPane.showInputDialog("Digite o nome:"));
			pf1.setRG(JOptionPane.showInputDialog ("Digite o RG:"));
			pf1.setCPF(JOptionPane.showInputDialog ("Digite o CPF:"));
			p1.setEmail(JOptionPane.showInputDialog("Digite o email:"));
			p1.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
			
			JOptionPane.showMessageDialog(null,
					"As informações digitadas foram->"+
					"\nNome:"+p1.getNome()+
					"\nRG:"+pf1.getRG()+
					"\nCPF:"+pf1.getCPF()+
					"\nEmail:"+p1.getEmail()+
					"\nEndereço:"+p1.getEndereco());
					
			
		}
		
		if (opr==2)
		{
			pj1.setRazaoSocial(JOptionPane.showInputDialog ("Digite o nome da empresa:"));
			pj1.setCNPJ(JOptionPane.showInputDialog("Digite o CNPJ:"));
			p1.setEmail(JOptionPane.showInputDialog("Digite o Email:"));
			p1.setEndereco(JOptionPane.showInputDialog("Digite o Endereço:"));
			
			JOptionPane.showMessageDialog(null,
					"As informações digitadas foram->"+
					"\nNome da Empresa:"+pj1.getRazaoSocial()+
					"\nCNPJ:"+pj1.getCNPJ()+
					"\nEmail:"+p1.getEmail()+
					"\nEndereço:"+p1.getEndereco());
			
		} else if (opr==3)
		{
			p1.setNome(JOptionPane.showInputDialog("Digite o nome:"));
			pf1.setRG(JOptionPane.showInputDialog ("Digite o RG:"));
			pf1.setCPF(JOptionPane.showInputDialog ("Digite o CPF:"));
			p1.setEmail(JOptionPane.showInputDialog("Digite o email:"));
			p1.setEndereco(JOptionPane.showInputDialog("Digite o endereço:"));
			f1.setMatricula(JOptionPane.showInputDialog("Digite a matricula:"));
			f1.setFuncao(JOptionPane.showInputDialog("Digite o Cargo:"));
			
			JOptionPane.showMessageDialog(null,
					"As informações digitadas foram->"+
					"\nNome:"+p1.getNome()+
					"\nRG:"+pf1.getRG()+
					"\nCPF:"+pf1.getCPF()+
					"\nEmail:"+p1.getEmail()+
					"\nEndereço:"+p1.getEndereco()+
					"\nMatricula:"+f1.getMatricula()+
					"\nCargo:"+f1.getFuncao());
			
		}
		else {
			JOptionPane.showMessageDialog(null, "Obrigado por informar os dados!!");
		}
		
	}

}
