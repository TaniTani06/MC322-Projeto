package Proj_2;
public class Atleta extends Pessoa {
    private int id;
    private String posicao;
    private String ra;
    
    public Atleta(String nome, String cpf, Entidade entidade, String foto) {
    	super(nome, cpf, entidade, foto);
    }
    
    public Atleta(String nome, String cpf, Entidade entidade, String foto, int id, String posicao, String ra) {
        super(nome, cpf, entidade, foto);
        this.id = id;
        this.posicao = posicao;
        this.ra = ra;
    }
    
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}

	@Override
    public String obterNome() {
        return nome;
    }
    
    @Override
    public String obterCpf() {
        return cpf;
    }
    
    @Override
    public Entidade obterEntidade() {
        return entidade;
    }
    
    @Override
    public String obterFoto() {
        return foto;
    }
    
    @Override
    public String toString() {
        return "\n###############\n" +
            "Nome: " + nome + "\n" +
            "CPF: " + cpf + "\n" +
            "Entidade: " + entidade.getNome() + "\n" + // Chama toString() da entidade para obter apenas o nome
            "Foto: " + foto + "\n" +
            "ID: " + id + "\n" +
            "Posição: " + posicao + "\n" +
            "RA: " + ra + "\n" +
            "###############\n";
    }

}