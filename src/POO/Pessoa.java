package POO;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome ="Sandra";
	private String email;
	private String endereco;

			
	public String getNome()
	{
		return nome;
	}
	public void setNome (String _nome)
	{this.nome=_nome;}
	
	public String getEmail ()
	{return email;}
	public void setEmail (String _email)
	{this.email=_email;}
	
	public String getEndereco ()
	{return endereco;}
	public void setEndereco (String _endereco)
	{this.endereco=_endereco;}
	
	public void Mostrar()
	{
		JOptionPane.showMessageDialog(null, "Nome:"+nome+
				"\nEmail:"+email+"\nEndereco:"+endereco);
	}
	
}
