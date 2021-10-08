package POO;

public class PessoaJuridica {
	
	private String razaoSocial;
	private String cnpj;
	
	
	public String getRazaoSocial ()
	{
		return razaoSocial;
		
	}

	public void setRazaoSocial (String _razaoSocial)
	{
		this.razaoSocial=_razaoSocial;
	}
	
	public String getCNPJ ()
	{
		return cnpj;
		
	}

	public void setCNPJ (String _cnpj)
	{
		this.cnpj=_cnpj;
	}
}
